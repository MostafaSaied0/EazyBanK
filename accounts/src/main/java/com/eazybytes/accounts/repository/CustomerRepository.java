package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long>{
    /**
     * Method to find a customer by their email address.
     *
     * @param email - Email address of the customer
     * @return Optional<Customer> - Customer object if found, otherwise empty
     */
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
