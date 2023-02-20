package com.syntax;

public class replit145 {
    String dogName;

    double dogWeight;
    static String dogBreed="Mutt";
    replit145(String dogName,double dogWeight){
        this.dogWeight=dogWeight;
        this.dogName=dogName;
    }
void def(){
    System.out.println(dogName+" "+dogBreed+" "+dogWeight);
}

    public static void main(String[] args) {
        replit145 replit145=new replit145("Tarzan",50.5);
        replit145.def();
    }
}
