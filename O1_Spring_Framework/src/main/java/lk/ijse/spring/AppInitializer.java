package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.ManojiPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //ManojiPojo manoji = ctx.getBean(ManojiPojo.class);
        ManojiPojo manoji2 = ctx.getBean(ManojiPojo.class);
        BasicDataSource Bean1 = ctx.getBean(BasicDataSource.class);
        ManojiPojo manoji = (ManojiPojo) ctx.getBean("manoji-pkya") ;
        BasicDataSource bean2 = (BasicDataSource) ctx.getBean("pool");

        System.out.println(manoji);
        //manoji.ManojiisFucking();
        System.out.println(manoji2);
        System.out.println(Bean1);
        System.out.println(bean2);
    }
}
