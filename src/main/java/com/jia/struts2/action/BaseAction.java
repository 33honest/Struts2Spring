package com.jia.struts2.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseAction extends ActionSupport {

    public void outputJson(Object obj) {

        PrintWriter out = null;
        HttpServletResponse httpServletResponse = ServletActionContext.getResponse();
        httpServletResponse.setContentType("application/json");
//        httpServletResponse.setContentType("text/html");
        httpServletResponse.setCharacterEncoding("UTF-8");
        String json = null;
        try {
            out = httpServletResponse.getWriter();
//            JSON.toJSONString(obj);
            json = JSON.toJSONStringWithDateFormat(obj, "yyyy-mm-dd HH:mm:ss", SerializerFeature.DisableCircularReferenceDetect);
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.print(json);
        out.flush();
        out.close();
    }

}
