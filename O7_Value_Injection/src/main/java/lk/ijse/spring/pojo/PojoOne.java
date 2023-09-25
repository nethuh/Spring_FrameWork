package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean {
    @Value("Galle IJSE")
    private String address;

    public PojoOne(@Value("C001,C002,C003") String[] ids) {
        System.out.println(address);
        System.out.println("PojoOne Instantiated" + ids);
        for (String id : ids) {
            System.out.println(id);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.address);
    }
    @Autowired(required = false)
    public PojoOne (@Value("Dasun")String name,@Value("Galle")String address){
        System.out.println("Constructor Two");
    }
    @Autowired(required = false)
    public PojoOne (@Value("Dasun")String name){
        System.out.println("Constructor One");
    }
}
