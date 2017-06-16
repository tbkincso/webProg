<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../common/header.jsp" />
    <script src="/resources/js/canvas/jquery.canvasjs.min.js"></script>
    <script src="/resources/js/custom.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            jQuery.fn.getSummaryData(${event.id});
        });
    </script>
</head>
    <body>
        <jsp:include page="../common/menu.jsp" />
        <div class="page rounded">
            <fieldset class="form-group">
                <div id="chartContainer" style="height: 300px; width: 100%;"></div>
            </fieldset>
        </div>
    </body>
</html>