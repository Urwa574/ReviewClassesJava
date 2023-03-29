package Review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo1 {
    public static void main(String[] args) {
        Map<String,Double> fruitsMap =new HashMap<>(); //shift+f6 for refactor
        fruitsMap.put("Apple",7.2);
        fruitsMap.put("Banana",2.2);
        fruitsMap.put("Dragon Fruit",6.2);
        fruitsMap.put("Mango",12.9);
        fruitsMap.put("Orange",10.2);
        //print only those elements which contains the letter a or e in their name and their price is more than 8 dollar
        //for loops are static its not safe or simple while loops are not safe for maps to remove anything
    //    var entry=fruitsMap.entrySet();
        //for (Map.Entry<String, Double> entry : fruitMap.entrySet()) {
       // for (var key:entry) {
//            String  keys= key.getKey();
//       if((keys.contains("a")||keys.contains("e"))&&key.getValue()>8){ //we should use double parentheses(()) with or condition to get proper result
//           System.out.println(key);     //example sout((2+2)*2); first + then multiply
//        }
//        }
//remove those elements which contains the letter a or e in their name and their price is more than 8 dollar
        //we are using remove if method to remove the element s-> its actually part of the syntax of the lambda expression
        fruitsMap.entrySet().removeIf(entry->(entry.getKey().contains("a")||entry.getKey().contains("e"))&& entry.getValue()>8);
        System.out.println(fruitsMap);
 //try to watch video lambda with forEach
 fruitsMap.forEach((key,value)-> System.out.println(key+" "+value)); //better to print if you dont want to iterate or make entry set to print together

        }
    }

