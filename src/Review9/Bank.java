package Review9;

public class Bank {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setName("Urwa");
        System.out.println(customer.getName());
        customer.setSsn(988726);
        System.out.println(customer.getSsn());
        //private client
        PrivateClient privateClient=new PrivateClient("urwa",986865);
        System.out.println(privateClient.getName());
        System.out.println(privateClient.getSsn());

    }
}
