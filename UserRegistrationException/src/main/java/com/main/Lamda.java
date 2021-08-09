package com.main;

import java.util.regex.Pattern;

public class Lamda implements MyFunction{

    public boolean validateDetails(String username, String pattern) {
        Pattern myPattern = Pattern.compile(pattern);
        boolean result = myPattern.matcher(username).matches();
        return result;
    }
}
