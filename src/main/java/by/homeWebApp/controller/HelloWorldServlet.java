package by.homeWebApp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import static by.homeWebApp.constant.MappingConstants.HELLO_WORLD_SERVLET;

@WebServlet(name = "HelloWorldServlet", urlPatterns = HELLO_WORLD_SERVLET)
public class HelloWorldServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.getWriter().println("Hello, it's me");
    }
}
