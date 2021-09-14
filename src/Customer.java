public class Customer {

    private String cname;
    private int cid;
    private Address address;


    public Customer(String cname, int cid, Address address) {
        this.cname = cname;
        this.cid = cid;
        this.address = address;
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public Address getAddress() {
        return address;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cname='" + cname + '\'' +
                ", cid=" + cid +
                ", address=" + address +
                '}';
    }



}
