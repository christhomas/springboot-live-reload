package com.antimatterstudios.hello.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antimatterstudios.hello.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}