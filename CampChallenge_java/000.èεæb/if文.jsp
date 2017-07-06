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
int num = 1;

// else if文を追加しました。
// if文の条件を満たさなかった場合、else if文が実行されます。
// これにより、「変数の中身は50です！」と表示されます。
if (num == 1) {
    out.print("１です！");
} else if (num == 2) {
    out.print("プログラミングキャンプ！");
} else {
    out.print("その他です！");
}
%>
</html>
