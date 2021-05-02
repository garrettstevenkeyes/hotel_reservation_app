package api;
import model.Customer;
import service.CustomerService;

public class HotelResource {
    public static HotelResource hotelResource;

    public Customer getCustomer(String email){
        return CustomerService.getCustomer(email);
    }

}
