<%-- 
    Document   : newjsp
    Created on : 2017/07/10, 15:11:23
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
        <%

 // keyが「100000」になるまで繰り返す
 // ループ回数を表示する
            int key = 1000;
            int count = 0;
            while (key>100) {
                key = key / 2;
                count++;
            }

            out.print(count + "回ループしました！");

        %>
    </body>
</html>
