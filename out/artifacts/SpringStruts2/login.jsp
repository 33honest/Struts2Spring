<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>
<s:form name="login" action="user.action">
    用户名：<input type="text" name="name" value="" />
    <input type="submit" value="登录">
</s:form>
</body>
</html>