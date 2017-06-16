<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="../common/header.jsp" />
<body>
   <jsp:include page="../common/menu.jsp" />
   <form method="post" action="/admin/organizer/addOrUpdate">
        <input type="hidden" name="id" value="${organizer.id}" />
        <div class="page rounded">
           <fieldset class="form-group">
               <legend>
                    <c:choose>
                        <c:when test = "${empty organizer.id}">
                            Add new organizer
                        </c:when>
                        <c:otherwise>
                            Update organizer
                        </c:otherwise>
                    </c:choose>
               </legend>
                <table class="table custom-table">
                   <tr>
                       <th colspan="2">
                           <h1>Add new organizer</h1>
                       </th>
                   </tr>
                   <c:if test="${not empty errorMsg}">
                   <tr>
                       <td colspan="2"><div class = "alert alert-danger">${errorMsg}</div></td>
                   </tr>
                   </c:if>
                   <tr>
                       <td><label>Username*:</label></td>
                       <td><input name="username" value=${organizer.userName}></td>
                   </tr>
                   <tr>
                       <td><label>First name*:</label></td>
                       <td><input name="firstname" value=${organizer.firstName}></td>
                   </tr>
                   <tr>
                       <td><label>Last name*:</label></td>
                       <td><input name="lastname"  value=${organizer.lastName}></td>
                   </tr>
                   <tr>
                       <td><label>Password*:</label></td>
                       <td><input type="password" name="password"></td>
                   </tr>
                   <tr>
                       <td><label>Telephone:</label></td>
                       <td><input name="telephone"  value=${organizer.telephone}></td>
                   </tr>
           </table>
               <div class="d-flex justify-content-end">
                   <div class="mr-auto p-2">
                       <a href="/admin/organizer/organizers" class="btn btn-info" role="button" title="Organizers">Back</a>
                   </div>
                   <div>
                       <c:choose>
                           <c:when test = "${empty organizer.id}">
                               <input class = "btn btn-default" type="submit" value="Add">
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