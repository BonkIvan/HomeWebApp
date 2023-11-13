package by.homeWebApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.NameHashList;

import java.io.IOException;
@WebServlet(name = "NameServlet", urlPatterns = "/names/*")
public class NameServlet extends HttpServlet {
    NameHashList names = new NameHashList();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (String name: names.getNames()
             ) {resp.getWriter().println(name);
        }


    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");

        String newName = req.getPathInfo().substring(1);
        if (names.getNames().add(newName)) {
            resp.getWriter().println("Name '" + newName + "' has been added.");
        } else {
            resp.getWriter().println("Name '" + newName + "' already exists.");
            resp.setStatus(HttpServletResponse.SC_CONFLICT);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
