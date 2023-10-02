package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class C_JSON_Controller {
    //So there are many ways that we can pass data between
    //client and server
    //01 Query String
    //02 X-WWW-Form-Url-Encoded
    //03 JSON
    //04 Path variables with Path Segments

    //03 JSON
    //How to access above type data from spring
    //@RequestBody -> HTTP Converters

    @PostMapping
    public String receiveDataWithJson(){
        return "Json Data : ";
    }

}
