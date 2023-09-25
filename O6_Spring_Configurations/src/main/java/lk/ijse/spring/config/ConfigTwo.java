package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTwo {
    public ConfigTwo(){
        System.out.println("Config Two Instantiated");
    }

    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }
}
