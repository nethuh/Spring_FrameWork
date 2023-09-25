package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig(){
        System.out.println("App Config Instantiated");
    }
    @Bean
    public PojoOne pojoOne(){
        return new PojoOne();
    }
}
