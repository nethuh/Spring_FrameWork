package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional // manage all the transactions here // AOP
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepo itemRepo;

    @Autowired
    ModelMapper mapper;

    @Autowired
    private ItemRepo repo;


    @Override
    public void saveItem(ItemDTO dto) {
        if (repo.existsById(dto.getCode())){
            throw new RuntimeException(dto.getCode()+ " : Item already registered.!");
        }
        repo.save(mapper.map(dto, Item.class));
    }

    @Override
    public void deleteItem(String code) {
        if (!repo.existsById(code)){
            throw new RuntimeException(code+ " : Item Not Exists to Delete.!");
        }
        repo.deleteById(code);
    }

    @Override
    public void updateItem(ItemDTO dto) {
        if (!repo.existsById(dto.getCode())){
            throw new RuntimeException(dto.getCode()+ " : Item Not Exist for Update.!");
        }
        repo.save(mapper.map(dto, Item.class));
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return mapper.map(repo.findAll(),new TypeToken< List<ItemDTO>>(){}.getType());
    }

    @Override
    public ItemDTO findItem(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException(id+ " : Item Not Exist for search.!");
        }
        return mapper.map(repo.findById(id).get(), ItemDTO.class);
    }
}