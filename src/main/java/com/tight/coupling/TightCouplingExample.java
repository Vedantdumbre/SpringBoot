package com.tight.coupling;

public class TightCouplingExample {
        public static void main(String[] args){
            UserManager userManager = new UserManager(); //fetch details from Manager

            System.out.println(userManager.getUserInfo()); //print data
        }
}
