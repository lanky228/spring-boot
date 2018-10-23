package com.example.demo;

import com.example.demo.model.index.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Index index;

    @Test
    public void indexTest() {
        System.out.println(index.index());
        System.out.println(index.home());
    }

}
