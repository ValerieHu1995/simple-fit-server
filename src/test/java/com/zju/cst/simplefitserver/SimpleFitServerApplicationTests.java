package com.zju.cst.simplefitserver;

import com.zju.cst.simplefitserver.event.MsgEvent;
import com.zju.cst.simplefitserver.model.InfoUser;
import com.zju.cst.simplefitserver.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleFitServerApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        //applicationContext.publishEvent(new MsgEvent("aaa", "read", "qweqweqwe"));

    }

    @Test
    public void testCache(){


        //InfoUser infoUser = new InfoUser();
        // infoUser.setUsername("chenzhou");
        //System.out.println(this.userService.insertSelective(userInfo));

        /*
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(152);
        userInfo.setPassword("aaaaaa");


        System.out.println("before,"+this.userService.getUserInfoByName("chenzhou1234444").getPassword());

        this.userService.updateByPrimaryKeySelective(userInfo);

        System.out.println("after,"+this.userService.getUserInfoByName("chenzhou1234444"));
        */
        System.out.println(this.userService.getUserInfoByName("chenzhou"));


    }


}
