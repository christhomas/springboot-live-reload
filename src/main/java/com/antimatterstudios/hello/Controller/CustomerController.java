package com.antimatterstudios.hello.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.antimatterstudios.hello.Model.Customer;
import com.antimatterstudios.hello.Services.CustomerService;

@RestController
public class CustomerController {
    @Autowired private CustomerService customerService;

    @GetMapping("/customer")
    private ResponseEntity<List<Customer>> queryAllCustomers() {
        return ResponseEntity.ok(customerService.listAll());
    }

    @PostMapping("/customer")
    private ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) throws Exception {
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }

    @PutMapping("/customer")
    public ResponseEntity<Customer> updateUser(@RequestBody Customer user) {
        return ResponseEntity.ok().body(customerService.updateCustomer(user));
    }

    @DeleteMapping("/customer/{id}")
    public HttpStatus deleteUser(@PathVariable String id) {
        customerService.deleteCustomerById(id);
        return HttpStatus.OK;
    }
}
