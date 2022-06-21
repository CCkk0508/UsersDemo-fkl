<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/20 0020
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
1.导入jar包
2.引入标签库

--%>
<%
    request.setAttribute("number",6);
%>
<%--<c:if test="${number %2 ==0}">--%>
<%--    ${number}是偶数--%>
<%--</c:if>--%>
<%--
         for(i=1;i<10;i=i+2){}
         varStatus:循环状态对象
         index:容器中元素的索引，从0开始
         count:循环次数，从1开始
--%>
<c:forEach begin="0" end="10" var="i" step="5" varStatus="s">
    ${i}<h1>${s.index}</h1><h4>${s.count}</h4>

</c:forEach>
</body>
</html>
