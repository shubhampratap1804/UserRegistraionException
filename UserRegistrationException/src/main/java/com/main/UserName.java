package com.main;

import java.util.regex.Pattern;

public class UserName {


    //Method to check for regular expressions of first name
    public boolean userNameFirstRule(String firstName) throws UserNameException {
        try {
            Pattern myPattern = Pattern.compile("^[A-Z]+[a-z]{2,}");
            return myPattern.matcher(firstName).matches();
        } catch (Exception e){
            throw new UserNameException("Please enter a valid first name!");
        }
    }

    //Method to check for regular expressions of last name
    public boolean userNameSecondRule(String lastName) throws UserNameException {
        try{
            Pattern myPattern = Pattern.compile("^[A-Z]+[a-z]{2,}");
            return myPattern.matcher(lastName).matches();
        } catch (Exception e){
            throw new UserNameException("Please enter a valid last name!");
        }
    }

    //Method to check for regular expression of email
    public boolean myValidEmail(String eMail) throws UserNameException {
        try{
            Pattern myPattern = Pattern.compile("([a-zA-Z0-9])+(.[a-zA-z0-9/-/.]+)*@[a-z]{2,}.[a-z]{2,4}(.[a-z]{2,4})*");
            return myPattern.matcher(eMail).matches();
        } catch (Exception e){
            throw new UserNameException("Please enter a valid email");
        }
    }

    
}
