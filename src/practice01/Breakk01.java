package practice01;

public class Breakk01 {
    public static void main(String[] args) {

        for (int i = 0; i <=10 ; i++) {
            if(i==6){ // break on 5 becz count from 0 also when systems see 6 automatically terminate without print 6
                break;
             }
            System.out.println(i);
        }
        System.out.println("*******************");
        int n=20;
        while (n>=4){
            n-=2;
            if(n==8){ // terminates before 8
                break;
            }
            System.out.println(n);
        }
        System.out.println("__________________");
        int num=10;
        do {
            System.out.println(num);
            num--;
            if (num == 4) {
                break;}
            }while (num >= 2) ;

    }
}
