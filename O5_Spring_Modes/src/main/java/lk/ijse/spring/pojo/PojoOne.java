package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {
    public PojoOne(){
        System.out.println("Pojo One Instantiated");
    }
//light mode
    @Bean
    public PojoTwo pojoTwo (){
        //Inter bean dependency
        //Inter-Bean dependency invocation
        PojoThree pojoThree = pojoThree();
        PojoThree pojoThree1 = pojoThree();
        System.out.println(pojoThree);
        System.out.println(pojoThree1);


        return new PojoTwo();
    }
    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
