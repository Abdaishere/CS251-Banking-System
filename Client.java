package banking.system;

/**
 *  To maintain clients data in bank
 * @author Ahmed ragab eissa elsayed
 */
public class Client {
    /**
     * name of the client
     */
    private String name_;
    /**
     * national id for client
     */
    private int nationalid_;
    /**
     * address of client
     */
    private String address_;

    /**
     * account of client
     */
    private Account account_;

    /**
     * phone number of client
     */
    private int phone_;

    /**
     * Default constructor for Client
     */
    public Client() {
        this.name_ = "";
        this.nationalid_ = 0;
        this.address_ = "";
        this.account_ = null;
        this.phone_ = 0;
    }

    /**
     * constructor with client information
     *
     * @param name       name of the client
     * @param nationalid the National ID of the client
     * @param address    the address of the client
     * @param account    the account of the client
     * @param phone      the phone number of the client
     */
    public Client(String name, int nationalid, String address, Account account, int phone) {
        this.name_ = name;
        this.nationalid_ = nationalid;
        this.address_ = address;
        this.account_ = account;
        this.phone_ = phone;
    }

    //setters for each attribute

    /**
     * Sets the client's Address
     *
     * @param address the Address of the client
     */
    public void setAddress(String address) {
        this.address_ = address;
    }

    /**
     * Sets the name of the client
     *
     * @param name the name of the client
     */
    public void setName(String name) {
        this.name_ = name;
    }

    /**
     * Sets the National ID of the client
     *
     * @param nationalid the National ID of the client
     */
    public void setNationalid(int nationalid) {
        this.nationalid_ = nationalid;
    }

    /**
     * Sets an account of the client
     *
     * @param account the account of the client
     */
    public void setAccount(Account account) {
        this.account_ = account;

    }

    /**
     * Sets a special Account for the client
     *
     * @param account the account of the client
     */
    public void setSpecialAccount(Account account) {
        this.account_ = account;
    }

    /**
     * Setting phone number of the client
     *
     * @param phone the phone number of the client
     */
    public void setPhone(int phone) {
        this.phone_ = phone;
    }

    //getters for each attributes

    /**
     * gets the name of the client
     *
     * @return String of the client's name
     */
    public String getName() {
        return name_;
    }

    /**
     * gets the National ID of the client
     *
     * @return integer with his national ID
     */
    public int getNationalid() {
        return nationalid_;
    }

    /**
     * gets the Address of the client
     *
     * @return String of the client's address
     */
    public String getAddress() {
        return address_;
    }

    /**
     * set the Commercial ID
     * @param commercialID the Commercial ID entered
     */
    public void setCommercialID(int commercialID) {}

    /**
     * get the Commercial ID
     * @return integer with the Commercial ID
     */
    public int getCommercialID() {
        return 0;
    }

    /**
     * gets the account of the client
     *
     * @return the account of the client
     */
    public Account getAccount() {
        return account_;
    }

    /**
     * gets the phone number of the client
     *
     * @return the phone number of the client
     */
    public int getPhone() {
        return phone_;
    }

    /**
     * Override the method toString ( ) inherited from class Object to make it return a
     * meaningful string representation of the information.
     *
     * @return all information for client and his account
     */
    @Override
    public String toString() {
        return "Name= " + name_ + ", Nationalid= " + nationalid_ + ", Address= " + address_ + "," + " Phone= " + phone_ + ", " + account_.toString();
    }
}
