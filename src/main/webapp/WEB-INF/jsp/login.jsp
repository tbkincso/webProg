<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page - EventOrganiser</title>
</head>
<body>
<h1>Welcome to EventOrganiser!</h1>
<form method="post" action="login.do">
    <label>Username:</label>
    <input id="username" name="username"><br>
    <br><label>Password:</label>
    <input id="password" name="password" type="password"><br>
    <br><input type="submit" value="Login">
</form>
<p>${message}</p>
</body>
</html>