package com.bjpowernode;

import com.bjpowernode.domain.SysUser;
import com.bjpowernode.service.UserService;
import com.bjpowernode.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //从spring容器中获取 UserService类型的对象 , dao, service都是spring管理的
        String config="ApplicationContext.xml";
        ApplicationContext acx = new ClassPathXmlApplicationContext(config);
        UserService userService = (UserService)acx.getBean("myService");
        SysUser sysUser = new SysUser();
        sysUser.setAge(18);
        sysUser.setName("张三");
        userService.addUser(sysUser);

    }
}
