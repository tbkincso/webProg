<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>EventOrganiser</title>
        <link href="/resources/css/bootstrap/bootstrap.min.css" type="text/css" rel="stylesheet"/>
        <link href="/resources/css/bootstrap/tether.min.css" type="text/css" rel="stylesheet"/>
        <link href="/resources/css/custom.css" type="text/css" rel="stylesheet"/>
        <script src="/resources/js/jquery/jquery-3.2.1.min.js"></script>
        <script src="/resources/js/bootstrap/tether.js"></script>
        <script src="/resources/js/bootstrap/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>

<nav class="navbar navbar-toggleable-md navbar-light bg-faded">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="${contextPath}/admin/profile">Home</a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
              <li class="nav-item">
                <a class="nav-link" href="${contextPath}/admin/event/events">Events<span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="${contextPath}/admin/user/users">Users</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Messages</a>
              </li>
            </ul>
        </div>

        <div>
            <p class = "navbar-text navbar-right">
                Signed in as
                <a href = "#" class = "navbar-link">${name}</a>
            </p>
            <p class = "navbar-text navbar-right">
                 <form method="get" action="/login">
                    <input class = "btn btn-default" type="submit" value="Logout">
                 </form>
            </p>
        </div>
    </nav>

<form method="post" action="events">
    <table class="table custom-table">
        <tr>
            <th>
                <h1>Events</h1>
            </th>
        </tr>
        <tr>
            <td>
                <div class="container">
                <c:if test="${not empty list}">
                     <select multiple class="form-control" id="sel2">
                        <c:forEach var="listValue" items="${list}">
                         <option name="selected"><p class="text-info">${listValue}</p></option>
                        </c:forEach>
                     </select>
                </c:if>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="btn-group" role="group">

                    <input type="submit" class="btn btn-secondary" name="edit" value="Edit">
                    <input type="submit" class="btn btn-secondary" name="delete" value="Delete">
                    <input type="submit" class="btn btn-secondary" name="summary" value="Summary">

                </div>
             </td>
         </tr>
         <tr>
            <td>
                <input class = "btn btn-default" type="submit" name="newEvent" value="Add new event">
            </td>
         </tr>
     </table>
</form>
</body>
</html>