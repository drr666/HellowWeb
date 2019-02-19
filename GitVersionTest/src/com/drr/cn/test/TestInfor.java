package com.drr.cn.test;

import com.drr.cn.model.User;

public class TestInfor {

    public static void main(String[] args) {
        User user = new User();
        user.setUserName("nick");
        user.setAge(20);

        System.out.println("用户姓名:"+user.getUserName());
        System.out.println("用户年龄:"+user.getAge());
    }
}
