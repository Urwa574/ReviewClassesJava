package Review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SyntaxErrorExample1 {
        //if we remove class from here we get error at compile time this is called syntax error
        //checked exception also throw error at compile time


  // throws keyword is used to indicate that a method can throw an exception

        public static void main(String[] args) throws FileNotFoundException {
            method(); //whoever call this method java force to that person to write a try catch block or throws exception

        }

        static void method() throws FileNotFoundException {
            FileInputStream fileInputStream=new FileInputStream("sdbfjhsd"); //checked exception
            // 2 ways 1st add throws in signature
            //2nd try catch block

    }
}
