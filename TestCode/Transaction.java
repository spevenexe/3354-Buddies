public class Transaction {
    private int userId;
    private String categoryName;
    private double transaction;

    public Transaction(int userId, String categoryName, double transaction) {
        this.userId = userId;
        this.categoryName = categoryName;
        this.transaction = transaction;
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

    public double getTransaction() {
        return transaction;
    }

    public void setTransaction(double transaction) {
        if (transaction < 0) {
            throw new IllegalArgumentException("Invalid transaction amount: " + transaction); 
        }
        this.transaction = transaction;
    }
}