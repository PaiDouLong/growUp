package ll.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/28.
 */
@Data
public class Account implements Serializable{

    private static final long serialVersionUID = 7721801100705523067L;
    /**
     * 用户ID
     */
    private int id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户密码
     */
    private String pwd;
    /**
     * 用户充值金额
     */
    private String money;
    /**
     * 用户邮箱
     */
    private int level;
    /**
     * 用户注册时间
     */
    private String cTime;
    /**
     * 用户上次登陆时间
     */
    private String lTime;
    /**
     * 用户上次退出时间
     */
    private String eTime;
    /**
     * 用户账户状态（是否注销）
     */
    private String state;
    /**
     * 用户邮箱
     */
    private String email;

}
