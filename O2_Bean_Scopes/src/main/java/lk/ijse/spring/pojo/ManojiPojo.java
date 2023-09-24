package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ManojiPojo {
    public ManojiPojo(){
        System.out.println("Hukamu ManojiPojo");
    }
    public void ManojiisFucking(){
        System.out.println("ah ah aaaaaaaaaa");
    }
}