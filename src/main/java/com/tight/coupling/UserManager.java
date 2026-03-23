package com.tight.coupling;

public class UserManager {
    private final UserDatabase userDatabase = new UserDatabase(); //fetch details from Database

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
