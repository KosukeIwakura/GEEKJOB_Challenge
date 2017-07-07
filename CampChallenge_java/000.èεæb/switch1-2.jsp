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

        String i = "A";
        switch (i) {
            case "A":
                out.print("英語");
                break;
            case "あ":
                out.print("日本語");

                break;
            default:
                out.print("");
                break;
        }
    %>

</html>
