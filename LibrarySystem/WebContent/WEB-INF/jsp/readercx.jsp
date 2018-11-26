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
					<a href="tosb">读者借书</a> <span class="divider">/</span>
				</li>
				<li>
					<a href="toindex">读者还书</a> <span class="divider">/</span>
				</li>
				<li>
					<a href="toms">读者信息</a> <span class="divider">/</span>
				</li>
			</ul>
			<form class="form-search" action="${path}/dbb" meth="post">
				<input class="input-medium search-query" type="text" name="bookname"/> 
				<button type="submit" class="btn">查找</button>
			<a href="tologin"><input type="button"  value="返回"></a>
			</form>
			<table class="table">
				
					<tr>
						<th>
							编号
						</th>
						<th>
							读者姓名
						</th>
						<th>
							借书证号
						</th>
						<th>
							账号
						</th>
						<th>
						密码
						</th>
						
					</tr>
					<c:forEach items="${list}" var="b">
				  <tr>
				  <td>${b.bid}</td>
				  <td>${b.bookname}</td>
				  <td>${b.author}</td>
				  <td>${b.stock}</td>
				  <td>
				<a href="tosb"> <input type="button" value="确定" ></a>
				  </td>
				  </tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
</body>
</html>