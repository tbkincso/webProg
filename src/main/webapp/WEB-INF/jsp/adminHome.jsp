<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home Page</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class = "navbar navbar-default" role = "navigation">

   <div class = "navbar-header">
      <button type = "button" class = "navbar-toggle"
         data-toggle = "collapse" data-target = "#example-navbar-collapse">
         <span class = "sr-only">Toggle navigation</span>
         <span class = "icon-bar"></span>
         <span class = "icon-bar"></span>
         <span class = "icon-bar"></span>
      </button>

      <a class = "navbar-brand" href = "#">Event Organizer</a>
   </div>

   <div class = "collapse navbar-collapse" id = "example-navbar-collapse">

      <ul class = "nav navbar-nav">
        <li class = "dropdown">
         	<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">
         		Rendezvények
         		<b class = "caret"></b>
         	</a>
         	<ul class = "dropdown-menu">
         	   <li><a href = "#">Rendezvények listázása</a></li>
               <li><a href = "#">Új rendezvény</a></li>
               <li><a href = "#">Rendezvények módosítása</a></li>
               <li><a href = "#">Összesítések megjelenítése</a></li>
           	</ul>
       	</li>

         <li class = "dropdown">
            <a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">
               Szervezők
               <b class = "caret"></b>
            </a>

            <ul class = "dropdown-menu">
               <li><a href = "#">Szervezők listázása</a></li>
               <li><a href = "#">Új szervező</a></li>
               <li><a href = "#">Szervezők adatainak módosítása</a></li>
               <li><a href = "#">Szervezők törlése</a></li>
            </ul>

         </li>

         <li class = "active"><a href = "#">Üzenetek</a></li>

      </ul>
   </div>

</body>
</html>