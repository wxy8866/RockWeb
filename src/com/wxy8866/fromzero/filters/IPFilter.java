package com.wxy8866.fromzero.filters;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by XingYi Wei on 2016-04-06.
 */
public class IPFilter implements Filter
{
    protected FilterConfig filterConfig;
    protected String IP;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        this.filterConfig = filterConfig;
        this.IP = this.filterConfig.getInitParameter("IP");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException
    {
        String remoteIP = servletRequest.getRemoteAddr();

        if (remoteIP.equals(IP))
        {
            PrintWriter out = servletResponse.getWriter();
            out.println("Your IP address is forbidden");
        }
        else
        {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy()
    {

    }
}
