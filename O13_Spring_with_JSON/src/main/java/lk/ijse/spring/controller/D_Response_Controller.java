package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response")
public class D_Response_Controller {
    //So how to send back data with JSON
    //In java EE we use Json Processing. in here.?

    //ResponseUtil
    //@ResponseStatus(HttpStatus.CREATED)

    @GetMapping
    public String sendJsonData(){
        return "Send Json Data";
    }
}
