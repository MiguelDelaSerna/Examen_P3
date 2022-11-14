package objetos.parcial3.examen;

import java.util.LinkedList;
import java.util.List;

public class TravelAgency {
private List <UserAccount> TravelAgencyList = new LinkedList<>();
    public String addUserAccount(UserAccount userAccount1) {
        if(userAccount1.getEmail() == null){
            throw new EmailRequiredException();
        }
        if(userAccount1.getPhoneNumber()== ""){
            throw new PhoneNumberRequiredException();
        }
        TravelAgencyList.add(userAccount1);
        return null;
    }

    public UserAccount findAccount(String id1) {
        return null;
    }

    public UserAccount findAccountByEmail(String s) {
        return null;
    }

    public UserAccount findAccountByPhoneNumber(String s) {
        return null;
    }

    public UserAccount removeAccount(String id1) {
        return null;
    }
}
