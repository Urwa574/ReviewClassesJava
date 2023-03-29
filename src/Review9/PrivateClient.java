package Review9;

public class PrivateClient { //with constructor
    private String name;
    private long ssn;

    public PrivateClient(String name, long ssn) {
        if (name != null && !name.isEmpty()) { // constructor is setting the value of name and ssn when you have constructor you dont have setter
            this.name = name;
        }
        if(ssn!=0){ // getter and setter is to provide extra security
            this.ssn = ssn;
        }
    }
    public long getSsn() {
        return ssn;
    }
    public String getName(){ //always use return because get means to have something and to return something
        return name;}

}