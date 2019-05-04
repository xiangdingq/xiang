package com.xiang.japday02.controller;

import com.xiang.japday02.damain.Customer;
import com.xiang.japday02.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTMLDocument;
import java.util.List;
import java.util.Optional;

@RestController
public class test {

    @Autowired
    private CustomerDao customerDao;
    @RequestMapping("helloBoot")
    public String helloBoot(){
        Customer customer = customerDao.getOne(1L);
        System.out.println(customer);
        return "HELLL";
    }

    @RequestMapping("helloBoot1")
    public  String method(){
        Customer customer = customerDao.findJpaName("向飞");
        System.out.println(customer);
        return "成功";
        Specification<C>
    }


}