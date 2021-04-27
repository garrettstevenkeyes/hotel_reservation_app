package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    public String email;

    //fvdvdc

    // The email address has to
    private final String emailRegex = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email){
        // if the email does not match the regex pattern throw and invalid argument exceptions
        if (!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Customer: " + firstName + " " + lastName + ". Email:" + email;
    }
}
