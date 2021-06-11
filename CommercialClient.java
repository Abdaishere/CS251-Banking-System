
package banking.system;

/**
 * To maintain Commercial clients data in bank
 * @author Mohamed Essam Said Hanafi
 */
public class CommercialClient  extends Client {
    private int commercialID_;

    /**
     * Default constructor for Client
     */
    public CommercialClient() {
        super();
        this.commercialID_ = 0;
    }

    /**
     * constructor with client information
     *
     * @param name         Name of the client
     * @param commercialID the Commercial ID of the client
     * @param address      the address of the client
     * @param account      the account of the client
     * @param phone        the phone number of the client
     */
    public CommercialClient(String name, int commercialID, String address, Account account, int phone) {
        super(name, 0, address, account, phone);
        this.commercialID_ = commercialID;
    }

    /**
     * set the Commercial ID
     * @param commercialID the Commercial ID entered
     */
    public void setCommercialID(int commercialID) {
        this.commercialID_ = commercialID;
    }

    /**
     * get the Commercial ID
     * @return integer with the Commercial ID
     */
    public int getCommercialID() {
        return commercialID_;
    }

    @Override
    public String toString() {
        return "Name= " + this.getName() + ", commercialID= " + commercialID_ + ", Address= " + this.getAddress() + "," + " Phone= " + this.getPhone() + ", " + this.getAccount().toString();

    }
}
