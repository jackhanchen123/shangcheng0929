package com.example.demo.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.Userinfo;
import com.example.demo.util.MD5;

@SpringBootTest
public class StutMapperTest {
    @Autowired
    private StudentMapper StudentMapper;

    @Test
    public void testListAllStu() throws Exception {
        List<Student> list = StudentMapper.listAllStu();
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void testDeleteAllStu() throws Exception {
        Integer[] ids = {4, 5};
        boolean b = StudentMapper.deleteAllStu(ids);
        if (b) {
            System.out.println("删除成功");
        }
    }

}
