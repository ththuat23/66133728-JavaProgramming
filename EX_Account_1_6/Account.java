package EX_Account_1_6;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    // Constructor 1
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor 2
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Thêm tiền
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Trừ tiền
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Chuyển tiền sang account khác
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString
    public String toString() {
        return "Account[id=" + id +
               ",name=" + name +
               ",balance=" + balance + "]";
    }
}