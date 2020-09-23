package com.zyhang.pojo;

import com.zyhang.utils.RegisterUtils;

/**
 * @author zyhang
 * @create 2020-09-22 8:15 PM
 */
public class User {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private String birthday;
    private String gender;

    public User() {
    }

    public User(String username, String password, String email, String birthday, String gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (RegisterUtils.isValidUsername(username)) {
            System.out.println("set username successfully");
            this.username = username;
        } else {
            System.out.println("invalid username");
            System.out.println("rule 1: username must contain 5-12 characters");
            System.out.println("rule 2: only digits and letters allowed");
            System.out.println("rule 3: the first character must be a letter");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (RegisterUtils.isValidPassword(password)) {
            System.out.println("set password successfully");
            this.password = password;
        } else {
            System.out.println("invalid password");
            System.out.println("rule1: password length must contain 6-20 characters");
            System.out.println("rule2: password must contain letters and digits, it can contain special characters");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (RegisterUtils.isValidEmail(email)) {
            System.out.println("set email successfully");
            this.email = email;
        } else {
            System.out.println("invalid email");
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        if (RegisterUtils.isValidBirthday(birthday)) {
            System.out.println("set birthday successfully");
            this.birthday = birthday;
        } else {
            System.out.println("invalid birthday");
            System.out.println("birthday syntax should be yyyy-MM-dd");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (RegisterUtils.isValidGender(gender)) {
            System.out.println("set gender successfully");
            this.gender = gender;
        } else {
            System.out.println("invalid gender");
            System.out.println("invalid gender must be Male or Female (case sensitive)");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
