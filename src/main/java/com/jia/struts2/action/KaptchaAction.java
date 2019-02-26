package com.jia.struts2.action;

import com.google.code.kaptcha.servlet.KaptchaExtend;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class KaptchaAction extends BaseAction {

    @Autowired
    private KaptchaExtend kaptchaExtend;

    @Action("kaptcha")
    public String kaptcha() {

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();

        try {
            kaptchaExtend.captcha(request, response);
            System.out.println(kaptchaExtend.getGeneratedKey(request));
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
