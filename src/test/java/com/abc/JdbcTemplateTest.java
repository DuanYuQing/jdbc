package com.abc;

import com.abc.dao.AccountDao;
import com.abc.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
        // R
        Account account = accountDao.findAccountById(1);
        System.out.println(account);
        // R
        Account account2 = accountDao.findAccountByName("lisi");
        System.out.println(account2);

        // U
        Account account3 = new Account();
        account3.setId(3);
        account3.setName("wangwuwu");
        account3.setMoney(1100.00F);
        accountDao.updateAccount(account3);
    }
}
