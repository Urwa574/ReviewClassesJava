package Review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    //set is a collection of unique elements
    public static void main(String[] args) {
        Set<String> qaJobs=new HashSet<>(); //does not insertion order
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("Api tester");
        qaJobs.add("Api Analysis");
        qaJobs.add("SDET");
        System.out.println(qaJobs);
        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element "+qaJobs);
        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");//can not have duplication
        System.out.println("Added duplication "+qaJobs);
        //Creating an object and passing collection as a parameter to invoke parameterized constructor
        Set<String> list=new LinkedHashSet(qaJobs);//maintains the insertion order
       // list.addAll(qaJobs);//this or upper one in linked list called constructor(qaJobs)
        System.out.println("LinkedHashSet = "+list);
        Set<String> treeset=new TreeSet<>(); //sorted order
        treeset.addAll(qaJobs);
        System.out.println("Treeset = "+treeset);




    }
}
