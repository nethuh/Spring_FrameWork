package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form")
public class B_X_WWW_Url_Encoded_Controller {
    //So there are many ways that we can pass data between
    //client and server
    //01 Query String
    //02 X-WWW-Form-Url-Encoded
    //03 JSON
    //04 Path variables with Path Segments

    //02 X-WWW-Form-Url-Encoded
    //How to access above type data from spring
    //@Model Attribute

    @PostMapping("/a")
    public String receiveDataWithFormData1(String id, String name,String address) {
        return "X-WWW-Form-URL-Encoded-Data : "+id+""+name+""+address;
    }

    @PostMapping
    public String receiveDataWithFormData2(@ModelAttribute CustomerDTO dto) {
        return "X-WWW-Form-URL-Encoded-Data : "+dto.toString();
    }
}
