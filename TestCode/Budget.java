public class Budget {
    private int userId;
    private String categoryName;
    private double budgetLimit;
    private double currentAmount;

    public Budget(int userId, String categoryName, double budgetLimit, double currentAmount) {
        this.userId = userId;
        this.categoryName = categoryName;
        this.budgetLimit = budgetLimit;
        this.currentAmount = currentAmount;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getBudgetLimit() {
        return budgetLimit;
    }

    public void setBudgetLimit(double budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        if (currentAmount < 0) {
            throw new IllegalArgumentException("Invalid current amount: " + currentAmount);
        }
        this.currentAmount = currentAmount;
    }
}