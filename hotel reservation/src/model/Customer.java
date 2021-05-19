package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    public String email;



    public Customer(String firstName, String lastName, String email){
        // if the email does not match the regex pattern throw and invalid argument exceptions
        email = emailChecker(email);

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Customer: " + firstName + " " + lastName + ". Email:" + email + " ";
    }

    public String getEmail(){
        return email;
    }

    public String getFirstName() {return firstName; }

    public String getLastName() {return lastName; }

    public String emailChecker(String email){
        // The email address has to
        final String emailRegex = "^(.+)@(.+).(.+)$";
        final Pattern pattern = Pattern.compile(emailRegex);

        if (!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid email");
        }
        else {
            return email;
        }

    }
}
