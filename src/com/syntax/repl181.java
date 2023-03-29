package com.syntax;

public class repl181 {
    public static void main(String[] args) {
        Account account=new Account();
        account.setAcc_no(7560504000l);
        account.getAcc_no();
        account.setName("Sumair");
        account.getName();
        account.setEmail("sumair@syntax.com");
        account.getEmail();
        account.setAmount(50000.0);
        account.getAmount();

    }
}
class Account{
long  acc_no;
String name;
String email;
double amount;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
        System.out.println(acc_no+" "+name+" "+email+" "+amount);
    }
}
