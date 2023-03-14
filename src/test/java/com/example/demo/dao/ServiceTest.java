package com.example.demo.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Userinfo;
import com.example.demo.service.ICardService;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private ICardService cardService;

    @Test
    public void testSelectByNameAndPwd() throws Exception {
        Userinfo user = cardService.selectByNameAndPwd("zhangsan", "123456");
        System.out.println(user);
    }

    @Test
    public void testListAllStu() throws Exception {
        List<Student> list = cardService.listAllStu();
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
