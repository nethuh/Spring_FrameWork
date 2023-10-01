package lk.ijse.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.pojo","lk.ijse.spring.controller"})
public class WebAppConfig implements BeanNameAware , BeanFactoryAware, ApplicationContextAware, InitializingBean , DisposableBean {
    public WebAppConfig(){
        System.out.println("WebAppConfig : Instantiated");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("WebAppConfig : Bean Factory Awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("WebAppConfig : Bean Name Awareness");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("WebAppConfig : Disposable Bean");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("WebAppConfig : Initializing Bean");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("WebAppConfig : Application Context Awareness");

    }
}
