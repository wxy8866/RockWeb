package com.wxy8866.fromzero.beans;

/**
 * Created by XingYi Wei on 2016-04-14.
 */
public class Page
{
    private int currentPage;
    private int currentRecord;

    private int totalPage;
    private int totalRecord;

    private int pageSize = 100;


    public int getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(int currentRecord, int pageSize)
    {
        if (currentRecord%pageSize == 0)
        {
            currentPage = currentRecord/pageSize;
        }
        else
        {
            currentPage = currentRecord/pageSize + 1;
        }
    }

    public int getCurrentRecord()
    {
        return currentRecord;
    }

    public void setCurrentRecord(int currentRecord)
    {
        this.currentRecord = currentRecord;
    }


    public void setTotalPage(int totalRecord, int pageSize)
    {
        if (totalRecord % pageSize == 0)
        {
            this.totalPage = totalRecord/pageSize;
        }
        else
        {
            this.totalPage= totalRecord/pageSize + 1;
        }
    }

    public int getTotalPage()
    {
        return totalPage;
    }

    public int getTotalRecord()
    {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord)
    {
        this.totalRecord = totalRecord;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }






}
