package Review8;

public class Store {
    public static void main(String[] args) {
        Furniture chair=new Chair();
            chair.comfort();
            chair.assemble();//runtime polymorphism
        Furniture table=new Table();
        table.assemble(); //runtime
        table.comfort();
        //if u want to execute child behaviour
        Table table1=new Table();
        table1.comfort();
        table1.buildTable();
        table1.builtTable("wood"); //overload can know by signature
        Chair.breaks();//static can call by class name

        Furniture.breaks();//static can call by class name
        Furniture chair1=new Chair();
        chair1.comfort();
        chair1.assemble(); //run poly
        //proof that method breaks is not overridden
        Chair.breaks(); //since we are not overriding methods break will be executed from parent
        //this is also not the right wy to call method


    }
}
