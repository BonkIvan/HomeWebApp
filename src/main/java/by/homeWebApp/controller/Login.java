package by.homeWebApp.controller;

import by.homeWebApp.constant.KeyValuesEnum;
import by.homeWebApp.constant.MappingConstants;
import by.homeWebApp.model.MapUsernames;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import static by.homeWebApp.constant.MappingConstants.*;

@WebServlet(name = "Login", urlPatterns = MappingConstants.LOGGING_SERVLET)
public class Login extends HttpServlet {
  MapUsernames users = new MapUsernames();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServletContext servletContext = getServletContext();
  //      servletContext.setAttribute(KeyValuesEnum.USER_NAME.getParamName(), users);
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(LOGIN_PAGE_HTML);
        requestDispatcher.forward(req, resp);

    }


    //Логирование пользователя
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        ServletContext servletContext = getServletContext();
        final String username = req.getParameter(KeyValuesEnum.USER_NAME.getParamName());
        final String password = req.getParameter(KeyValuesEnum.USER_PASSWORD.getParamName());
      //  HttpServletRequest httpRequest = (HttpServletRequest) req;

        if(users.isUser(username, password)){
            HttpSession session = req.getSession();
            session.setAttribute(KeyValuesEnum.USER_NAME.getParamName(), username);
            resp.sendRedirect(USER_PAGE_JSP);
        }else{
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(LOGIN_PAGE_HTML);
            requestDispatcher.forward(req, resp);
        }

    }


}
