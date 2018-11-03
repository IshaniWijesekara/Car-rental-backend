package lk.zeon.carrental.service.impl;

import lk.zeon.carrental.dto.CustomerDto;
import lk.zeon.carrental.entity.Customer;
import lk.zeon.carrental.repository.CustomerRepository;
import lk.zeon.carrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ze on 10/31/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public boolean addCustomerDetail(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setCid(customerDto.getCid());
        customer.setCity(customerDto.getCity());
        customer.setCountry(customerDto.getCountry());
        customer.setFullName(customerDto.getFullName());
        customer.setMobile(customerDto.getMobile());
        customer.setNationality(customerDto.getNationality());
        customer.setNic(customerDto.getNic());

        customerRepository.save(customer);
        return true;
    }

    @Override
    public boolean deleteCustomerDetail(int cid) {
        customerRepository.deleteById(cid);
        return true;

    }

    @Override
    public CustomerDto updateCustomerDetail(CustomerDto customerDto) {
        return null;
    }

    @Override
    public CustomerDto searchCustomerByIDNo(String idNo) {
        return null;
    }
}
