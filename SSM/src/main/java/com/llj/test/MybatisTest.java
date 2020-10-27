package com.llj.test;

import com.llj.dao.AccountDao;
import com.llj.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao accountdao = session.getMapper(AccountDao.class);
        List<Account> accounts = accountdao.findAll();
        for(Account account : accounts)
        {
            System.out.println(account);
        }
        session.close();
        in.close();
    }
}
