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
					<a href="toms">读者信息</a> <span class="divider">/</span>
				</li>
			</ul>
			<form class="form-search" action="${path }/doset" method="post">
				
			书籍编号:<input type="text" name="bid"></br>
			借书时长:<input type="text" name="borrowtime"></br>
			借书证号:<input type="text" name="borrowdaynum"></br>
			<input type="submit" value="确定 " >
			<a href="${path }/toindex">	<input type="button" class="btn" value="返回"></a></br>
			</form>
			
			
		</div>
	</div>
</div>
</body>
</html>