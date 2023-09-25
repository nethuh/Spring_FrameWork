package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigThree {
    public ConfigThree(){
        System.out.println("Config Three Instantiated");
    }
    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
