package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.repo.OrderDetailsRepo;
import lk.ijse.spring.repo.OrderRepo;
import lk.ijse.spring.service.PurchaseOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private OrderRepo ordersRepo;

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void purchaseOrder(OrdersDTO dto) {
        if (ordersRepo.existsById(dto.getOid())) {
            throw new RuntimeException(dto.getOid()+ " Is already available.!");
        }

        Orders order = mapper.map(dto, Orders.class);
        ordersRepo.save(order);

        //add Order details also
        //Update Item Qty
        for (OrderDetails od : order.getOrderDetails()) {
            Item item = itemRepo.findById(od.getItemCode()).get();
            item.setQtyOnHand(item.getQtyOnHand()-od.getQty());
            itemRepo.save(item);
        }



    }
}