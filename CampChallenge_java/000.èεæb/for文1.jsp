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

        <%@ page import="java.util.*" %>
        <%

            // 「こんにちは」と10回表示したい
            int total = 1;
            for (int i = 0; i < 20; i++) {
                total = total * 8;
                out.println(total);
            }

            // 回数を把握するための変数：i=0（初期値は0）
            // 繰り返す条件：i<10（iが10未満の場合繰り返す）
            // １回毎の増減：i++（１回毎にiに+1する）

        %>




</html>
