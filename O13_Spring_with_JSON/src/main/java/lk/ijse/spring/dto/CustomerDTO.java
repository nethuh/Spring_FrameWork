package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String cusID;
    private String cusName;
    private String cusAddress;
    private  double cusSalary;
    private ArrayList<ItemDTO> items;

}
