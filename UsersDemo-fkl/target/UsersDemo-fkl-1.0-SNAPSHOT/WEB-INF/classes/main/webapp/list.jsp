<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>用户信息管理模块</title>
    <link type="text/css"  rel="stylesheet" href="css/bootstrap.css">
    <link type="text/css"  rel="stylesheet" href="css/listcss.css">
</head>
<body>
<div class="container">
    <h3>用户信息列表</h3>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${users}" var="user" varStatus="s">
        <tr>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.sex}</td>
            <td>${user.age}</td>
            <td>${user.address}</td>
            <td>${user.qq}</td>
            <td>${user.email}</td>
            <td>
                <a class="btn btn-default btn-sm" href="updata.html">修改</a>
                <a class="btn btn-default btn-sm" href="#" >删除</a>
            </td>
        </tr>

<%--        <tr>--%>
<%--            <td>2</td>--%>
<%--            <td>张三</td>--%>
<%--            <td>男</td>--%>
<%--            <td>30</td>--%>
<%--            <td>云南</td>--%>
<%--            <td>alibb</td>--%>
<%--            <td>alibb@qq.com</td>--%>
<%--            <td>--%>
<%--                <a class="btn btn-default btn-sm" href="updata.html">修改</a>--%>
<%--                <a class="btn btn-default btn-sm" href="#" >删除</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>3</td>--%>
<%--            <td>张三</td>--%>
<%--            <td>男</td>--%>
<%--            <td>30</td>--%>
<%--            <td>云南</td>--%>
<%--            <td>alibb</td>--%>
<%--            <td>alibb@qq.com</td>--%>
<%--            <td>--%>
<%--                <a class="btn btn-default btn-sm" href="updata.html">修改</a>--%>
<%--                <a class="btn btn-default btn-sm" href="#" >删除</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>4</td>--%>
<%--            <td>张三</td>--%>
<%--            <td>男</td>--%>
<%--            <td>30</td>--%>
<%--            <td>云南</td>--%>
<%--            <td>alibb</td>--%>
<%--            <td>alibb@qq.com</td>--%>
<%--            <td>--%>
<%--                <a class="btn btn-default btn-sm" href="updata.html">修改</a>--%>
<%--                <a class="btn btn-default btn-sm" href="#" >删除</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>5</td>--%>
<%--            <td>张三</td>--%>
<%--            <td>男</td>--%>
<%--            <td>30</td>--%>
<%--            <td>云南</td>--%>
<%--            <td>alibb</td>--%>
<%--            <td>alibb@qq.com</td>--%>
<%--            <td>--%>
<%--                <a class="btn btn-default btn-sm" href="updata.html">修改</a>--%>
<%--                <a class="btn btn-default btn-sm" href="#" >删除</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
        </c:forEach>
        <tr>
            <td  colspan="8" >
<%--             <button type="button" class="btn btn-primary btn-lg">添加新用户</button>--%>
                <a class="btn btn-primary " href="add.jsp">添加新用户</a>
            </td>
        </tr>



    </table>
</div>
<script type="text/javascript" src="js/jquery-2.1.0.min.js"/>
<script type="text/javascript" src="js/bootstrap.js"/>
</body>
</html>