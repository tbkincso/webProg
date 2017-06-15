<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>

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
    <body>

    <nav class="navbar navbar-toggleable-md navbar-light bg-faded">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="#">Home</a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
              <li class="nav-item">
                <a class="nav-link" href="#">Events<span class="sr-only">(current)</span></a>
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

    </body>
</body>
</html>
