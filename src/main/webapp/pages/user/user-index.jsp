<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css" type="text/css">
    <title>JS-7-11</title>
</head>
<body onload="allUsers(),toggle()">
<div class="main" id="main">
    <form action="#" name="form">
        <div class="mainDiv">
            <label>用户名:</label>
            <input type="text" name="name" id="name">
        </div>
        <div class="mainDiv">
            <label>地址:</label>
            <div class="addressSelect">
                <span>省</span>
                <select name="province" id="province" onclick="getArea()" onchange="getArea(this.options[this.options.selectedIndex].value, 'city')">
                    <option selected disabled hidden>请选择省份</option>
                </select>
                <span>市</span>
                <select name="city" id="city" onchange="getArea(this.options[this.options.selectedIndex].value, 'area')">
                    <option selected disabled hidden>请选择市</option>
                </select>
                <span>区</span>
                <select name="area" id="area">
                    <option selected disabled hidden>请选择区</option>
                </select>
            </div>
        </div>
        <div class="mainDiv">
            <label>性别:</label>
            <select name="sex" id="sex" id="sex">
                <option value="男">男</option>
                <option value="女">女</option>
            </select>
        </div>
        <div class="mainDiv">
            <label>邮箱地址:</label>
            <input type="email" name="email" id="email" />
        </div>
        <div class="mainDiv">
            <label>邮编地址:</label>
            <input type="text" id="postcode">
        </div>
        <div class="mainDiv">
            <label>描述:</label>
            <textarea name="description" id="description"></textarea>
        </div>
        <div class="mainDiv">
            <label>出生日期:</label>
            <input type="date" id="birthday">
        </div>
    </form>
    <div class="button">
        <input type="button" name="add" value="添加" onclick="add()">
        <input type="button" name="resetForm" value="重置" onclick="resetForm()">
    </div>
    <hr>

    <table id="table" class="table" border="1" align="center" cellpadding="2" cellspacing="2">
        <thead>
            <tr>
                <th>ID</th>
                <th>姓名</th>
                <th>性别</th>
                <th>地址</th>
                <th>邮箱</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody></tbody>
    </table>
    <div class="bottomButton">
        <span id="pageNode"></span>
        <button id="LastPage" onclick="prev()">上一页</button>
        <button id="nextPage" onclick="next()">下一页</button>
    </div>
</div>

<div class="details" id="details">
    <h1 id="detailsH1"></h1>
    <table id="deTable" class="deTable" border="1" align="center" cellpadding="2" cellspacing="2">
        <tr>
            <td>Name</td>
            <td id="deName"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td id="deAddress"></td>
        </tr>
        <tr>
            <td>Sex</td>
            <td id="deSex"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td id="deEmail"></td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td id="deBirthday"></td>
        </tr>
        <tr>
            <td>PostCode</td>
            <td id="dePostCode"></td>
        </tr>
        <tr>
            <td>Desc</td>
            <td id="deDescription"></td>
        </tr>
    </table>
    <button onclick="closeDe()">Close</button>
</div>

</body>
<script src="${pageContext.request.contextPath}/js/index.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
</html>