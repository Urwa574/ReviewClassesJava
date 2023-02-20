package practice01;

public class nestedLOOPs1 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            if (i==1){ // 1.false no execution --4true because = 1 line executed
                System.out.println();
            }
            for (int j = 0; j <5 ; j++) { //2.true executed -5. true executed
                System.out.print("*");
            }
        System.out.println();// 3.space 6- executed
        }

    }
}
