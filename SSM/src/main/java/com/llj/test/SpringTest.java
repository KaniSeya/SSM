package com.llj.test;

import com.llj.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

public class SpringTest {

    @Test
   public void test()
   {
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
       AccountService accountService = ac.getBean("accountService",AccountService.class);
       accountService.findAll();
   }
}
