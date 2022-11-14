package objetos.parcial3.examen;

public class UserAccount {
    private String Email;
    private String Name;
    private String ZipCode;
    private String PhoneNumber;
    private double Id;

    public UserAccount(String email,String name,String zipCode, String phoneNumber, double id){
        this.Email = email;
        this.Name = name;
        this.ZipCode = zipCode;
        this.PhoneNumber = phoneNumber;
        this.Id = id;
    }

    public UserAccount() {

    }

    public double getId() {
        return Id;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getEmail(){
        return Email;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName(){
        return Name;
    }

    public void setZipCode(String zipCode) {
        this.ZipCode = zipCode;
    }

    public String getZipCode(){
        return ZipCode;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getPhoneNumber (){
        return PhoneNumber;
    }

}
