import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class BudgetTrackerTest {

    //Valid Value Test Case for User 1
    @Test
    public void BT_U1_V1() {
        // Create sample Budget objects
        List<Budget> budgets = new ArrayList<>();
        budgets.add(new Budget(1, "Food", 500, 100));
        budgets.add(new Budget(1, "Utilities", 200, 50));
        budgets.add(new Budget(2, "Housing", 1000, 0));
        budgets.add(new Budget(1, "Entertainment", 100, 20));
        budgets.add(new Budget(2, "Misc", 40, 33));
        budgets.add(new Budget(2, "Transportation", 150, 85));
        
        // Create sample Transaction objects
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "Food", 500));
        transactions.add(new Transaction(2, "Transportation", 25));
        transactions.add(new Transaction(2, "Housing", 880));
        transactions.add(new Transaction(1, "Utilities", 150));
        transactions.add(new Transaction(2, "Misc", 68));
        transactions.add(new Transaction(1, "Entertainment", 15));
        
        // Create BudgetTracker object
        BudgetTracker budgetTracker = new BudgetTracker(budgets, transactions);
        
        //Call function
        double exceededAmount = budgetTracker.checkBudgetExceeded(1);
        
        // Assert that the result is equal to the correct value
        assertEquals(100, exceededAmount, 0.0);
    }

    //Invalid Upper + 1 Test Case for User 1
    @Test
    public void BT_U1_I1() {
        // Create sample Budget objects
        List<Budget> budgets = new ArrayList<>();
        budgets.add(new Budget(1, "Food", 500, 100));
        budgets.add(new Budget(1, "Utilities", 200, 50));
        budgets.add(new Budget(2, "Housing", 1000, 0));
        budgets.add(new Budget(1, "Entertainment", 100, 20));
        budgets.add(new Budget(2, "Misc", 40, 33));
        budgets.add(new Budget(2, "Transportation", 150, 85));
        
        // Create sample Transaction objects
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "Food", 500));
        transactions.add(new Transaction(2, "Transportation", 25));
        transactions.add(new Transaction(2, "Housing", 880));
        transactions.add(new Transaction(1, "Utilities", 150));
        transactions.add(new Transaction(2, "Misc", 68));
        transactions.add(new Transaction(1, "Entertainment", 15));
        
        // Create BudgetTracker object
        BudgetTracker budgetTracker = new BudgetTracker(budgets, transactions);
        
        //Call function
        double exceededAmount = budgetTracker.checkBudgetExceeded(1);
        
        // Assert that the result is not equal to the incorrect value
        assertNotEquals(101, exceededAmount, 0.0);
    }

    //Invalid Lower - 1 Test Case for User 1
    @Test
    public void BT_U1_I2() {
        // Create sample Budget objects
        List<Budget> budgets = new ArrayList<>();
        budgets.add(new Budget(1, "Food", 500, 100));
        budgets.add(new Budget(1, "Utilities", 200, 50));
        budgets.add(new Budget(2, "Housing", 1000, 0));
        budgets.add(new Budget(1, "Entertainment", 100, 20));
        budgets.add(new Budget(2, "Misc", 40, 33));
        budgets.add(new Budget(2, "Transportation", 150, 85));
        
        // Create sample Transaction objects
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "Food", 500));
        transactions.add(new Transaction(2, "Transportation", 25));
        transactions.add(new Transaction(2, "Housing", 880));
        transactions.add(new Transaction(1, "Utilities", 150));
        transactions.add(new Transaction(2, "Misc", 68));
        transactions.add(new Transaction(1, "Entertainment", 15));
        
        // Create BudgetTracker object
        BudgetTracker budgetTracker = new BudgetTracker(budgets, transactions);
        
        //Call function
        double exceededAmount = budgetTracker.checkBudgetExceeded(1);
        
        // Assert that the result is not equal to the incorrect value
        assertNotEquals(99, exceededAmount, 0.0);
    }

    //Valid Test Case for User 2
    @Test
    public void BT_U2_V1() {
        // Create sample Budget objects
        List<Budget> budgets = new ArrayList<>();
        budgets.add(new Budget(1, "Food", 500, 100));
        budgets.add(new Budget(1, "Utilities", 200, 50));
        budgets.add(new Budget(2, "Housing", 1000, 0));
        budgets.add(new Budget(1, "Entertainment", 100, 20));
        budgets.add(new Budget(2, "Misc", 40, 33));
        budgets.add(new Budget(2, "Transportation", 150, 85));
        
        // Create sample Transaction objects
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "Food", 500));
        transactions.add(new Transaction(2, "Transportation", 25));
        transactions.add(new Transaction(2, "Housing", 880));
        transactions.add(new Transaction(1, "Utilities", 150));
        transactions.add(new Transaction(2, "Misc", 68));
        transactions.add(new Transaction(1, "Entertainment", 15));
        
        // Create BudgetTracker object
        BudgetTracker budgetTracker = new BudgetTracker(budgets, transactions);
        
        //Call function
        double exceededAmount = budgetTracker.checkBudgetExceeded(2);
        
        // Assert that the result is equal to the correct value
        assertEquals(61, exceededAmount, 0.0);
    }

    //Invalid Upper + 1 Test Case for User 2
    @Test
    public void BT_U2_I1() {
        // Create sample Budget objects
        List<Budget> budgets = new ArrayList<>();
        budgets.add(new Budget(1, "Food", 500, 100));
        budgets.add(new Budget(1, "Utilities", 200, 50));
        budgets.add(new Budget(2, "Housing", 1000, 0));
        budgets.add(new Budget(1, "Entertainment", 100, 20));
        budgets.add(new Budget(2, "Misc", 40, 33));
        budgets.add(new Budget(2, "Transportation", 150, 85));
        
        // Create sample Transaction objects
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "Food", 500));
        transactions.add(new Transaction(2, "Transportation", 25));
        transactions.add(new Transaction(2, "Housing", 880));
        transactions.add(new Transaction(1, "Utilities", 150));
        transactions.add(new Transaction(2, "Misc", 68));
        transactions.add(new Transaction(1, "Entertainment", 15));
        
        // Create BudgetTracker object
        BudgetTracker budgetTracker = new BudgetTracker(budgets, transactions);
        
        //Call function
        double exceededAmount = budgetTracker.checkBudgetExceeded(2);
        
        // Assert that the result is not equal to the incorrect value
        assertNotEquals(62, exceededAmount, 0.0);
    }

    //Invalid Lower - 1 Test Case for User 2
    @Test
    public void BT_U2_I2() {
        // Create sample Budget objects
        List<Budget> budgets = new ArrayList<>();
        budgets.add(new Budget(1, "Food", 500, 100));
        budgets.add(new Budget(1, "Utilities", 200, 50));
        budgets.add(new Budget(2, "Housing", 1000, 0));
        budgets.add(new Budget(1, "Entertainment", 100, 20));
        budgets.add(new Budget(2, "Misc", 40, 33));
        budgets.add(new Budget(2, "Transportation", 150, 85));
        
        // Create sample Transaction objects
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "Food", 500));
        transactions.add(new Transaction(2, "Transportation", 25));
        transactions.add(new Transaction(2, "Housing", 880));
        transactions.add(new Transaction(1, "Utilities", 150));
        transactions.add(new Transaction(2, "Misc", 68));
        transactions.add(new Transaction(1, "Entertainment", 15));
        
        // Create BudgetTracker object
        BudgetTracker budgetTracker = new BudgetTracker(budgets, transactions);
        
        //Call function
        double exceededAmount = budgetTracker.checkBudgetExceeded(2);
        
        // Assert that the result is not equal to the incorrect value
        assertNotEquals(60, exceededAmount, 0.0);
    }
}