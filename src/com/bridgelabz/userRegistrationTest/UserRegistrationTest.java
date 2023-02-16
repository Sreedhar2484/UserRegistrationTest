package com.bridgelabz.userRegistrationTest;

import org.junit.*;
import junit.framework.Assert;

public class UserRegistrationTest {
    @Before
    static void beforeAllTestMsg() {
        System.out.println("-----Welcome to User Registration Problem-----");
    }

    @AfterClass
    static void afterAllTestPassedMsg() {
        System.out.println("All Test Case Passed");
    }

    @After
    public void afterEachTestPassMsg() {
        System.out.println("Happy Test Case");
    }

    @Test
    void given_first_name_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkFirstName("Nagalli"));

    }

    @Test
    void given_last_name_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkLastName("Sreedhar"));

    }

    @Test
    void given_email_id_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkemailId("nagallisree@gmail.com"));
    }

    @Test
    void given_phoneNumber_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.phoneNumber("91 945786485"));
    }

    @Test
    void given_password_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.password("srifhag"));
    }

    @Test
    void given_password1_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.password2("sghren"));
    }

    @Test
    void given_password2_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Boolean result6 = validation.password3("sruifha");
        Assert.assertEquals(true, validation.password3("sruifha"));
    }

    @Test
    void given_password3_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.password4("nsrsgj@"));

    }

    @Test
    void given_emailId_should_return_True() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkEmailSeperate("naga@gmail.com"));

    }
}