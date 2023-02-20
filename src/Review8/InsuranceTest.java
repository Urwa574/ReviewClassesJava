package Review8;

public class InsuranceTest {
    public static void main(String[] args) {
        Insurance carpolicy=new CarPolicy("ihdnbg","jihnbb",12.45,25);
        System.out.println (carpolicy.calculateCoverage());
        carpolicy.getInsurance();
        Insurance petPolicy=new PetPolicy("hfw","hujedh",15,478.2);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());
        //2nd way to store whole in one to create array
        // class name [] arr={}
        Insurance[] arr={new CarPolicy("ihdnbg","jihnbb",12.45,25),
                new PetPolicy("ihdnbg","jihnbb",12,25)};
        arr[0].calculateCoverage();
    }
}
