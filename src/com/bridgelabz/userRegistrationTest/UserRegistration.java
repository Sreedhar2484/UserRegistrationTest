package com.bridgelabz.userRegistrationTest;

import java.util.regex.*;

public class UserRegistration {

    public static final String VALIDATE_NAME = "^[A-Z]+[a-z]{2,}$";

    public boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }
}