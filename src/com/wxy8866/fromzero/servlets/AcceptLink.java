package com.wxy8866.fromzero.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by XingYi Wei on 2016-04-05.
 */
public class AcceptLink extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String province = req.getParameter("province");

        out.println("The content that received");
        out.println("Name is " + name);
        out.println("Province is " + province);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        doGet(req,resp);
    }
}
