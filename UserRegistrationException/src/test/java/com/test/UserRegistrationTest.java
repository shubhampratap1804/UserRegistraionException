package com.test;

import com.main.UserName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void whenFirstNameIsEntered_ShouldStartWithAUpperCase_ShouldHaveMinimumThreeCharacters(){
        UserName myFirstName = new UserName();
        boolean result = myFirstName.userNameFirstRule("Shubham");
        Assertions.assertEquals(result,true);
    }

    @Test
    void whenFirstNameIsEntered_ShouldStartWithAUpperCase_ShouldBeHaveMinimumThreeCharacters(){
        UserName myFirstName = new UserName();
        boolean result = myFirstName.userNameFirstRule("sh");
        Assertions.assertEquals(result,false);
    }

    @Test
    void whenLastNameIsEntered_ShouldStartWithAUpperCase_ShouldHaveMinimumThreeCharacters(){
        UserName myFirstName = new UserName();
        boolean result = myFirstName.userNameFirstRule("Pratap");
        Assertions.assertEquals(result,true);
    }

    @Test
    void whenLastNameIsEntered_ShouldStartWithAUpperCase_ShouldBeHaveMinimumThreeCharacters(){
        UserName myFirstName = new UserName();
        boolean result = myFirstName.userNameFirstRule("pr");
        Assertions.assertEquals(result,false);
    }
}
