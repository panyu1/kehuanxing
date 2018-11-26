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
        <title>登录</title>
        <link rel="stylesheet" type="text/css" href="${path}/static/account/login/css/styles.css">
    </head>
    <body >
        <div class="htmleaf-container">
            <div class="wrapper">
                <div class="container">
                    <h3>欢迎登陆！</h3>
                    <form class="form" id="ss"  method="post" action="${path}/dologin">
                        <input type="text" id="account" name="account" placeholder="账号">
                        <input type="password" id="password" name="password"  placeholder="密码">
                        <input type="submit" id="login-button" style="background-color: " value="登陆">
                        <a href="${path}/toregister" style="text-decoration: none"><input type="button" id="register-button" style="background-color: " value="注册"></a>                      
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
        <script src="${path}/static/acccount/login/js/jquery-2.1.1.min.js" type="text/javascript"></script>
        <script>
            $('#login-button').click(function(event) {
                event.preventDefault();
                $('form').fadeOut(500);
                $('.wrapper').addClass('form-success');
               $("#ss").submit();
               window.location.href = "${path}/dologin?"+ $('form').serialize();
               
            });
        </script>
        	<script type="text/javascript">
    	var msg='${msg}';
    	if(msg!=""){
    		alert(msg);
    	}

      </script>
</body>
</html>
