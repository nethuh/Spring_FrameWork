package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {
     void addCustomer(CustomerDTO dto);


     void deleteCustomer(String id);


     List<CustomerDTO> getAllCustomer();


     CustomerDTO findCustomer(String id);


     void updateCustomer( CustomerDTO c);
}
