package com.wxy8866.fromzero.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by XingYi Wei on 2016-04-07.
 */
public class MySession extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out =resp.getWriter();

        HttpSession session = req.getSession(true);
        Date created = new Date(session.getCreationTime());
        Date accessed = new Date(session.getLastAccessedTime());

        out.println("Session ID: " + session.getId());
        out.println("Session create time: " + created);
        out.println("Session last used time: " + accessed);

        session.setAttribute("msg","Hello");
        Enumeration e = session.getAttributeNames();
        out.println("The content of session is: ");
        while (e.hasMoreElements())
        {
            String sessionName = (String) e.nextElement();
            String sessionValue = session.getAttribute(sessionName).toString();

            out.println(sessionName + " = " + sessionValue);
        }
    }
}
