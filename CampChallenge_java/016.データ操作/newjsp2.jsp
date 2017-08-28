<%-- 
    Document   : newjsp2
    Created on : 2017/08/20, 16:12:24
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
           <form action="./test.jsp" method="post"> 


 
        <form action="newjsp2.jsp" method="post"> 
            【氏名】<input type="text" name="name"><br><br> 






            【性別】<input type="radio" name="gender" value="男">男 



            <input type="radio" name="gender" value="女">女 



            <input type="radio" name="gender" value="その他">その他<br><br> 



            【趣味】<br> 



            <textarea name="hobby" cols="50" rows="10"></textarea><br><br> 



            <input type="submit" name="btnSubmit"> 



            <input type="submit" name="btnSubmit" value="送信"> 



            <input type="reset" name="rstSubmit" value="リセット"> 



        </form> 



    </body> 



</html> 
