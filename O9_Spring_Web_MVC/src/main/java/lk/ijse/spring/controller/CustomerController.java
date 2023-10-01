package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")//handler mapping
public class CustomerController {

    //handler methods
    //handler mapping
    @GetMapping//which http method
    public String helloSpring(){
        return "Hello I am Spring: your Request Received";
    }
}
