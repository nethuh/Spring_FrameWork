package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements Inject{
    @Autowired
    Inter girl;

    public Boy(Inter girl){
        this.girl = girl;
    }

    @Autowired
    public void  setGirl(Inter girl){
        this.girl= girl;
    }
    public void trying(){
//        Girl girl = new Girl();
        girl.chatting();
    }

    @Autowired
    @Override
    public void setInject(Inter gg) {
        this.girl = gg;
    }
}
