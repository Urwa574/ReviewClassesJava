package Review9;

public class Customer {
   private String name;
    private long ssn;
    public void setName(String name) { //just user set and you dont have to return that thing
        if (name != null && !name.isEmpty()){
            this.name=name;
        }
    }
public String getName(){ //always use return because get means to have something and to return something
        return name;
}
public void setSsn(long ssn){
        if (ssn!=0){
            this.ssn=ssn;
        }
}
    public long getSsn() {
        return ssn;
    }

}
