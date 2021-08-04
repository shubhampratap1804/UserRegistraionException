package com.main;

import java.util.regex.Pattern;

public class UserName {

    //Method to check for regular expressions of first name
    public boolean userNameFirstRule(String firstName){
        Pattern myPattern = Pattern.compile("^[A-Z]+[a-z]{2,}");
        return myPattern.matcher(firstName).matches();
    }
    //Method to check for regular expressions of last name
    public boolean userNameSecondRule(String lastName){
        Pattern myPattern = Pattern.compile("^[A-Z]+[a-z]{2,}");
        return myPattern.matcher(lastName).matches();
    }
}
