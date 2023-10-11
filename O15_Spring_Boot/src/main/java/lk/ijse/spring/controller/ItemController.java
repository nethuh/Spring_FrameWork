package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/item")
@CrossOrigin // will support to cors requests
public class ItemController {

    @Autowired
    ItemService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO dto) {
        service.saveItem(dto);
        return new ResponseUtil("OK", "Successfully Registered.!", null);
    }

    @DeleteMapping(params = {"code"})
    public ResponseUtil deleteItem(@RequestParam String code) {
        service.deleteItem(code);
        return new ResponseUtil("OK", "Successfully Deleted. :" + code, null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto) {
        service.updateItem(dto);
        return new ResponseUtil("OK", "Successfully Updated. :" + dto.getCode(), null);
    }

    @GetMapping
    public ResponseUtil getAllItems() {
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllItems());
    }

}