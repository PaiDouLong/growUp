package ll.controller;


import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import ll.pojo.Account;
import ll.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static javafx.scene.input.KeyCode.O;


/**
 * Created by Administrator on 2017/10/28.
 */
@Controller
public class MyController {
    @Autowired
    private AccountService accountService;


    /***
     * value表示在浏览器输入的地址如：http://localhost:8080/simple-demo/demo
     * method可以不写，默认为GET，当处理POST请求时必须要写method = RequestMethod.POST，否则找不到地址
     *
     * @return 返回的是页面的地址，在配置文件InternalResourceViewResolver中配置prefix和suffix相当于最后返回/WEB-INF/jsp/demo1.jsp
     */
    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo1View(HttpServletRequest request, HttpServletResponse response){
        List<Account> accountList= accountService.getAllAccount();
        PrintWriter out = null;
        try {
            out = response.getWriter();
            JSONObject obj = new JSONObject();
            obj.put("accountList",accountList);
            out.write(obj.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            out.flush();
            if(out !=null){
                out.close();
            }
        }
        return "demo1";
    }

    @RequestMapping("toHtml5")
    public String toHtml5(HttpServletRequest request, HttpServletResponse response){

        return "iHtml5";
    }
    @RequestMapping("toaHtml5")
    public String toaHtml5(HttpServletRequest request, HttpServletResponse response){

        return "aHtml5";
    }
    @RequestMapping("toMyJSP1")
    public String toMyJSP1(HttpServletRequest request, HttpServletResponse response){

        return "toMyJSP1";
    }
}
