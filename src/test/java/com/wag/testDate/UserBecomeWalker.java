package com.wag.testDate;

public class UserBecomeWalker {
    private String firstName;
    private String lastName;
    private  String email;
    private String phone;
    private String address;
    private String apartment;
    private String city;
    private String state;
    private String zipcode;


    public UserBecomeWalker(){
        firstName = "Elena";
        lastName = "Petrova";
        email = "Dogwalker@gmail.com";
        phone = "3336664343";
        address = " 212 s  ";
        apartment = "16";
//        city = "San-Jose";
//       // state = "California";
//        zipcode = "95033";95033

    }
    public String getFirstName(){
        return firstName;
    }
    public  String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public String getApartment(){
        return apartment;
    }
    public String getCity(){
        return city;
    }
//    public state getState(){
//        return state;
//    }stateList
    public String getZipcode(){
        return zipcode;
    }

}
