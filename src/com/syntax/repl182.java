package com.syntax;

public class repl182 {
    public static void main(String[] args) {

person p=new person("John","Doe","10/25/1900",25,1900,"123-45-6789");
        System.out.println(p.getFirstname());
        System.out.println(p.getLastname());
        System.out.println(p.getBirthmonth());
        System.out.println(p.getSsn());
}}
class person {
    String firstname;
    String lastname;
    String birthmonth;
    int birthday;
    int birthyear;
    String ssn;

    public person(String firstname, String lastname, String birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    //**Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.
    // For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**
    public String formatBirthday() {
        String a="3/22/2000";
        if (birthday == 22) {
        }
        if (birthday == 3) {
        }
        if (birthyear == 2000) {
        }
        return a;
    }
}