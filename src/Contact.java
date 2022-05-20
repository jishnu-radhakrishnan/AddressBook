
public class Contact {
    private  String name;
    private  String address;
    private  String city;
    private  String state;
    private  int zip;
    private  long mobileNumber;
    private  String mailId;

    public  void setName(String name) {
        this.name = name;
    }

    public  void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public  void setState(String state) {
        this.state = state;
    }

    public  void setZip(int zip) {
        this.zip = zip;
    }

    public  void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public  void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getName() {
        return name;
    }

    public  String getAddress() {
        return address;
    }

    public  String getCity() {
        return city;
    }

    public  String getState() {
        return state;
    }

    public  int getZip() {
        return zip;
    }

    public  String getMailId() {
        return mailId;
    }

    public  long getMobileNumber() {
        return mobileNumber;
    }
    public void print(){
        getName();
        getAddress();
        getCity();
        getState();
        getZip();
        getMobileNumber();
        getMailId();
    }

}
