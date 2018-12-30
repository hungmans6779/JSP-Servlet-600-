<%@ page language="java" import="java.util.*" pageEncoding="BIG5"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'sample092.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>

	<body>
		<form method="post" action="http://3w.eztravel.com.tw:8080/Lesson03/servlet/Sample092" >
			<input type="checkbox" name="music" value="搖滾">搖滾
			<span style="margin-left: 1em"></span>
			<input type="checkbox" name="music" value="流行">流行
			<span style="margin-left: 1em"></span>
			<input type="checkbox" name="music" value="爵士">爵士
			<br>
			<input type="submit" value="送出" /> 
            
		</form>
	</body>
</html>
