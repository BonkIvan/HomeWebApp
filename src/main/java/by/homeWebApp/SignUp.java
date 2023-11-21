package by.homeWebApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.MapUsernames;

import java.io.IOException;

@WebServlet(name = "SignUp", urlPatterns = "/sign_up")
public class SignUp extends HttpServlet {
    String pathLogin = "/html/Login.html";
    String pathSignUp = "/html/signUp.html";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(pathSignUp);
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        ServletContext servletContext = getServletContext();
        MapUsernames users = (MapUsernames) servletContext.getAttribute("users");
        final String username = req.getParameter("username");
        final String password = req.getParameter("password");
        if (!users.isUser(username, password)){
            users.getUsers().put(username, password);
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(pathLogin);
            requestDispatcher.forward(req, resp);

        }else{
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(pathSignUp);
            requestDispatcher.forward(req, resp);

        }

    }
}
