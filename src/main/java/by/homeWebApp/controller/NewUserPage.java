package by.homeWebApp.controller;

import by.homeWebApp.constant.MappingConstants;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static by.homeWebApp.constant.MappingConstants.USER_PAGE_JSP;

@WebServlet (urlPatterns = MappingConstants.NEW_USER_PAGE_SERVLET)
public class NewUserPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(USER_PAGE_JSP);
        dispatcher.forward(req, resp);






    }
}
