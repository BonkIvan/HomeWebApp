package by.homeWebApp.controller;

import by.homeWebApp.constant.KeyValuesEnum;
import by.homeWebApp.constant.MappingConstants;
import by.homeWebApp.service.TimeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@WebServlet(name = "TimeServlet", urlPatterns = MappingConstants.TIME_SERVLET)
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //Получаем временную зону из запроса
        String timeZoneParam = req.getParameter(KeyValuesEnum.TIME_ZONE.getParamName());
        private TimeService service;
       /* private ZonedDateProvider zonedDateProvider;

        @Override
        public void init(ServletConfig config) {
            service = new TimeService();
            zonedDateProvider = new ZonedDateProvider();*/
        }



        // Определение временной зоны
        TimeZone timeZone;
        if (timeZoneParam != null && !timeZoneParam.isEmpty()) {
            timeZone = TimeZone.getTimeZone(timeZoneParam);
        } else {
            timeZone = TimeZone.getDefault();
        }

    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat.setTimeZone(timeZone);
    String formattedDate = dateFormat.format(currentDate);
        resp.getWriter().println(formattedDate);
    }
}
