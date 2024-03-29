package Review9;
//collection of public static final variables and public abstract methods
public interface Drawable {
    public static final String TOOL="Pencil";
    void draw(); // by default this method is public abstract

    //above is how Interface used to be before Java 8
    //after Java 8 static and default methods were added to the Interface

    default void print(){
        System.out.println("We are drawing object using "+TOOL);
    }

    static void erase(){
        System.out.println("All drawings are erasable");
    }
}
abstract class Shape {
    String color;
    double width,length;

    public Shape(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }
  public abstract double calculateArea();
}

class Rectangle extends Shape implements Drawable { //can have both together
    public Rectangle(String color, double width, double length) {
        super(color, width, length);
    }
    @Override
    public double calculateArea() {
        return length*width;
    }
    public void draw(){
        System.out.println("I am drawing rectangle");
    }

}
class Square implements Drawable {

    public void draw() {
        System.out.println("I am drawing Square");
    }
}