package com.loose.coupling;

public class UserDatabase implements UserDataProvider { // UserDataProvider gives data to UserDatabase
    @Override
    public String getUserDetails(){
        return "User Details from Database";
    }
}
