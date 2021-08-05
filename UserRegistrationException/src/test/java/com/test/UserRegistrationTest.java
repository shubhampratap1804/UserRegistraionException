package com.test;
import com.main.UserName;
import com.main.UserNameException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    void whenFirstNameIsEntered_ShouldStartWithAUpperCase_ShouldHaveMinimumThreeCharacters() throws UserNameException {
        UserName myFirstName = new UserName();
        try{
            boolean result = myFirstName.userNameFirstRule("Shubham");
            Assertions.assertEquals(result,true);
        } catch (Exception e){
            throw new UserNameException("Please enter a valid first name!");
        }
    }
    @Test
    void whenFirstNameIsEntered_ShouldStartWithAUpperCase_ShouldBeHaveMinimumThreeCharacters() throws UserNameException {
        UserName myFirstName = new UserName();
        try{
            boolean result = myFirstName.userNameFirstRule("sh");
            Assertions.assertEquals(result,false);
        } catch (Exception e){
            throw new UserNameException("Please enter a invalid first name!");
        }
    }
    @Test
    void whenLastNameIsEntered_ShouldStartWithAUpperCase_ShouldHaveMinimumThreeCharacters() throws UserNameException {
        UserName myLastName = new UserName();
        try{
            boolean result = myLastName.userNameSecondRule("Pratap");
            Assertions.assertEquals(result,true);
        } catch (Exception e){
            throw new UserNameException("Please enter a valid last name!");
        }
    }
    @Test
    void whenLastNameIsEntered_ShouldStartWithAUpperCase_ShouldBeHaveMinimumThreeCharacters() throws UserNameException {
        UserName myLastName = new UserName();
        try{
            boolean result = myLastName.userNameSecondRule("pr");
            Assertions.assertEquals(result,false);
        } catch (Exception e){
            throw new UserNameException("Please enter a invalid last name!");
        }
    }
    @Test
    void whenEmailIsEntered_ShouldSatisfyMandatory_AndOptionalPart() throws UserNameException {
        UserName eMail = new UserName();
        try{
            boolean result = eMail.myValidEmail("pratap.1804@gmail.co.in");
            Assertions.assertEquals(result,true);
        } catch (Exception e){
            throw new UserNameException("Please enter a valid email!");
        }
    }
    @Test
    void whenEmailIsEntered_ShouldSatisfyMandatory_AndOptionalPartHere() throws UserNameException {
        UserName eMail = new UserName();
        try{
            boolean result = eMail.myValidEmail("pratap.1804@gmail.coming.india");
            Assertions.assertEquals(result,false);
        } catch (Exception e){
            throw new UserNameException("Please enter a invalid email!");
        }
    }
    @Test
    void whenValidMobileNumberIsPasses_ShouldReturnTrue() throws UserNameException {
        UserName myMobileNumber = new UserName();
        try{
            boolean result = myMobileNumber.myValidMobileNumber("91 8989156503");
            Assertions.assertEquals(result,true);
        } catch (Exception e){
            throw new UserNameException("Please enter a valid mobile number!");
        }
    }
    @Test
    void whenInvalidMobileNumberIsPasses_ShouldReturnFalse() throws UserNameException {
        UserName myMobileNumber = new UserName();
        try{
            boolean result = myMobileNumber.myValidMobileNumber("918989156503");
            Assertions.assertEquals(result,false);
        } catch (Exception e){
            throw new UserNameException("Please enter a invalid mobile number!");
        }
    }
    @Test
    void whenValidPasswordIsProvided_ForFirstRule_ShouldReturnTrue() throws UserNameException {
        UserName myPassword = new UserName();
        try{
            boolean result = myPassword.passwordFirstRule("shubham123");
            Assertions.assertEquals(result,true);
        } catch (Exception e){
            throw new UserNameException("Please enter a valid first rule password!");
        }
    }
    @Test
    void whenInvalidPasswordIsProvided_ForFirstRule_ShouldReturnFalse() throws UserNameException {
        UserName myPassword = new UserName();
        try{
            boolean result = myPassword.passwordFirstRule("sham12");
            Assertions.assertEquals(result,false);
        } catch (Exception e){
            throw new UserNameException("Please enter a invalid first rule password!");
        }
    }
}
