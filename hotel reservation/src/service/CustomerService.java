package service;
import model.Customer;
import java.util.*;

public class CustomerService {
    // create a map of all the customers there are
    public Collection<Customer> setOfCustomers = new HashSet<Customer>();
    // creating a static reference for the customer service class
    private static CustomerService customerService = null;

    private CustomerService() {}

    // create a static customer service
    public static CustomerService getInstance() {
        if (null == customerService) {
            customerService = new CustomerService();
        }
        return customerService;
    }

    // create a new object when a customer is being created
    public void addCustomer(String email, String firstName, String lastName) {
        // create a new customer
        Customer newCustomer = new Customer(email, firstName, lastName);
        // add the customer to the collection of customers
        setOfCustomers.add(newCustomer);
    }

    // retrieve a customer from the map
    public Customer getCustomer(String customerEmail){
        for (Customer customer : setOfCustomers) {
            if((customer.getEmail()).equals(customerEmail)){
                return customer;
            }
        }
        return null;
    }

    // return all of the customers if they are in the customer collection
    public Collection<Customer> getAllCustomers(){
        return setOfCustomers;
    }
}
