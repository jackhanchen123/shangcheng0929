package com.example.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Userinfo;
import com.example.demo.util.MD5;

@SpringBootTest
public class DeptMapperTest {
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private UserinfoMapper userinfoMapper;


    @Test
    public void testSelectByPrimarykey() throws Exception {
        Dept dept = deptMapper.selectByPrimaryKey(1);
        System.out.println(dept);
    }

    @Test
    public void testSelectByNameAndPwd() throws Exception {
        Userinfo user = userinfoMapper.selectByNameAndPwd("zhangsan", MD5.enctypeMD5("haha123456"));
        System.out.println(user);
    }
}
