package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class pojoOne implements InitializingBean {

    @Value("${USERNAME}")
    private String myUserName;

    @Value("${os.name}")
    private String osName;

    @Value("${url}")
    private String url;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.myUserName);
        System.out.println(this.osName);
        System.out.println(this.url);
    }
}
