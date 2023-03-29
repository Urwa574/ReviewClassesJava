package Review9;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<>();
        aList.add(5);
        aList.add(12);
        aList.add(13);
        aList.add(14);
        int size=  aList.size();
        System.out.println("the size od a list "+size);
        aList.get(0);
        aList.set(0,120);



    }
}
