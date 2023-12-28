package com.example;

import com.example.pojo.Dog;
import com.example.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author libin
 * @Date 2023/12/29
 */
@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired  // 将宠物类自动注入进来
    Dog dog;

    @Test
    void contextLoads01() {
        System.out.println(dog);    // 打印一下宠物对象
    }

    @Autowired  // 将人类自动注入进来
    Person person;

    @Test
    void contextLoads02() {
        System.out.println(person);    // 打印一下人物对象
    }

}