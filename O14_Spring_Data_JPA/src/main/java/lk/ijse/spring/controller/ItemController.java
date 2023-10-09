package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService service;

    @PostMapping
    public void saveItem(ItemDTO item){
       service.saveItem(item);
    }
}
