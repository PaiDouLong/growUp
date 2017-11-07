package ll.service.service;

import ll.mapper.AccountMapper;
import ll.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/28.
 */

public interface AccountService {
    public List<Account> getAllAccount();

}
