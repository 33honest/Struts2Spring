package com.jia.struts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;

import java.util.HashMap;
import java.util.Map;

@Namespace("/user")
public class LoginAction extends BaseAction {


    public String login() {
        String msg = "用户登录";
        outputJson(msg);
        return null;
    }

    @Action(value = "regist")
    public String regist() {
        String msg = "用户注册";
        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        outputJson(map);
        return null;
    }

}
