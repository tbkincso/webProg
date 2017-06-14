<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>EventOrganiser</title>
    <link href="resources/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="resources/css/tether.min.css" type="text/css" rel="stylesheet"/>
    <script src="resources/js/jquery-3.2.1.min.js"></script>
    <script src="resources/js/tether.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
<h1>Bejelentkezés</h1>
<form method="post" action="login.do">
    <table class="table">
        <tr>
            <td><label>Felhasználónév:</label></td>
            <td><input id="username" name="username"></td>
        </tr>
        <tr>
            <td><label>Jelszó:</label></td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Bejelentkezés"></td>
        </tr>
    </table>
</form>
<p>${message}</p>
</body>
</html>
