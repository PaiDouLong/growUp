package ll.mapper;

import ll.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/28.
 */
@Repository
public interface  AccountMapper {
    public List<Account> getAllAccount();
}
