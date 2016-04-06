package com.wxy8866.fromzero.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by XingYi Wei on 2016-04-06.
 */
public class RequestParam extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.println("This is from GET method");
        Enumeration e = req.getParameterNames();

        while (e.hasMoreElements())
        {
            String name = (String)e.nextElement();
            String value = req.getParameter("name");
            out.println(name + "=" + value);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.println("This is from POST method");

        Enumeration e = req.getParameterNames();

        while (e.hasMoreElements())
        {
            String name = (String)e.nextElement();
            String value = req.getParameter("name");
            out.println(name + "=" + value);
        }
    }
}
