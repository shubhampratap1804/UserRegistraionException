package com.main;

import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String [] args){

        String [] allValidEmails = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
                                    "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
        String [] allInvalidEmails ={"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com",
                                    "abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
                                    "abc@gmail.com.1a","abc@gmail.com.aa.au"};
        validateMyEmail(allValidEmails);
        validateMyEmail(allInvalidEmails);
    }

    public static void validateMyEmail(String[] myEmails){
        for ( String myEMail: myEmails) {
            System.out.println(Pattern.compile("([a-zA-Z0-9])+(.[a-zA-z0-9/-/.+]+)*@([a-z0-9])+.[a-z]{2,4}(.[a-z]{2,4})*")
            .matcher(myEMail).matches());
        }
    }
}
