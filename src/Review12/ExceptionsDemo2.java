package Review12;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

        String name = "!Batch15 is SMART";
        try {
            System.out.println(name.charAt(-1)); //String out of bounds exception
        } catch (StringIndexOutOfBoundsException e) {
         e.printStackTrace(); //it prints out complete info where the error is +
             /*
            printStackTrace
            provides us all the information to find and fix the issue
         ***   as a tester you will always use ***
            this approach is not good for sensitive application it is only good when u only use this application
             */
            // e.printStackTrace();
            /*
            if we are not interested in complete info we only want the message we can use getMessage method
             */
            // System.out.println(e.getMessage());  String index out of range: -1 this is the message part
/*
          e will print the complete information about the exception class plus the message
 */

        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        } catch (Exception e) { // this exception is the parent class of all the exceptions its a generic code if both
            // are not true then go with this like else
            System.out.println(e);

        }
        System.out.println("rest of the program");
    }
    }