package com.main;

import java.util.regex.Pattern;


public class UserName {

    public boolean userNameFirstRule(String firstName) throws UserNameException {

            Pattern myPattern = Pattern.compile("^[A-Z]+[a-z]{2,}");
            boolean result = myPattern.matcher(firstName).matches();
            if(result == true) {
                System.out.println("Valid first name:");
            } else
                try {
                    throw new UserNameException("PLease enter a valid first name:");
                } catch(UserNameException e) {
                e.printStackTrace();
            } return result;
        }

    //Method to check for regular expressions of last name
    public boolean userNameSecondRule(String lastName) throws UserNameException {

            Pattern myPattern = Pattern.compile("^[A-Z]+[a-z]{2,}");
            boolean result = myPattern.matcher(lastName).matches();
            if(result == true){
                System.out.println("Valid last name:");
            } else
                try{
                    throw new UserNameException("Please enter a valid last name:");
                } catch (UserNameException e) {
                    e.printStackTrace();
        } return result;
    }

    //Method to check for regular expression of email
    public boolean myValidEmail(String eMail) throws UserNameException {
            Pattern myPattern = Pattern.compile("([a-zA-Z0-9])+(.[a-zA-z0-9/-/.]+)*@[a-z]{2,}.[a-z]{2,4}(.[a-z]{2,4})*");
            boolean result = myPattern.matcher(eMail).matches();
            if(result == true) {
                System.out.println("valid email address");
            } else
                try{
                    throw new UserNameException("Enter a valid email address:");
                } catch (UserNameException e) {
                    e.printStackTrace();
        } return result;
    }

    //Method to check for regular expression of mobile number
    public boolean myValidMobileNumber(String number) throws UserNameException {
            Pattern myPattern = Pattern.compile("[0-9]{2}[ ][0-9]{10}");
            boolean result = myPattern.matcher(number).matches();
            if(result == true) {
                System.out.println("Valid mobile number:");
            } else
                try {
                    throw new UserNameException("Enter a valid mobile address:");
                } catch (UserNameException e) {
                    e.printStackTrace();
        } return result;
    }

    //Method to check regular expression of password first rule
    public boolean passwordFirstRule(String password) throws UserNameException {
            Pattern myPattern = Pattern.compile("[A-Za-z0-9]{8,}");
            boolean result = myPattern.matcher(password).matches();
            if(result == true) {
                System.out.println("Valid first rule password:");
            } else try{
                throw new UserNameException("Enter a valid first rule password:");
        } catch (UserNameException e) {
            e.printStackTrace();
        } return result;
    }

    //Method to check regular expression of password second rule
    public boolean passwordSecondRule(String password) throws UserNameException {
            Pattern myPattern = Pattern.compile("[A-Za-z0-9]{8,}[A-Z]+");
            boolean result = myPattern.matcher(password).matches();
            if(result == true){
                System.out.println("Valid second rule password:");
        } else
            try{
            throw new UserNameException("Enter a valid second rule password:");
            } catch (UserNameException e) {
                e.printStackTrace();
        } return result;
    }

    //Method to check regular expression of password third rule
    public boolean passwordThirdRule(String password) throws UserNameException {
            Pattern myPattern = Pattern.compile("[A-Za-z0-9]{8,}[A-Z]+[0-9]+");
            boolean result = myPattern.matcher(password).matches();
            if(result == true){
                System.out.println("Valid third rule password:");
        } else
            try{
                throw new UserNameException("Enter a valid third rule password!");
            } catch (UserNameException e) {
                e.printStackTrace();
        } return result;
    }

    //Method to check regular expression of password fourth rule
    public boolean passwordFourthRule(String password) throws UserNameException {
            Pattern myPattern = Pattern.compile("[A-Za-z0-9]{8,}[A-Z]+[0-9]+[!@#$%/./^&*]{1}");
            boolean result = myPattern.matcher(password).matches();
            if(result == true){
                System.out.println("Valid fourth rule password");
        } else
            try{
                throw new UserNameException("Enter a valid fourth rule password:");
            } catch (UserNameException e) {
                e.printStackTrace();
        }return result;
    }
}