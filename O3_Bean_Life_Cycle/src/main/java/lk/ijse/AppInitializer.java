package lk.ijse;

import lk.ijse.bean.BeanA;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        BeanA bean = ctx.getBean(BeanA.class);
        System.out.println(bean);
        BeanA bean1 = ctx.getBean(BeanA.class);
        System.out.println(bean1);
        ctx.close();
    }
}
