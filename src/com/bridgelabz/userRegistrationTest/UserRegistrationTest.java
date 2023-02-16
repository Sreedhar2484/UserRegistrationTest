package com.bridgelabz.userRegistrationTest;

import org.junit.*;
import junit.framework.Assert;

public class UserRegistrationTest {
    @Before
    public void welcomeMsg() {
        System.out.println("Welcome to User Registration Problem");
    }

    @After
    public void afterTest() {

        System.out.println("after every test case");
    }

    @Test
    public void checkFirstName() {
        UserRegistration validation = new UserRegistration();
        Assert.assertEquals(true, validation.checkFirstName("Sreedhar"));
    }

    @Test
    public void checkLastName() {
        UserRegistration validation = new UserRegistration();
        Assert.assertEquals(true, validation.checkLastName("Nagalli"));
    }

    @Test
    public void checkEmail() {
        UserRegistration validation = new UserRegistration();
        Assert.assertEquals(true, validation.checkEmail("nsridhary2k@gmail.com"));
    }

    @Test
    public void checkMobileNumber() {
        UserRegistration validation = new UserRegistration();
        Assert.assertEquals(true, validation.checkMobileNumber("91 6746847843"));
    }

    @Test
    public void checkPassword() {
        UserRegistration validation = new UserRegistration();
        Assert.assertEquals(true, validation.checkPassword("Sri19189"));
    }
    
    @Test
    public void checkPasswordSecondRule() {
        UserRegistration validation = new UserRegistration();
        Assert.assertEquals(true, validation.checkPasswordSecondRule("Srinu123"));
    }
    
    @Test
    public void checkPasswordThirdRule() {
        UserRegistration validation = new UserRegistration();
        Assert.assertEquals(true, validation.checkPasswordThirdRule("Srinu123"));
    }
}
