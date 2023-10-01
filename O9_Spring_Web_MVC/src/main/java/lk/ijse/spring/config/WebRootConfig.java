package lk.ijse.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebRootConfig implements BeanNameAware , BeanFactoryAware , ApplicationContextAware , InitializingBean , DisposableBean {
    public WebRootConfig(){
        System.out.println("WebRootConfig : Instantiated");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("WebRootConfig : Bean Factory Awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("WebRootConfig : Bean Name Awareness");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("WebRootConfig : Disposable Bean");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("WebRootConfig : Initializing Bean");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("WebRootConfig : Application Context Awareness");

    }
}
