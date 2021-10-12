package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/*****
 * @Author: www.itheima.com
 * @Description: com.itheima.controller
 ****/
@Controller
@RequestMapping(value = "/test")
public class TestController {


    /****
     * 编写一个方法，跳转到demo1.html
     */
    @RequestMapping(value = "/hello")
    public String hello(Model model){
        model.addAttribute("username","张三");


        //集合数据
        List<User> users = new ArrayList<User>();
        users.add(new User(1,"张三","吴京"));
        users.add(new User(2,"李四","天津"));
        users.add(new User(3,"王五","南京"));
        users.add(new User(4,"赵六","北京"));
        model.addAttribute("users",users);


        //Map定义
        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("No","123");
        dataMap.put("address","深圳");
        model.addAttribute("dataMap",dataMap);

        //存储一个数组
        String[] names = {"张三","李四","王五"};
        model.addAttribute("names",names);

        //日期
        model.addAttribute("now",new Date());

        //if条件
        model.addAttribute("age",22);
        return "demo1";
    }

}
