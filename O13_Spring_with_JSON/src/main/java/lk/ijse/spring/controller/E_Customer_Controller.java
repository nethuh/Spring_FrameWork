package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class E_Customer_Controller {
//add (POST)
    //delete (DELETE)
    //update (PUT)
    //search (GET)
    //get_all (GET)

    //every response should return a json object including state,message and data
    //return
    @PostMapping
    public ResponseUtil addCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getCusID().equals("C001"))throw new RuntimeException("This is a bad customer");
        return new ResponseUtil("OK","Successfully Added",dto);

}

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        if (id.endsWith("C001"))throw new RuntimeException("This customer cannot deleted.!");
        return new ResponseUtil("Ok", "Successfully Delete", id);
    }


    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getCusID().equals("C001"))throw new RuntimeException("This is a bad Customer, So you can't update this customer.");
        return new ResponseUtil("OK","Successfully Updated",dto);

    }

    @GetMapping(params = "id")
    public ResponseUtil searchCustomer(@RequestParam String id) {
        CustomerDTO customer =new CustomerDTO("C002","Tharin","Matara",1000,null);
        return new ResponseUtil("OK","Successfully Added",customer);

    }


    @GetMapping
    public ResponseUtil getAllCustomers() {
        ArrayList<CustomerDTO> allCustomers= new ArrayList<>();
        allCustomers.add(new CustomerDTO("C001","Diman","Galle",1000,null));
        allCustomers.add(new CustomerDTO("C002","Kamal","Mathara",2000,null));
        allCustomers.add(new CustomerDTO("C003","Iman","Panadura",4000,null));
        allCustomers.add(new CustomerDTO("C004","Ushan","Colombo",5000,null));
        return new ResponseUtil("OK","Successfully Loaded",allCustomers);
    }
}
