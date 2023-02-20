package com.syntax;

public class replit142 {
    String schoolName;
    int batch;
    int year;
    String lastDayofClass;

    replit142(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayofClass);
    }
    replit142(String schoolName,int batch,int year,String lastDayofClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayofClass=lastDayofClass;
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayofClass);

    }
}
class tester {
    public static void main(String[] args) {
        replit142 p = new replit142();
        replit142 practice = new replit142("syntax", 6, 2020, "07/30/2020");
    }
}


