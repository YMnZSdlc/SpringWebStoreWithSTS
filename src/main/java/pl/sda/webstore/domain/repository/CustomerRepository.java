package pl.sda.webstore.domain.repository;

import pl.sda.webstore.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAllCustomers();

}
