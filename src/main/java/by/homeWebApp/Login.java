package by.homeWebApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.NameHashList;

import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/login/*")
public class Login extends HttpServlet {
    NameHashList names = new NameHashList();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Enter your name");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        String newName = req.getPathInfo().substring(1);
        ServletContext servletContext = getServletContext();
        if (names.isName(newName)) {
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/userPages");
            requestDispatcher.forward(req, resp);
           // resp.getWriter().println("Name '" + newName + "' has been added.");

        } else {
            resp.getWriter().println("Name '" + newName + "' name is not found.");
            resp.setStatus(HttpServletResponse.SC_CONFLICT);
            resp.sendError(HttpServletResponse.SC_CONFLICT, "Error 409");
            resp.getWriter().println(resp.getStatus());
        }
    }
}