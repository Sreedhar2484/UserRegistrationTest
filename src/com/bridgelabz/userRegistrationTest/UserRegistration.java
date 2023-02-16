package com.bridgelabz.userRegistrationTest;

import java.util.regex.*;

public class UserRegistration {

    public static final String VALIDATE_NAME = "^[A-Z]+[a-z]{2,}$";
    public static final String EMAIL_ID = "^[a-z]{3,}[.][a-z]{3,}[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}[.][a-z]{2,}$";
    public static final String PHONE_NUMBER = "^[91]+[ ][6-9]{1}[0-9]{9}$";
    public static final String PASSWORD_FIRSTRULE = "[A-Za-z0-9]{8,}$";

    public boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }

    public boolean checkLastName(String lastName) {
        return (Pattern.matches(VALIDATE_NAME, lastName));
    }

    public boolean checkEmail(String email) {
        return (Pattern.matches(EMAIL_ID, email));
    }

    public boolean checkMobileNumber(String phoneNumber) {
        return (Pattern.matches(PHONE_NUMBER, phoneNumber));
    }

    public boolean checkPassword(String PASSWORD) {
        return (Pattern.matches(PASSWORD_FIRSTRULE, PASSWORD));
    }
}