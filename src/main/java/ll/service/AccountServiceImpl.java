package ll.service;

import ll.mapper.AccountMapper;
import ll.pojo.Account;
import ll.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/28.
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    public List<Account> getAllAccount(){
        List<Account> accountList=new ArrayList<Account>();
        accountList=accountMapper.getAllAccount();
        return accountList;
    }

}
