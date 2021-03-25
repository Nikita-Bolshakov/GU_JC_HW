package lesson10;

import java.util.*;

public class PhoneDirectory {

    private final Map <String,List<String>> hmSurnameAndPhoneNumber = new HashMap<>();
    private List<String> isPhoneNumber;

    public void add(String surname, String phone) {
        if (hmSurnameAndPhoneNumber.containsKey(surname)) {
            isPhoneNumber = hmSurnameAndPhoneNumber.get(surname);
        } else {
            isPhoneNumber = new ArrayList<>();
        }
        isPhoneNumber.add(phone);
        hmSurnameAndPhoneNumber.put(surname, isPhoneNumber);
    }

    public List<String> get(String surname) {
        return hmSurnameAndPhoneNumber.get(surname);
    }

}