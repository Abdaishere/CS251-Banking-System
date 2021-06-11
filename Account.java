package banking.system;
/**
 * To maintain data of each account in the bank.
 * 
 * @author abdallah mohamad abdellatif El_belkasy
 * @version 1.2
 */
public class Account {
    /**
     * Balance of the Account
     */
    private int balance_;

    /**
     * ID of the Account
     */
    private int accountNumber_;

    /**
     * Default constructor
     */
    public Account() {
        this.accountNumber_ = 0;
        this.balance_ = 0;
    }

    /**
     * constructor with Balance and ID
     *
     * @param balance       The balance
     * @param accountNumber The account number
     */
    public Account(int balance, int accountNumber) {
        this.accountNumber_ = accountNumber;
        this.balance_ = balance;
    }

    /**
     * Set the Balance of the Account
     *
     * @param balance The new value of the balance of the account
     */
    public void setBalance(int balance) {
        this.balance_ = balance;
    }

    /**
     * Set the Account number of the Account
     *
     * @param account_number The new account number
     */
    public void setAccount_number(int account_number) {
        this.accountNumber_ = account_number;
    }

    /**
     * Get the Balance of the Account
     *
     * @return integer with the balance of the account
     */
    public int getBalance() {
        return balance_;
    }

    /**
     * Get the Account number of the Account
     *
     * @return integer with account number
     */
    public int getAccount_number() {
        return accountNumber_;
    }

    /**
     * Override the method toString ( ) inherited from class Object to make it return a
     * meaningful string representation of the account information.
     *
     * @return String of the account information
     */
    @Override
    public String toString() {
        return "The Account " + this.accountNumber_ + " has a balance of  " + this.getBalance() + "\n";
    }

    /**
     * Take money from the account
     * To withdraw, enough balance should be available.
     *
     * @param val The value you want to withdraw
     * @return true of the operation was successful false otherwise
     */
    public boolean withdraw(int val) {
        if (val > balance_)
            return false;
        balance_ -= val;
        return true;
    }

    /**
     * Put money in the account
     *
     * @param val The value you want to deposit
     */
    public void deposit(int val) {
        this.balance_ += val;
    }

    /**
     * This is the main class to test class Account. With two accounts of two types and
     * tests all the functions created in them.
     *
     * @param args main argument
     */

    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new SpecialAccount(44, 55555);

        // For Account a1
        System.out.println(a1.toString());
        a1.setAccount_number(11111);
        a1.setBalance(999999);
        System.out.println("ID :" + a1.getAccount_number());
        System.out.println("balance :" + a1.getBalance());
        a1.deposit(111);
        System.out.println("balance :" + a1.getBalance());
        a1.withdraw(1111);
        System.out.println("balance :" + a1.getBalance());

        // For Special Account a2
        System.out.println(a2.toString());
        a2.withdraw(550);
        System.out.println(a2.toString());
        a2.withdraw(550);
        System.out.println(a2.toString());

    }
}

