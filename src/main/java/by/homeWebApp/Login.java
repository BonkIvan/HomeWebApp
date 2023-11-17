package by.homeWebApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.HashMapUsernames;
import utils.NameHashList;

import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
  HashMapUsernames users = new HashMapUsernames();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String path = "/Login.html";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);

       // RequestDispatcher dispatcher = req.getRequestDispatcher("");
       // dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String path = "/Login.html";
        String path1 = "/userPage.html";
        ServletContext servletContext = getServletContext();
        final String username = req.getParameter("username");
        final String password = req.getParameter("password");

        if(users.isUser(username, password)){
            resp.sendRedirect("/userPages");
            /*RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/userPages");
            requestDispatcher.forward(req, resp);*/
        }else{
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
            requestDispatcher.forward(req, resp);
        }


        /*String newName = req.getPathInfo().substring(1);
        ServletContext servletContext = getServletContext();
        if (names.isName(newName)) {
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/userPages");
            requestDispatcher.forward(req, resp);
           // resp.getWriter().println("Name '" + newName + "' has been added.");

        } else {
          resp.getWriter().println("Name '" + newName + "' name is not found.");
            resp.setStatus(HttpServletResponse.SC_CONFLICT);
            resp.sendError(HttpServletResponse.SC_CONFLICT, "Error login 409");
            resp.getWriter().println(resp.getStatus());
        }*/
    }
}
