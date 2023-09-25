package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        //get System environment variable
//        Map<String, String> env = System.getenv();
//        for (String key : env.keySet()){
//            String value = env.get(key);
//            System.out.println(key + " : "+value);
//        }
//        System.out.println("=====================================");
//         //get java environment variable
//
//       Properties properties = System.getProperties();
//       for (Object key : properties.keySet()){
//           Object value = properties.get(key);
//           System.out.println(key+" : "+value);
//       }

    }
}
