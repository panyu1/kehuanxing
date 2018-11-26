<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="zh">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>注册</title>
        <link rel="stylesheet" type="text/css" href="${path}/static/member/login/css/styles.css">
    </head>
    <body>
        <div class="htmleaf-container">
            <div class="wrapper">
                <div class="container">
                    <h3>欢迎注册！</h3>
                    <form class="form" id="ss" action="${path}/doregister" method="post">
                    	<input type="text" id="name" name="name" placeholder="姓名">
                        <input type="text" id="account" name="account" placeholder="账号">
                        <input type="text" id="wordcardnum" name="wordcardnum" placeholder="工作证号">
                        <input type="password" id="password" name="password" placeholder="请输入密码">
                        <input type="password" id="password2" name="password2" placeholder="再次输入密码">
                        <input type="submit" id="login-button"  class="button" value="注册">   
                         <a href="${path}/tologin" style="text-decoration: none"><input type="button"  value="返回登录页面"></a>             
                    </form>
                </div>
                <ul class="bg-bubbles">
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
        </div>
        <script src="${path}/static/reader/login/js/jquery-2.1.1.min.js" type="text/javascript"></script>
        
     
   </body>
</html>
