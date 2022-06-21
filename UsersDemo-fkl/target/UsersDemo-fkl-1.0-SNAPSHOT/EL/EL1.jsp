<%@ page import="com.example.UsersDemo_fkl.domain.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/20 0020
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    1.el:表达式语言，简化JSP页面中的Java代码，语法格式：${表达式}；jsp默认支持el表达式
    2.el表达式获取值只能从域对象中获取
        1.pageScope -->pagecontext
        2.requestScope -->request
        3.sessionScope -->session
        4.applicationScope -->application
    3.通过对象的属性来获取
        *属性要有get和set方法，去掉set或者get，剩余的首字母小写（属性值首字母小写）


--%>
<%--${3+4}--%>
<%--<%--%>
<%--    String str = "1234";--%>
<%--    request.setAttribute("str","123");--%>
<%--%>--%>
<%
    User user = new User();
    user.setName("小明");
    user.setSex("男");
    List list = new  ArrayList();
    request.setAttribute("u",user);
    list.add(user);
    list.add("aaa");
    request.setAttribute("list",list);
%>


${u.name}
${u.sex}
<%--//获取虚拟目录--%>
${pageContext.request.contextPath}

</body>
</html>
