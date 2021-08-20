<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login Page</title>
</head>
<body>
	<h3>Đăng nhập</h3>
	<p>${message}</p>
	<form method="post" action="login.htm" >
		<div>Username:</div>
		<input type="text" name="id" />
		<div>Password:</div>
		<input type="password" name="password" />
		<hr>
		<button>Login</button>
	</form>
</body>
</html>