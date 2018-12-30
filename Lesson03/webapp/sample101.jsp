<%@ page language="java" import="java.util.*" pageEncoding="BIG5"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
  <head>
    <title>My JSP 'sample101.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
       <form method="post" action="j_security_check" >
    	 使用者ID:<input type="text" name="j_username" size="10" /><br>
    	密碼：<input type="password" name="j_password" size="10" /><br>
    	<input type="submit" value="送出" />
    </form>
  </body>
</html>
