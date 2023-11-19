package by.homeWebApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (urlPatterns = "/newUserPage")
public class NewUserPage extends HttpServlet {

    String pathToPage = "/jsp/user_page.jsp";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pathToPage);
        dispatcher.forward(req, resp);






    }
}
