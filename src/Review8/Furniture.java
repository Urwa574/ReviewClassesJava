package Review8;

public class Furniture {
    public void assemble(){
        System.out.println("furniture needs to be assemble");
    }
    public void comfort(){ //overridden
        System.out.println("furniture needs to be comfortable");
    }
    private void use(){
        System.out.println("furniture is used by us");
    }
    public static void breaks(){
        System.out.println("bnm");
    }
}
class Chair extends Furniture{
    @Override
    public void comfort() { //overriding
        System.out.println("chair is comfortable");
    }
    public static void breaks(){ //we are not overriding static cant override
        System.out.println("bnm");
    }
    private void use(){ //declaring its not override its means chair has its own private method use not furniture
        System.out.println("furniture is used by us");
    }
    protected void loveSeat(){
        System.out.println("this is love seat");
    }
}
class Table extends Furniture{
    @Override
    public void comfort() {
        System.out.println("table can not be comfortable");
    }
    protected void buildTable(){ //own behaviour
        System.out.println("table is builtin");
    }
    public void builtTable(String material){ //overload
        System.out.println("material is good");
    }
}