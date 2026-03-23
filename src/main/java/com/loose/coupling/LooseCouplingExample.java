package com.loose.coupling;

import com.loose.coupling.UserManager;

public class LooseCouplingExample {

    // by doing this we can fetch data from DB or WebService as well
    public static void main(String[] args){
        UserDataProvider dataProvider = new UserDatabase(); //getting data from DB
        UserManager userManagerWithDB = new UserManager(dataProvider);
        System.out.println(userManagerWithDB.getUserInfo()); // getting the data from DB


        UserDataProvider webServiceProvider = new UserDatabase();//getting data from WB
        UserManager userManagerWithWB = new UserManager(webServiceProvider);
        System.out.println(userManagerWithDB.getUserInfo()); // getting the data from WB
    }
}
