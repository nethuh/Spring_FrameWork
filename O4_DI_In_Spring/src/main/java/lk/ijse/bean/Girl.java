package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Inter {
    public Girl(){
        System.out.println("Girl Instantiated");
    }

    public void chatting(){
        System.out.println("La la");
    }
}
