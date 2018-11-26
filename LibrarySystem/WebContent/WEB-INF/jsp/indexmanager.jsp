<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
     <c:set var="path" value="${pageContext.request.contextPath }" />  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
					<a href="tr">读者信息查询</a> <span class="divider">/</span>
				</li>
			</ul>
			<form class="form-horizontal" action="${path }/doindex" method="post">
				<div class="control-group">
					 <label class="control-label" for="inputEmail">书籍名称</label>
					<div class="controls">
						<input type="text" name="bookname"/>
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputPassword" >书籍作者</label>
					<div class="controls">
						<input  type="text" name="author"/>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						 <input type="submit" class="btn" value="确定">
						  <input type="button" class="btn" value="返回">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
 <script src="${path}/static/account/login/js/jquery-2.1.1.min.js"></script>
</body>
</html>