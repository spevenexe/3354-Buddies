import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BudgetTracker {
    // Mock database tables (in-memory representation)
    private List<Budget> budgets;
    private List<Transaction> transactions;

    public BudgetTracker(List<Budget> budgets, List<Transaction> transactions) {
        this.budgets = budgets;
        this.transactions = transactions;
    }

    public double checkBudgetExceeded(int userId) {
        double totalExceededAmount = 0;

        // Map to store current amount for each budget category
        Map<String, Double> currentAmountMap = new HashMap<>();

        // Find all unique budget categories for the given user
        for (Budget budget : budgets) {
            if (budget.getUserId() == userId) {
                currentAmountMap.put(budget.getCategoryName(), budget.getCurrentAmount());
            }
        }

        // Calculate current amount for each budget category based on transactions
        for (Transaction transaction : transactions) {
            if (transaction.getUserId() == userId && currentAmountMap.containsKey(transaction.getCategoryName())) {
                double currentAmount = currentAmountMap.get(transaction.getCategoryName());
                currentAmount += transaction.getTransaction();
                currentAmountMap.put(transaction.getCategoryName(), currentAmount);
            }
        }

        // Check if any budget category is exceeded and calculate total exceeded amount
        for (Budget budget : budgets) {
            if (budget.getUserId() == userId && currentAmountMap.containsKey(budget.getCategoryName())) {
                double currentAmount = currentAmountMap.get(budget.getCategoryName());
                if (currentAmount > budget.getBudgetLimit()) {
                    totalExceededAmount += (currentAmount - budget.getBudgetLimit());
                }
            }
        }

        return totalExceededAmount;
    }
}