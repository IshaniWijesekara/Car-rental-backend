package lk.zeon.carrental.service;

import lk.zeon.carrental.dto.CustomerDto;
import lk.zeon.carrental.entity.Customer;

/**
 * Created by Ze on 10/31/2018.
 */
public interface CustomerService {
    public boolean addCustomerDetail(CustomerDto customerDto);
    public boolean deleteCustomerDetail(CustomerDto customerDto);
    public  CustomerDto updateCustomerDetail(CustomerDto  customerDto);
    public CustomerDto searchCustomerByIDNo(String idNo);

}
