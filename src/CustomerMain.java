public class CustomerMain {

    public static void main(String[] args) {

        Address ad=new Address("abc","narnaul","punjab");
        Customer cust=new Customer("pawan",1,ad);
        //ad.setCity("rewari");
        System.out.println(cust);
    }
}
