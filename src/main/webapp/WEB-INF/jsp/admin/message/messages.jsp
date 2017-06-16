<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="../common/header.jsp" />
<body>
   <jsp:include page="../common/menu.jsp" />
<form method="post" action="messages">
    <table class="table custom-table">
        <tr>
            <th>
                <h1>Messages</h1>
            </th>
        </tr>
        <tr>
            <td>
                <div class="container">
                <c:if test="${not empty list}">
                     <select multiple class="form-control" name="selected">
                        <c:forEach var="listValue" items="${list}">
                         <option><p class="text-info">
                                ${listValue}
                         </option>
                         <p>
                        </c:forEach>
                     </select>
                </c:if>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="btn-group" role="group">
                    <input type="submit" class="btn btn-secondary" name="delete" value="Delete">
                </div>
             </td>
         </tr>
         <tr>
            <td>
                <input class = "btn btn-default" type="submit" name="newMessage" value="New Message">
            </td>
         </tr>
     </table>
</form>
</body>
</html>