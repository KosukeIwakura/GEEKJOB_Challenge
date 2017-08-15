<%-- 
    Document   : newjsp
    Created on : 2017/07/10, 16:00:19
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

            String moji = "A";

            for (int i = 0; i < 30; i++) {
                out.print(moji);
            }


        %>


    </body>
</html>
