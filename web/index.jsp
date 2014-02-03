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
        <form id="form1" name="form1" method="POST" action="AreaController?calcType=rectangle">
        <div>
        Input the Rectangle Length:
        <input type="text" name="length" value="" />
        </div>
        <div>
        Input the Rectangle Width:
        <input type="text" name="width" value="" />
        </div>
        <input id="areaSubmit" name="submit1" type="submit" value="Calculate Area" />
        <div>
            <%
                if (request.getParameter("submit1") != null){%>
                <%out.print(request.getAttribute("title"));%><br>
                You submitted: <%out.print(request.getAttribute("formula"));%><br>
                The answer is: <%out.print(request.getAttribute("answer"));%><br>
                <%
                }
           %>
        </div>
        </form>
        <br>
        <div>Get the Area of a Circle</div><br/>
        <img src ="image/circle.png"/>
        <form id="form2" name="form2" method="POST" action="AreaController?calcType=circle">
        <div>
        Input the Radius:
        <input type="text" name="radius" value="" />
        </div>
        <input id="areaSubmit" name="submit2" type="submit" value="Calculate Area" />
        <div>
            <%
                if (request.getParameter("submit2") != null){%>
                <%out.print(request.getAttribute("title"));%><br>
                You submitted: <%out.print(request.getAttribute("formula"));%><br>
                The answer is: <%out.print(request.getAttribute("answer"));%>
                <%
                }
           %>
        </div>
        </form>
        <br>
        <div>Find the Unknown Side of A Right Triangle</div><br/>
        <img src ="image/triangle.gif"/>
        <form id="form1" name="form1" method="POST" action="AreaController?calcType=triangle">
        <div>
        Input Side A:
        <input type="text" name="sideA" value="" />
        </div>
        <div>
        Input Side B:
        <input type="text" name="sideB" value="" />
        </div>
        <input id="areaSubmit" name="submit3" type="submit" value="Find Unknown Side" />
        <div>
            <%
                if (request.getParameter("submit3") != null){%>
                <%out.print(request.getAttribute("title"));%><br>
                You submitted: <%out.print(request.getAttribute("formula"));%><br>
                The answer is: <%out.print(request.getAttribute("answer"));%><br>
                <%
                }
           %>
        </div>
        </form>
    </body>
</html>
