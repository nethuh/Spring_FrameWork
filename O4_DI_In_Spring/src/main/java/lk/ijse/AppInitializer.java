package lk.ijse;

import lk.ijse.bean.Boy;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        ctx.registerShutdownHook();

        Boy tharin = ctx.getBean(Boy.class);
        tharin.trying();
    }
}
