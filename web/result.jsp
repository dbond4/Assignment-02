<%-- 
    Document   : result
    Created on : Jan 27, 2014, 1:22:32 PM
    Author     : F03 H4MM3R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Area Results</title>
    </head>
    <body>
        <h1 align="center">Rectangle Area</h1>
    <center>
        <%
        out.print("The area of the rectangle is " + request.getAttribute("area"));
        %>
    </center>
    </body>
</html>
