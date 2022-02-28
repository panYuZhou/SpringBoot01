package com.example.demo.controller;

import com.example.demo.bean.Car;
import com.example.demo.bean.Person;
import com.example.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.reactive.filter.OrderedHiddenHttpMethodFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/**
 *
 */

@RestController
public class Controller {
    @Autowired
    private User user;

    @Autowired
    private Car car;

    @Autowired
    private Person person;

    @RequestMapping("/fanSi")
    public String handle01() {
        return "我日死你的妈妈啊";
    }

    @RequestMapping("/car")
    public Car handle02() {
        return car;
    }

    @RequestMapping("/user")
    public User handle03() {
        return user;
    }

    @RequestMapping("/person")
    public Person handle04() {
        return person;
    }


    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String getUser(){
        return "GET-张三";
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public String saveUser(){
        return "POST-张三";
    }


    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }

    //@RequestMapping(value = "/users",method = RequestMethod.DELETE)
    @DeleteMapping(value = "users")
    public String deleteUser(){
        return "DELETE-张三";
    }


    //自定义filter
    @Bean
    public HiddenHttpMethodFilter initialHiddenHttpMethodFilter(){
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }


    @GetMapping("/atguigu")
    public String atguigu(Model model){

        //model中的数据会被放在请求域中 request.setAttribute("a",aa)
        model.addAttribute("msg","你好 guigu");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }

}
