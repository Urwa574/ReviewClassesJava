package Review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        /*
        Exceptions can occur because of two main reasons the mistake of programmer
        or because of the external resources on which you program is dependent checked exception

        when exceptions occurs because of human error or can be avoided by simple writing
        good code and may if else conditions they are called unchecked exception
         */
        System.out.println(10/0); // this code we can simply avoid by writing correct code this is unchecked

        try {
            FileInputStream fileInputStream=new FileInputStream("Files/review11.xlsx"); //this piece of code is dependent its is checked exception
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

      FileNotFoundException e=new FileNotFoundException();
    }
}
