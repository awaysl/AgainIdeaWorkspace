package service;

import beans.Customer;

import java.util.List;

/**
 * Created by 0100060991 on 2016/9/19.
 */
public interface CustomerService {
    public List<Customer> getCustomerByNumber(String CustomerNumber);
    public int deleteCustomerByNumber(String CustomerNumber);
}
