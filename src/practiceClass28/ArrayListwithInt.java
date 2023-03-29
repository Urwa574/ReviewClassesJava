package practiceClass28;

import java.util.ArrayList;

public class ArrayListwithInt {
    public static void main(String[] args) {
        ArrayList<Integer> no=new ArrayList<>(); //with Int non-primitive
        no.add(1);
        no.add(2);
        ArrayList<Character> characters= new ArrayList<>();
        characters.add('A');
        characters.add('b');
    // to call characters
        for (Character ca:characters){
            System.out.print(ca+" ");
        }
        System.out.println();
        for(Integer integer:no){
            System.out.print(integer+" ");
        }

    }
}
