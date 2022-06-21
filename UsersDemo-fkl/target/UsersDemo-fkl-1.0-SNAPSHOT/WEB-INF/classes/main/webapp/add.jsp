<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
       <h3 style="text-align: center ">添加新用户页面</h3>
        <form action="${pageContext.request.contextPath}/AddUserServlet" method="post">
            <div class="form-group">
                <label for="name">姓名 :</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
            </div>
            <div class="form-group">
                <label >姓别 :</label>
                <input type="radio" name="sex" value="男" checked="checked" />男
                <input type="radio" name="sex" value="女"/>女
            </div>
            <div class="form-group">
                <label for="age">年龄 :</label>
                <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
            </div>
            <div class="form-group">
                <label for="address">籍贯 :</label>
                <select class="form-control" id="address" name="address">
                    <option value="云南">云南</option>
                    <option value="北京">北京</option>
                    <option value="河南">河南</option>
                </select>
            </div>
            <div class="form-group">
                <label for="qq">QQ :</label>
                <input type="text" class="form-control" name="qq" id="qq" placeholder="请输入QQ号码">
            </div>
            <div class="form-group">
                <label for="email">邮箱 :</label>
                <input type="text" class="form-control" name="email" id="email" placeholder="请输入邮箱地址">
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