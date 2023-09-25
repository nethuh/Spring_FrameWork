package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {


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
