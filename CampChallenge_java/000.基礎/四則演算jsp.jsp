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
        
final int BASE=100;
int num=5;

int tasu=BASE+num;
int hiku=BASE-num;
int kake=BASE*num;
int wari=BASE/num;

out.println(tasu);
out.println(hiku);
out.println(kake);
out.println(wari);

        
        
        %>
</html>
