package com.syntax;

public class repl166 {
   // Create a subclass Cat in which override method sleep
//    Create 3 Kitten subclasses of a Cat class and override method eat
//for 1 kitten - eats milk
//for 2 kitten - eats snack
//for 3 kitten - eats everything
}
class Animal{
    String eat;
    String sleep;

    public Animal(String eat, String sleep) {
        this.eat = eat;
        this.sleep = sleep;
    }
    void eat(){
        System.out.println();
    }
    void sleep(){
        System.out.println();
    }
}
class cat extends Animal{
    @Override
    void sleep() {
        System.out.println("cat sleeps a lot");
    }

    public cat(String eat, String sleep) {
        super(eat, sleep);
    }

    @Override
    void eat() {
        System.out.println("cat eats");
    }
}
class kitten1 extends cat{
    @Override
    void sleep() {
        System.out.println("kitten1 sleeps a lot");
    }

    public kitten1(String eat, String sleep) {
        super(eat, sleep);
    }

    @Override
    void eat() {
        System.out.println("kitten1 eats");
    }
}
class kitten2 extends cat{
    @Override
    void sleep() {
        System.out.println("kitten2 sleeps a lot");
    }

    public kitten2(String eat, String sleep) {
        super(eat, sleep);
    }

    @Override
    void eat() {
        System.out.println("kitten2 eats");
    }
}
class kitten3 extends cat{
    @Override
    void sleep() {
        System.out.println("kitten3 sleeps a lot");
    }

    public kitten3(String eat, String sleep) {
        super(eat, sleep);
    }

    @Override
    void eat() {
        System.out.println("kitten3 eats");
    }

}