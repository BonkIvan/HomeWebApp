package by.homeWebApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utils.MapUsernames;

import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
  MapUsernames users = new MapUsernames();
  String path = "/html/Login.html";
  String path1 = "/html/userPage.html";
  String path2 = "/newUserPage";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("users", users);
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);

    }


    //Логирование пользователя
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        ServletContext servletContext = getServletContext();
        final String username = req.getParameter("username");
        final String password = req.getParameter("password");
        HttpServletRequest httpRequest = (HttpServletRequest) req;

        if(users.isUser(username, password)){
            HttpSession session = httpRequest.getSession();
            session.setAttribute("name", username);
            resp.sendRedirect(path1);
        }else{
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
            requestDispatcher.forward(req, resp);
        }

    }


}
