package com.wxy8866.fromzero.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by XingYi Wei on 2016-04-05.
 */
public class FileWrite extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String fileName = "newcontent.txt";
        String filePath = req.getRealPath(fileName);

        File file = new File(filePath);

        out.println("The real file path is " + filePath);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("OK test");
        bufferedWriter.newLine();
        bufferedWriter.write("Yes I am writing");

        bufferedWriter.flush();
        bufferedWriter.close();
        fileWriter.close();
        out.println("Write file successfully, the full path is " + file.getAbsolutePath());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
