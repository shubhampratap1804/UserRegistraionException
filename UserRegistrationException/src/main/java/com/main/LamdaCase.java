package com.main;

public class LamdaCase {
    public static void main(String[] args){
        /*Displaying results for a valid first name and for a invalid first name here
          Calling validateMyDetails method explicitly to get the desired results*/
        MyFunction myFirstNameTrue = new Lamda();
        System.out.println("Result for valid first name is:"+ myFirstNameTrue.validateDetails("Shubham","^[A-Z]+[a-z]{2,}"));
        MyFunction myFirstNameFalse = new Lamda();
        System.out.println("Result for invalid first name is:"+myFirstNameFalse.validateDetails("shubham","^[A-Z]+[a-z]{2,}"));

        /*Displaying results for a valid last name and for a invalid last name here
          Calling validateMyDetails method explicitly to get the desired results*/
        MyFunction myLastNAmeTrue = new Lamda();
        System.out.println("Result for valid last name is: "+myLastNAmeTrue.validateDetails("Shubham","^[A-Z]+[a-z]{2,}"));
        MyFunction myLastNameFalse = new Lamda();
        System.out.println("Result for invalid last name is: "+myLastNameFalse.validateDetails("shubham","\"^[A-Z]+[a-z]{2,}"));

        /*Displaying results for a valid email address and a invalid email address
          Calling validateMyDetails method explicitly to get the required results*/
        MyFunction myEmailTrue = new Lamda();
        System.out.println("Result for valid email: "+myEmailTrue.validateDetails("pratap.1804@gmail.com","([a-zA-Z0-9])+(.[a-zA-z0-9/-/.]+)*@[a-z]{2,}.[a-z]{2,4}(.[a-z]{2,4})*"));
        MyFunction myEmailFalse = new Lamda();
        System.out.println("Result for invalid email: "+myEmailFalse.validateDetails("pratap..1804coming.in","([a-zA-Z0-9])+(.[a-zA-z0-9/-/.]+)*@[a-z]{2,}.[a-z]{2,4}(.[a-z]{2,4})*"));

        /*Displaying results for a valid mobile number and a invalid mobile number
           Calling validateMyDetails method explicitly to display desired results*/
        MyFunction myMobileTrue = new Lamda();
        System.out.println("Result for valid mobile number is: "+myMobileTrue.validateDetails("91 8989156503","[0-9]{2}[ ][0-9]{10}"));
        MyFunction myMobileFalse = new Lamda();
        System.out.println("Result for invalid mobile number is: "+myMobileFalse.validateDetails("918989156503","[0-9]{2}[ ][0-9]{10}"));

        /*Displaying results for a valid first rule password and a invalid first rule password
           Calling validateMyDetails method explicitly to get the desired results */
        MyFunction myFirstPasswordTrue = new Lamda();
        System.out.println("Result for valid first rule password is: "+myFirstPasswordTrue.validateDetails("shubham12","[A-Za-z0-9]{8,}"));
        MyFunction myFirstRuleFalse = new Lamda();
        System.out.println("Result for invalid first rule password is: "+myFirstRuleFalse.validateDetails("shubham","[A-Za-z0-9]{8,}"));

        /*Displaying results for a valid second rule password and a invalid second rule password
           Calling validateMyDetails method explicitly to get the desired results */
        MyFunction mySecondPasswordTrue = new Lamda();
        System.out.println("Result for valid second password rule is: "+mySecondPasswordTrue.validateDetails("shubham12A","[A-Za-z0-9]{8,}[A-Z]+"));
        MyFunction mySecondPasswordFalse = new Lamda();
        System.out.println("Result for invalid second password rule is: "+mySecondPasswordFalse.validateDetails("shubham1234","[A-Za-z0-9]{8,}[A-Z]+"));

        /*Displaying results for a valid third rule password and a invalid third rule password
           Calling validateMyDetails method explicitly to get the desired results */
        MyFunction myThirdPasswordTrue = new Lamda();
        System.out.println("Result for valid third password rule is: "+myThirdPasswordTrue.validateDetails("shubhamAB12","[A-Za-z0-9]{8,}[A-Z]+[0-9]+"));
        MyFunction myThirdPasswordFalse = new Lamda();
        System.out.println("Result for invalid third rule password is: "+myThirdPasswordFalse.validateDetails("Shubham1234@","[A-Za-z0-9]{8,}[A-Z]+[0-9]+"));

        /*Displaying results for a valid fourth rule password and a invalid fourth rule password
           Calling validateMyDetails method explicitly to get the desired results */
        MyFunction myFourthPasswordTrue = new Lamda();
        System.out.println("Result for valid fourth password rule is: "+myFourthPasswordTrue.validateDetails("Shubham123A1@","[A-Za-z0-9]{8,}[A-Z]+[0-9]+[!@#$%/./^&*]{1}"));
        MyFunction myFourthPasswordFalse = new Lamda();
        System.out.println("Result for invalid fourth rule is: "+myFourthPasswordFalse.validateDetails("Shubham@134R","[A-Za-z0-9]{8,}[A-Z]+[0-9]+[!@#$%/./^&*]{1}"));
    }
}
