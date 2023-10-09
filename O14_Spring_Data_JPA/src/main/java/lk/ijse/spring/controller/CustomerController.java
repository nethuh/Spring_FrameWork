package lk.ijse.spring.controller;

import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {



    @PostMapping
    public void addCustomer(Customer dto){
        customerRepo.save(dto);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCustomer(String id){
        customerRepo.deleteById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerRepo.findAll();
    }

    @GetMapping(params = {"id"})
    public Customer findCustomer(String id){
        return customerRepo.findById(id).get();
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer c){
        customerRepo.save(c);
    }
}
