package pl.sda.webstore.domain.repository.impl;

import org.springframework.stereotype.Repository;
import pl.sda.webstore.domain.Customer;
import pl.sda.webstore.domain.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customerList = new ArrayList();

    public InMemoryCustomerRepository() {
        Customer firstCustomer = new Customer("No01", "Adam Słodowy", "Poznań");
        Customer secondCustomer = new Customer("No02", "Adam Niezgódka", "Pcim");
        Customer thirdCustomer = new Customer("No03", "Adam Miałczyński", "Łódź");
        Customer fourthCustomer = new Customer("No04", "Janusz Nosacz", "Zgierz");
        Customer fifthCustomer = new Customer("No05", "Janusz Passatolub", "Wrocław");
        Customer sixthCustomer = new Customer("No06", "Janusz Januszewski", "Gdynia");

        customerList.add(firstCustomer);
        customerList.add(secondCustomer);
        customerList.add(thirdCustomer);
        customerList.add(fourthCustomer);
        customerList.add(fifthCustomer);
        customerList.add(sixthCustomer);
    }


    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }
}
