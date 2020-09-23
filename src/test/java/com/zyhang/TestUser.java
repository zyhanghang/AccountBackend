package com.zyhang;

import com.zyhang.pojo.User;
import org.junit.Test;

/**
 * @author zyhang
 * @create 2020-09-22 11:21 PM
 */
public class TestUser {

    @Test
    public void testUsername() {
        User user = new User();
        user.setUsername("hang123");
    }

    @Test
    public void testPassWord() {
        User user = new User();
        user.setPassword("1zyhaggg##");
    }

    @Test
    public void testEmail() {
        User user = new User();
        user.setEmail("yuanhang@gmail.com");
    }

    @Test
    public void testGender() {
        User user = new User();
        user.setGender("Male");
    }

    @Test
    public void testBirthDay() {
        User user = new User();
        user.setBirthday("2001-02-28");
    }


}
