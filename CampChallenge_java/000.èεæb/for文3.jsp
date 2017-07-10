<%-- 
    Document   : newjsp
    Created on : 2017/07/10, 14:56:16
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

// 1から10の合計を表示する処理
int total = 0;
for (int i = 0; i <= 100; i++) {
    total = total + i;
}

out.print(total);

// 回数を把握するための変数：i=1（初期値は1）
// 繰り返す条件：i<=10（iが10以下の場合繰り返す）
// １回毎の増減：i++（１回毎にiに+1する）
%>
    </body>
</html>
