package practiceClass28;

import java.util.ArrayList;

public class ALwithBoolean {
    public static void main(String[] args) {
        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans.get(2));
        System.out.println(booleans.size());
       int j=0;
        while (j<booleans.size()){
            System.out.println(j);
            j++; // i can also use for loop

        }
    }
}
