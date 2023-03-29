package practiceClass28;

public class array01 {
    public static void main(String[] args) {

        //simple
        String name="urwa";
        String name1="laiba";
        String name2="hashim";
        String name3="shahram";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println("***************");
//simple array type1
        String [] names=new String[4];
         names[0]="Urwa";
         names[1]="Laiba";
         names[2]="shahram";
         names[3]="hashim";
         //simple array type2
        String [] nam={"urwa","laiba"};
        for (int i = 0; i < nam.length; i++) {
            System.out.println(nam[i]);

        }
// for calling array has two ways:
        System.out.println(names[0]);
     //2nd
        System.out.println("*********************");
      for (int i = 0; i < names.length; i++) {
          System.out.print(names[i]+" ");
      }


    }
}
