<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="edu.ubbcluj.webprog.backend.model.EventState" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
    <jsp:include page="../common/header.jsp" />
    <body>
        <jsp:include page="../common/menu.jsp" />
        <div class="page rounded">
            <fieldset class="form-group">
                <legend>${organizer.userName}</legend>
                <p>${organizer.lastName} ${organizer.firstName}</p>

                <fieldset class="form-group">
                    <legend>Tasks:</legend>
                    <c:if test="${not empty organizer.taskList}">
                        <table class="table">
                            <c:forEach var="entity" items="${organizer.taskList}">
                                <tr>
                                    <td>${entity.title}</td>
                                    <td>${entity.description}</td>
                                    <td>${entity.deadline}</td>
                                    <td>
                                        <c:choose>
                                            <c:when test = "${entity.state == 0}">
                                                <%= EventState.OPEN %>
                                            </c:when>
                                            <c:when test = "${entity.state == 1}">
                                                <%= EventState.IN_PROGRESS %>
                                            </c:when>
                                            <c:when test = "${entity.state == 2}">
                                                <%= EventState.RESOLVED %>
                                            </c:when>
                                            <c:when test = "${entity.state == 3}">
                                                <%= EventState.CLOSED %>
                                            </c:when>
                                        </c:choose>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:if>
                </fieldset>
                    <div class="d-flex justify-content-end">
                        <div class="mr-auto p-2">
                            <a href="/admin/organizer/organizers" class="btn btn-info" role="button" title="Events">Back</a>
                        </div>
                        <div>
                            <a href="/admin/organizer/edit/${event.id}" class="btn btn-info" role="button" title="Edit">Edit</a>
                            <a href="/admin/organizer/delete/${event.id}" class="btn btn-info" role="button" title="Delete">Delete</a>
                        </div>
                    </div>
            </fieldset>
        </div>
    </body>
</html>
