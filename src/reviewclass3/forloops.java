package reviewclass3;

public class forloops {
    public static void main(String[] args) {
        // every condition must be true or must be false
        //if one is true other is false result is false
        //SOPln is short for system.out.println
//FOR LOOPS
         //1. initialization
        // 2. condition
        // 3. if true -> code goes inside the loop body
        // goes back, increment
        // repeat

        for(int i=1; i<=5; i++) {

            System.out.println("Hello "+i);
        }

        System.out.println( "  -----------   ");

        for(int a=0; a<8; a+=4){

            System.out.println("Bye");
        }

        System.out.println( "  -----------   ");

        for(int i=2; i>10; i++){

            System.out.println(i);
        }

        System.out.println( "  -----------   ");

        /*
            for (int j=3; j<10; j--){
                System.out.println(j);
            }
        */

        System.out.println("End");

    }
}
