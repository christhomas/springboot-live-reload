package com.antimatterstudios.hello.Services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antimatterstudios.hello.Model.Customer;
import com.antimatterstudios.hello.Repository.CustomerRepository;

@Service
public class CustomerService {
    private final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired CustomerRepository repository;

    public List<Customer> listAll () {
        List<Customer> allCustomers = this.repository.findAll();
        logger.info("Number of customers: " + allCustomers.size());

        return allCustomers;
    }

    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer getCustomerById(java.util.UUID id) {
        return repository.findById(id).orElse(null);
    }

    public Customer updateCustomer(Customer customer) {
        Optional<Customer> found = repository.findById(customer.getId());

        if (found.isPresent()) {
            Customer c = found.get();
            c.setFirstName(customer.getFirstName());
            c.setLastName(customer.getLastName());

            return repository.save(c);
        } else {
            return null;
        }
    }

    public String deleteCustomerById(java.util.UUID id) {
        repository.deleteById(id);
        return "Customer "+ id + " deleted";
    }
}
