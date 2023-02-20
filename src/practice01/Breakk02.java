package practice01;

public class Breakk02 {
    public static void main(String[] args) {

      boolean summer = true;
      int temp = 75;
     while (summer) {
            if (temp <= 100){
               System.out.println("i love summer");
       }else{
           System.out.println("it is very hot");
         break;
      }
       temp += 5;
    }
       System.out.println("_____________________");
        // without using break

        int temperature=75;
        while(temperature<=105) {
            if(temperature<=100){
                System.out.println("its summer ");
            } else {
                System.out.println("its hot ");
            }
            temperature+=5;
        }
        System.out.println("********");
        //oposite
        boolean winter=true;
        int no=100;
        while (winter) {
            if (no >= 75) {
                System.out.println("i love winter");
            } else {
                System.out.println("winter is over");
                break;
            }
            no -= 5;
        }
        }
    }

