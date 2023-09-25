package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {
    public PojoOne(@Value("Hello Spring")String id){
        System.out.println("PojoOne Instantiated"+id);
    }
}

