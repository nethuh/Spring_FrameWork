package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements BeanNameAware , BeanFactoryAware , ApplicationContextAware, InitializingBean, DisposableBean {
    public BeanB(){

        System.out.println("BeanB : constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name aware");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean Factory Aware");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Con text");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Dead");
    }
}
