package com.wag.testDate;


public class User {
    private String email;
    private String firstName;
    private String lastName;
    private  String password;
    private String phone;

    public User(){
        firstName = "Ivan";
        lastName = "Petrov";
        email = "my@gmail.com";
        password = "123";
        phone = "(444) 333-2222";

    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}
