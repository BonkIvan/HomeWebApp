<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19.11.2023
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="by.homeWebApp.model.MapUsernames" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page import="by.homeWebApp.constant.KeyValuesEnum" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Домашняя страница</title>
    <link rel="stylesheet" href="../CSS/bootstrap.min.css">

</head>
<body >
<div class="container mt-5">
    <!-- Изображение пользователя и информация о пользователе в одной строке -->
    <div class="row">
        <div class="col-md-4">
            <img src="../images/images.jpeg" alt="User Image" class="img-fluid rounded-circle">
        </div>
        <div class="col-md-8">
            <h2><%= session.getAttribute(KeyValuesEnum.USER_NAME.getParamName())%> Information</h2>
            <p><strong>Name:</strong> <%= session.getAttribute(KeyValuesEnum.USER_NAME.getParamName())%></p>
            <p><strong>Email:</strong> john.doe@example.com</p>
            <p><strong>Location:</strong> City, Country</p>
        </div>
    </div>

    <!-- Статус пользователя в новой строке -->
    <div class="row mt-3">
        <div class="col-md-12">
            <h3>Status</h3>
            <p>User is currently online.</p>
            <button type="button" class="btn btn-success">Success</button>
        </div>
    </div>

    <!-- Карточки с заданиями или описаниями навыков в одной строке, максимум по 2 в ряд row-cols-1 -->
    <div class="container text-center">
        <div class="row  row-cols-lg-2 row-cols-lg-3 g-2 g-lg-3">
            <div class="p-2 g-col-6">
                <div class="card" style="width: 18rem; ">
                    <img src="../images/lazly_cat.jpeg" class="card-img-top" alt="..." height = "400">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                </div>
            </div>

            <div class="p-2 g-col-6">
                <div class="card" style="width: 18rem;">
                    <img src="../images/sarcasm_black_cat.jpeg" class="card-img-top" alt="..." height = "400">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                </div>
            </div>

            <div class="p-2 g-col-6">
                <div class="card" style="width: 18rem;" >
                    <img src="../images/yang_cat.jpeg" class="card-img-top" alt="..." height = "400" >
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                </div>
            </div>

            <div class="p-2 g-col-6">
                <div class="card" style="width: 18rem;">
                    <img src="../images/red_cat.jpeg" class="card-img-top" alt="..." height = "400">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%--<div class="container text-center">
    <div class="row row-cols-1 row-cols-lg-3 g-2 g-lg-3">
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
        <div class="col">
            <div class="p-3">Row column</div>
        </div>
    </div>
</div>--%>

<script src="../js/bootstrap.bundle.min.js"></script>
</body>
</html>


<%--<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
   <link rel="stylesheet" href="../CSS/css_user_page.css" >
</head>
<body>

<div class="profile-container">
    <div class="profile-picture">
        <!-- Здесь может быть тег img с источником фотографии пользователя -->
         <img class = "photo" src="images/images.jpeg" alt="User Photo">
    </div>

    <div class="user-info">
        <!-- Здесь может быть информация о пользователе -->
        <p >Имя пишущего этот код: <%= session.getAttribute("name")%> </p>
        &lt;%&ndash;<%! public String getName() {
            HttpSession session = request.getSession();

            return session.getAttributeNames().toString();
        }%>&ndash;%&gt;




    </div>

    <button class="logout-button" onclick="/login">Logout</button>
</div>

</body>
</html>--%>
