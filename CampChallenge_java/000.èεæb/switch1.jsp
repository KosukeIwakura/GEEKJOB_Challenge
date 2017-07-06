<%-- 
    Document   : newjsp
    Created on : 2017/07/06, 3:21:02
    Author     : Fleshgod4618
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
    </body>
    
<%
// typeにはスポーツの種類を表す数値が入っています
// 10ならサッカー、20なら野球、30ならラグビー
switch(2) {
case 1:
    
out.print("one");
break;

case 2:
out.print("two");
break;

default:
out.print("想定外");
break;
}
%>
</html>
