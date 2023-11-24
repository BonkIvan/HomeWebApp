package by.homeWebApp.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebFilter(filterName = "LoggingFilters", urlPatterns = "/jsp/user_page.jsp")
public class LoggingFilters implements Filter {
    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
        this.context.log("LoggingFilters initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse)  servletResponse;
        HttpSession session = httpRequest.getSession();
        if(session == null){
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error  401");
        }
        session.getAttribute("name");
        filterChain.doFilter(servletRequest, servletResponse);

    }


    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
