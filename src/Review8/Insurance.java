package Review8;

public abstract class Insurance {
    //we can have variable/method/constructor in abstract class
    // can have any access modifier also have static variable
    // all abstract class must participate in inheritance so no point to have private access mod
    public static String company="ika";
    String policyNumber;
    String policyHolder;
   public Insurance(String policyNumber,String policyHolder){
   this.policyNumber=policyNumber;
   this.policyHolder=policyNumber;
    }
    public void getInsurance(){
        System.out.println("we need to get insurance");
    }
    public abstract double calculateCoverage();
}
class CarPolicy extends Insurance{ //either add abstract before class or implement the abstract method

    double premium;
    int numberOfAge;
    CarPolicy(String policyNumber,String policyHolder,double premium,int numberOfAge ){
        super( policyNumber,policyHolder);
        this.premium=premium;
        this.numberOfAge=numberOfAge;
    }
    @Override
    public double calculateCoverage() {
        if(numberOfAge<20){
            return premium*2;
        }else if(numberOfAge<40){
            return premium*0.5;
        }else{
            return premium*0.2;
        }
    }
}
class PetPolicy extends Insurance{
    int numberOfPet;
    double premium;
    public PetPolicy(String policyNumber, String policyHolder,int numberOfPet,double premium) {
        super(policyNumber, policyHolder);
        this.numberOfPet=numberOfPet;
        this.premium=premium;
    }
    @Override
    public double calculateCoverage() {
        if(numberOfPet>2){
            return premium*2;
        } else if (numberOfPet>5) {
            return premium*3;
        }else {
            return premium*5;
        }

    }
}