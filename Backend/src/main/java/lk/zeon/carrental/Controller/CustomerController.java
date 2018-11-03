package lk.zeon.carrental.Controller;

import lk.zeon.carrental.dto.CustomerDto;
import lk.zeon.carrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCustomer(@RequestBody CustomerDto customerDto){
        return customerService.addCustomerDetail(customerDto);
    }

    @DeleteMapping(value = "/{cid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteCustomer(@PathVariable("cid") int cid){
        return customerService.deleteCustomerDetail(cid);
    }
}
