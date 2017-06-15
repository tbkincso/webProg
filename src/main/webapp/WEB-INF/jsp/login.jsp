<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>EventOrganizer</title>
    <link href="resources/css/bootstrap/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/bootstrap/tether.min.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/custom.css" type="text/css" rel="stylesheet"/>
    <script src="resources/js/jquery/jquery-3.2.1.min.js"></script>
    <script src="resources/js/bootstrap/tether.js"></script>
    <script src="resources/js/bootstrap/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
<form method="post" action="login">
    <table class="table custom-table">
        <tr>
            <td colspan="2"><h1>Login</h1></td>
        </tr>
        <c:if test="${not empty errorMsg}">
            <tr>
                <td colspan="2"><div class = "alert alert-danger">${errorMsg}</div></td>
            </tr>
        </c:if>
        <tr>
            <td><label>Username:</label></td>
            <td><input id="username" name="username"></td>
        </tr>
        <tr>
            <td><label>Password:</label></td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input class = "btn btn-default" type="submit" value="Login"></td>
        </tr>
    </table>
</form>
</body>
</html>
