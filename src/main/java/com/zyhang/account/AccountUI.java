package com.zyhang.account;


import com.zyhang.pojo.User;

/**
 * @author zyhang
 * @create 2020-09-22 10:01 PM
 */
public class AccountUI {

    public static void main(String[] args) {

        User user = new User();

        String username = "zyhhang94";
        String password = "yuanhang19";
        String birthday = "2000-02-29";
        String email = "yuanhang@gmail.com";
        String gender = "Male";

        user.setUsername(username);
        user.setPassword(password);
        user.setBirthday(birthday);
        user.setEmail(email);
        user.setGender(gender);

    }
}
