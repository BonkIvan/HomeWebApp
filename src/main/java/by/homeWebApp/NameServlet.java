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
        if (names.SetName(newName)) {
            resp.getWriter().println("Name '" + newName + "' has been added.");
        } else {
            resp.setStatus(HttpServletResponse.SC_CONFLICT);
           resp.sendError(HttpServletResponse.SC_CONFLICT, "Error blgadfadf 409");
            resp.getWriter().println(resp.getStatus());
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        String newName = req.getPathInfo().substring(1);
        if (names.getNames().remove(newName)) {
            resp.getWriter().println("Name '" + newName + "' has been deleted.");
        } else {
            resp.getWriter().println("Name '" + newName + "' already deletes.");
            resp.setStatus(HttpServletResponse.SC_CONFLICT);
        }
    }
}
