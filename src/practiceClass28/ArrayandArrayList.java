package practiceClass28;

import java.util.ArrayList;

public class ArrayandArrayList {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
// using add method to add elements in list
        name.add("urwa");
        name.add("laiba");
        name.add("shari");
        name.add("hashim");
        System.out.println(name); // this prints all
     name.add(0,"Waseem"); // add name waseem on index 0
        System.out.println(name);
        System.out.println(name.contains("Tanzila")); //false checking the array if array have or not
        name.set(1,"Tanzila"); //seting tanzila on index 1 and this remove urwa from index 1
        System.out.println(name);
        System.out.println(name.indexOf("Tanzila")); //1
       name.remove(0);
        System.out.println(name);
        name.clear();
        System.out.println(name);
    }
}
