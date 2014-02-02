<%-- 
    Document   : home2
    Created on : Feb 2, 2014, 10:43:42 AM
    Author     : F03 H4MM3R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Shape Calculator</title>
    </head>
    <body>
        <div>Get the Area of a Rectangle</div><br/>
        <img src ="image/rectangle.gif"/>
        <form id="form1" name="form1" method="POST" action="AreaController">
        <div>
        Input the Rectangle Width:
        <input type="text" name="width" value="" />
        </div>
        <div>
        Input the Rectangle Height:
        <input type="text" name="height" value="" />
        </div>
        <input id="areaSubmit" name="areaSubmit" type="submit" value="Submit" />
        </form>
    </body>
</html>
