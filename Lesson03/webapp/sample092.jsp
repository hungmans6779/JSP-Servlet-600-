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
			<input type="checkbox" name="music" value="�n�u">�n�u
			<span style="margin-left: 1em"></span>
			<input type="checkbox" name="music" value="�y��">�y��
			<span style="margin-left: 1em"></span>
			<input type="checkbox" name="music" value="��h">��h
			<br>
			<input type="submit" value="�e�X" /> 
            
		</form>
	</body>
</html>
