package lk.ijse.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public AppConfig(){

        System.out.println("App Config- Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name aware");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Dead2");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context");

    }
}
