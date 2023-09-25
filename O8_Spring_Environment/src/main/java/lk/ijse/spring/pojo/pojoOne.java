package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class pojoOne implements InitializingBean {

    @Value("${USERNAME}")
    private String myUserName;

    @Value("${os.name}")
    private String osName;

    @Value("${url}")
    private String url;

    @Value("${dbUserName}")
    private String dbUser;

    @Autowired
    Environment env;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.myUserName);
        System.out.println(this.osName);
        System.out.println(this.url);
        System.out.println(this.dbUser);
        System.out.println(this.env);

        System.out.println("==============================================================================================================");
        String user = env.getProperty("USERNAME");
        String user1 = env.getProperty("url");
        System.out.println(user1);
        System.out.println(user);


    }
}
