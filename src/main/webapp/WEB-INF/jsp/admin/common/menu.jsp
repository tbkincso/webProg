<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

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
            <a class="nav-link" href="${contextPath}/admin/organizer/organizers">Organizers</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${contextPath}/admin/message/messages">Messages</a>
          </li>
        </ul>
    </div>

    <div class = "navbar-text navbar-right">
        <table>
            <tr>
                <td class="userLoginData">
                    Signed in as
                    <a href = "#" class = "navbar-link">${name}</a>
                </td>
                <td>
                     <form method="get" action="/login">
                        <input class = "btn btn-default" type="submit" value="Logout">
                     </form>
                </td>
            </tr>
         </table>
    </div>
</nav>