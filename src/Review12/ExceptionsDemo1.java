package Review12;

public class ExceptionsDemo1 {
    public static void main(String[] args) {

        String name="!Batch15 is SMART";
        System.out.println(name.charAt(-1)); //String out of bounds exception
        System.out.println("rest of the program");// so its will not print because we have exception in upper line so it will stop working when get
        // exception thats y we use try catch block
    }
}
