package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.ManojiPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        ManojiPojo bean1 = ctx.getBean(ManojiPojo.class);
        System.out.println(bean1);

        ManojiPojo bean2 = ctx.getBean(ManojiPojo.class);
        System.out.println(bean2);
    }
}
