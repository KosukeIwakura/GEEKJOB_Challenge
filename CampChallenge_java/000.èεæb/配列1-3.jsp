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
        // ユーザー情報をHashMapにまとめ、ArrayListで管理する
            HashMap<String, String> user1
                    = new HashMap<String, String>();
            HashMap<String, String> user2
                    = new HashMap<String, String>();
        // 名前と年齢を格納
            user1.put("1", "AAA");
            user1.put("hello", "world");
            user2.put("soeda", "33");
            user2.put("20", "20");
        // ユーザー情報を入れる配列
            ArrayList<HashMap> data = new ArrayList<HashMap>();
        // ユーザー情報格納
            data.add(user1);
            data.add(user2);
        %>




</html>
