<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加用户</title>
    <link type="text/css"  rel="stylesheet" href="css/bootstrap.css">
    <style>
        input[type=radio]{
            margin: 4px 6px 0;
        }
    </style>

</head>
<body>
    <div class="container">
       <h3 style="text-align: center ">修改用户信息页面</h3>
        <form action="${pageContext.request.contextPath}/UpdateUserServlet" method="post">
            <input type="hidden" name="id" value="${user.id}">
            <div class="form-group">
                <label for="name">姓名 :</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名" readonly="readonly" value="${user.name}">
            </div>
            <div class="form-group">
                <label >姓别 :</label>
                <c:if test="${user.sex == '男'}">
                <input type="radio" name="sex" value="男" checked="checked" />男
                <input type="radio" name="sex" value="女"/>女
                </c:if>
                <c:if test="${user.sex == '女'}">
                    <input type="radio" name="sex" value="男" />男
                    <input type="radio" name="sex" value="女"  checked="checked"/>女
                </c:if>
            </div>
            <div class="form-group">
                <label for="age">年龄 :</label>
                <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄" value="${user.age}">
            </div>
            <div class="form-group">
                <label for="address">籍贯 :</label>
                <select class="form-control" id="address" name="address">
                    <c:if test="${user.address == '云南'}">
                    <option value="云南" selected >云南</option>
                    <option value="北京">北京</option>
                    <option value="河南">河南</option>
                    </c:if>
                    <c:if test="${user.address == '北京'}">
                        <option value="云南">云南</option>
                        <option value="北京" selected >北京</option>
                        <option value="河南">河南</option>
                    </c:if>
                    <c:if test="${user.address == '河南'}">
                        <option value="云南">云南</option>
                        <option value="北京" >北京</option>
                        <option value="河南" selected >河南</option>
                    </c:if>
                </select>
            </div>
            <div class="form-group">
                <label for="qq">QQ :</label>
                <input type="text" class="form-control" id="qq" name="qq" placeholder="请输入QQ号码" value="${user.qq}" >
            </div>
            <div class="form-group">
                <label for="email">邮箱 :</label>
                <input type="text" class="form-control" id="email" name="email" placeholder="请输入邮箱地址" value="${user.email}">
            </div>
            <div class="form-group" style="text-align: center">
                <input class="btn btn-primary" type="submit" value="提交">
                <input class="btn btn-default" type="reset" value="重置">
                <input class="btn btn-default" type="button" value="返回">
            </div>
        </form>
    </div>

</body>
</html>