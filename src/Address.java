public class Address {

    private String line1;
    private String city;
    private String state;


    public Address (String line1, String city,String state){
        this.city=city;
        this.line1=line1;
        this.state=state;
    }

   public String getLine1(){
        return line1;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString(){
        return String.format("line1: "+line1 + " city: " +city+ " state: "+state);

    }


}
