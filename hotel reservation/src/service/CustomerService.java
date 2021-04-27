package service;
import model.Customer;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class CustomerService {
    //
    // create a collection to hold all of the customers
    public Collection<Customer> customers = new HashSet<>();

    // add a customer object
    public void addCustomer(String email, String firstName, String lastName) {
        // create a new customer
        Customer newCustomer = new Customer(email, firstName, lastName);
        // add the customer to the collection of customers
        customers.add(newCustomer);
    }

    // get a customer if they are in the customer colletion
    public Customer getCustomer(String customerEmail){
        for (Customer customer: customers) {
            if (customerEmail.equals(customer.email)){
                return customer;
            }
        }
    }

    // return all of the customers if they are in the customer collection
    public Collection<Customer> getAllCustomers(){
        if (!customers.isEmpty()){
            return customers;
        }
    }
}
