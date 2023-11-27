package by.homeWebApp.controller;

import by.homeWebApp.constant.KeyValuesEnum;
import by.homeWebApp.constant.MappingConstants;
import by.homeWebApp.exception.ZoneConversionException;
import by.homeWebApp.service.TimeService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import by.homeWebApp.view.ZonedDateProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@WebServlet(name = "TimeServlet", urlPatterns = MappingConstants.TIME_SERVLET)
public class TimeServlet extends HttpServlet {

    //Получаем временную зону из запроса
    public static final String ZONE_PARAM = KeyValuesEnum.TIME_ZONE.getParamName();
    private TimeService service;
    private ZonedDateProvider zonedDateProvider;

    @Override
    public void init(ServletConfig config) {
        service = new TimeService();
        zonedDateProvider = new ZonedDateProvider();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String timeZoneParam = req.getParameter(ZONE_PARAM);

        Date currentDate = service.getCurrentDate();

        TimeZone timezone;
        try {
            timezone = service.getTimeZone(timeZoneParam);
        } catch (ZoneConversionException e) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
            return;
        }

        String preparedDate = zonedDateProvider.prepareDate(currentDate, timezone);

        resp.getWriter().println(preparedDate);
    }


}
