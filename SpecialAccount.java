package banking.system;
/**
 * To maintain data of each Special account in the bank.
 *
 * @author abdallah mohamad abdellatif El_belkasy
 * @version 1.0
 */
public class SpecialAccount extends Account {

    /**
     * Default constructor
     */
    public SpecialAccount() {
    }

    /**
     * constructor with Balance and ID
     *
     * @param b The Balance
     * @param a The Account Number
     */
    public SpecialAccount(int b, int a) {
        super(b, a);
    }


    /**
     * Take money from the account
     * To withdraw, enough balance should be available and your balance can reach -1000.
     *
     * @param val The value you want to withdraw
     * @return true of the operation was successful false otherwise
     */
    @Override
    public boolean withdraw(int val) {
        if (-1000 > this.getBalance() - val)
            return false;
        this.setBalance(this.getBalance() - val);
        return true;
    }
}
