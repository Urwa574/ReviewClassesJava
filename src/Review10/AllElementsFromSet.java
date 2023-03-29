package Review10;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class AllElementsFromSet {
    public static void main(String[] args) {
        Set<String> qaJobs=new LinkedHashSet<>(); //does not insertion order
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("Api tester");
        qaJobs.add("Api Analysis");
        qaJobs.add("SDET");
        System.out.println(qaJobs);
        //how to get all values from a set
        //1 enhanced for loop
        for (String qaJob : qaJobs) {
            System.out.println(qaJob);
        }
        //2 iterator has 3 methods hasNext(),next(),remove();
        Iterator<String> iterator =qaJobs.iterator();
        while (iterator.hasNext()){
            String job=iterator.next();
            System.out.println(job);
        }
        //if you just printing elements,either works but if you want to remove go with iterator

    }
}
