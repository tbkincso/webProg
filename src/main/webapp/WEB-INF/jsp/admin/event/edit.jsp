<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>EventOrganizer</title>
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
                <a class="nav-link" href="${contextPath}/admin/organizer/organizers">Organizers</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="${contextPath}/admin/message/messages">Messages</a>
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

    <form method="post" action="edit">
    <table>
        <tr>
            <th>
                <h1>Edit event</h1>
            </th>
        </tr>
        <tr>
           <td><label>Title:</label></td>
           <td><textarea type="submit" name="title">${title}</textarea></td>
        </tr>
        <tr>
           <td><label>Description:</label></td>
           <td><textarea type="submit" name="description">${description}</textarea></td>
        </tr>
         <tr>
            <td colspan="2">
               <button type="button" class="btn btn-default" data-toggle="modal" data-target="#largeShoes">Add Task</button>

               <!-- The modal -->
               <div class="modal fade" id="largeShoes" tabindex="-1" role="dialog" aria-labelledby="modalLabelLarge" aria-hidden="true">
               <div class="modal-dialog modal-lg">
                   <div class="modal-content">
                       <div class="modal-header">
                           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                               <span aria-hidden="true">&times;</span>
                           </button>
                           <h4 class="modal-title" id="modalLabelLarge">New Task</h4>
                       </div>
                       <div class="modal-body">
                           <table>
                               <tr>
                                   <td>
                                       <label>Title:</label>
                                   </td>
                                   <td>
                                       <input name="taskTitle">
                                   </td>
                               </tr>
                               <tr>
                                   <td>
                                       <label>Description:</label>
                                   </td>
                                   <td>
                                       <textarea id="taskDescription" name="description" maxlength="500" rows="5"></textarea>
                                   </td>
                               </tr>
                               <tr>
                                   <td>
                                       <label>Deadline:</label>
                                   </td>
                                   <td>
                                      <input type="text" name="deadline" />
                                   </td>
                               </tr>
                           </table>
                       </div>

                   </div>
               </div>
               </div>
            </td>
        </tr>
        <tr>
          <td colspan="2"><input class = "btn btn-default" type="submit" value="Edit"></td>
        </tr>
       </table>
       </form>
</body>
</html>