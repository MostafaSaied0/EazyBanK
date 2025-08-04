package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetches the account details for a given mobile number.
     *
     * @param mobileNumber - Mobile number of the customer
     * @return CustomerDto containing account details
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates the account details for a given customer.
     *
     * @param customerDto - CustomerDto containing updated account details
     * @return boolean indicating success or failure of the update operation
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Deletes the account for a given mobile number.
     *
     * @param mobileNumber - Mobile number of the customer
     * @return boolean indicating success or failure of the delete operation
     */
    boolean deleteAccount(String mobileNumber);
}
