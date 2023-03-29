package com.syntax;

abstract public class Tea {
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class Leamontea extends Tea{

    Leamontea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}
class chai extends Tea{
    chai(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
class testing1{
    public static void main(String[] args) {
        Tea[] tea={new Leamontea("leamonTea"),new chai("karak chai")};
        for (Tea t:tea){
            t.addSugar();

        }
    }
}