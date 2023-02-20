package practice01;

public class Continue01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i%3==0) { // we can also do this with or operator
                continue; //skip also we did not put sout so we are not going to have divisible of 3
            }else {
                System.out.println(i);
                System.out.println("hello");
            }
        }

    }
}
