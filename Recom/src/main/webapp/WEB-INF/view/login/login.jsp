<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recom login</title>
</head>
<center><body>
<h1>Recom</h1>
<h2>Recomへようこそ！</h2>
	<p style="color:red;">${loginErrorMessages}</p>
	 <s:form>
      ID  <input type="text" name="userId" required><br>
      PASSWORD  <input type="password" name="userPass" required>
        <input type="submit" name="login" value="ログイン" >
     </s:form>

</body>
</center>
</html>