<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19.11.2023
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <p >Имя пишущего этот код: <%= request.getAttribute("userName") %> </p>
    </div>

    <button class="logout-button" onclick="location.href='LogoutServlet'">Logout</button>
</div>

</body>
</html>
