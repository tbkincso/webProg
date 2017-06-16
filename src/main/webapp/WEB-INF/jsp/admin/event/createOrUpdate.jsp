<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../common/header.jsp" />
</head>
    <body>
       <jsp:include page="../common/menu.jsp" />
       <form method="post" action="/admin/event/createOrUpdate">
            <input type="hidden" name="id" value="${event.id}" />
            <div class="page rounded">
               <fieldset class="form-group">
                   <legend>
                        <c:choose>
                            <c:when test = "${empty event.id}">
                                Create new event
                            </c:when>
                            <c:otherwise>
                                Update event
                            </c:otherwise>
                        </c:choose>
                   </legend>
                   <table class="table custom-table">
                       <c:if test="${not empty errorMsg}">
                       <tr>
                           <td colspan="2"><div class = "alert alert-danger">${errorMsg}</div></td>
                       </tr>
                       </c:if>
                       <tr>
                           <td><label>Title:</label></td>
                           <td><input id="title" name="title" value="${event.title}"></td>
                       </tr>
                       <tr>
                           <td><label>Description:</label></td>
                           <td>
                                <textarea id="description" name="description" maxlength="500" rows="5">
                                    ${event.description}
                                </textarea>
                           </td>
                       </tr>
                   </table>
                    <div class="d-flex justify-content-end">
                        <div class="mr-auto p-2">
                            <a href="/admin/event/events" class="btn btn-info" role="button" title="Events">Back</a>
                        </div>
                        <div>
                            <c:choose>
                                <c:when test = "${empty event.id}">
                                    <input class = "btn btn-default" type="submit" value="Create">
                                </c:when>
                                <c:otherwise>
                                    <input class = "btn btn-default" type="submit" value="Update">
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
               </fieldset>
            </div>
       </form>
    </body>
</html>