package Review9;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList <String> computers=new ArrayList<>();
        computers.add("mac");
        computers.add("hp");
        computers.add("lenovo");
        computers.add("dell");
        System.out.println(computers);


        for (int i = 0; i < computers.size(); i++) {
       String c= computers.get(i);
//       if(c.equals("hp")){
//           System.out.println("i have hp"); // just to show in this loop we can have flexibility to add conditions
//       }
            System.out.print(c+" ");
        }
        System.out.println("____________");
        for (String com:computers){
            System.out.print(com+" ");
        }

    }
}
