package com.wxy8866.fromzero.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by XingYi Wei on 2016-04-05.
 */
public class FileRead extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        String fileName = "content.txt";
        String filePath = req.getRealPath(fileName);

        File file = new File(filePath);

        if (file.exists())
        {
            out.println("The real file path is " + filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null)
            {
                out.println(line);
            }


        }
        else
        {
            out.println("File is not existed");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doGet(req,resp);
    }
}
