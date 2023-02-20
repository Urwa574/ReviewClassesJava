package practice01;

public class NestedLoops2 {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */
//        for (int i = 0; i <3; i++) {
//            for (int j = 1; j <=5 ; j++) {
//                System.out.print(" "+j);
//            }
//            System.out.println();
//        }
      //youtube
        //1way
        int n=4;
        int m=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print("*");
            } //solid rectangle shape
            System.out.println();
        }
     // 2nd way no initialization first just put no in for

    }
}
