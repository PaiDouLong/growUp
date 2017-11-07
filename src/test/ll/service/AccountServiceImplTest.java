package ll.service;

import ll.mapper.AccountMapper;
import ll.pojo.Account;
import ll.service.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/10/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//这个是用来加载写好的配置文件，传入的值是数组形式多个配置文件如下 {"····","·······"}
@ContextConfiguration({"classpath:spring/spring-dao-config.xml","classpath:spring/spring-web.xml","classpath:spring/spring-service.xml"})
public class AccountServiceImplTest  {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void getAllAccount() throws Exception {
        List<Account> accountList = accountMapper.getAllAccount();
        System.out.println("accountList=" + accountList.toString());
    }


}