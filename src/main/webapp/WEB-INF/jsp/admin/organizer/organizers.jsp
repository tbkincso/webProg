<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
    <jsp:include page="../common/header.jsp" />
    <body>
        <jsp:include page="../common/menu.jsp" />

<form method="post" action="organizers">
    <div class="container">
        <table class="table custom-table">
            <tr>
                <th>
                    <h1>Organizers</h1>
                </th>
            </tr>
            <c:if test="${not empty list}">
                <c:forEach var="listValue" items="${list}">
                    <tr>
                        <td>
                            <a href="/admin/organizer/${listValue.id}" title="View"><p class="text-info">${listValue.lastName} ${listValue.firstName}</p></a>
                        </td>
                        <td>
                            <a href="/admin/organizer/edit/${listValue.id}" class="btn btn-info" role="button" title="Edit">Edit</a>
                            <a href="/admin/organizer/delete/${listValue.id}" class="btn btn-info" role="button" title="Delete">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            <tr>
                <td colspan="2">
                    <a href="/admin/organizer/addOrUpdate" class="btn btn-info" role="button" title="Add new organizer">Add new organizer</a>
                </td>
            </tr>
         </table>
     </div>
</form>
</body>
</html>