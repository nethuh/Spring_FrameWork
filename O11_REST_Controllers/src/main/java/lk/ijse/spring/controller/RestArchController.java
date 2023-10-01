package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/rest")
public class RestArchController {
    public RestArchController() {
        System.out.println("RestArchController");
    }

    @GetMapping
    public String getMapping1(HttpServletRequest req, HttpServletResponse res) {
        String id = req.getParameter("id");
        System.out.println(id);
        return "Get Mapping Invoked 1";
    }

    @PostMapping
    public String postMapping() {
        return "Post Method Invoked";
    }
        @PutMapping
        public String putMapping(){
            return "Put Mapping Invoked";
        }

        @DeleteMapping
        public String deleteMapping(){
            return "Delete Mapping Invoked";
        }

    }

