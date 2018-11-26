<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
     <c:set var="path" value="${pageContext.request.contextPath }" /> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                    <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<ul class="breadcrumb">
				<li>
					<a href="tobb">读者借书</a> <span class="divider">/</span>
				</li>
				<li>
					<a href="toindex">读者还书</a> <span class="divider">/</span>
				</li>
				<li>
					<a href="toms">读者信息</a> <span class="divider">/</span>
				</li>
			</ul>
			<form class="form-horizontal" action="${path }/dm" meth="post">
				<div class="control-group">
				  <label class="control-label" for="inputEmail">名字</label>
					<div class="controls">
						<input id="inputEmail" type="text" name="name"/>
					</div>
				 
					<label class="control-label" for="inputEmail">用户名</label>
					<div class="controls">
						<input id="inputEmail" type="text" name="account"/>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">新密码</label>
					<div class="controls">
						<input id="inputPassword" type="password" name="password"/>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">确认密码</label>
					<div class="controls">
						<input id="inputPassword" type="password" name="password1"/>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<button class="btn" type="submit">登陆</button>
						 <button class="btn" type="butten">返回</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>