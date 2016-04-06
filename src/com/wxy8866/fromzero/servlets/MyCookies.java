package com.wxy8866.fromzero.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by XingYi Wei on 2016-04-06.
 */
public class MyCookies extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();

        Cookie myCookie = new Cookie("name", "XingYi");
        resp.addCookie(myCookie);

        Cookie[] cookies = req.getCookies();

        out.println("Below are all local cookies");
        for (int i = 0; i < cookies.length; i++)
        {
            Cookie c = cookies[i];
            String cookieName = c.getName();
            String cookieValue = c.getValue();
            out.println(cookieName + "=" + cookieValue);
        }
    }

}
