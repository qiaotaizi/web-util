package com.jaiz.web.page;

import java.util.List;

/**
 * 分页结果集
 */
public class Pagelab<T> {

    /**
     * 默认页码
     */
    private static final int DEFAULT_PAGE_NO=1;

    /**
     * 默认页面数据量
     */
    private static final int DEFAULT_PAGE_SIZE=20;

    /**
     * 页码
     */
    private int pageNo;

    /**
     * 数据量
     */
    private int pageSize;

    /**
     * 数据集
     */
    private List<T> dataList;

    /**
     * limit子句游标
     */
    transient private int startIndex;

    /**
     * 是否可以继续翻页
     */
    private boolean hasNext;

    /**
     * 数据总量
     */
    private int totalRow;

    public Pagelab(Integer pageNo,Integer pageSize){
        if (pageNo==null){
            this.pageNo=DEFAULT_PAGE_NO;
        }
        if(pageSize==null){
            this.pageSize=DEFAULT_PAGE_SIZE;
        }
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public int getStartIndex() {
        //通过计算获取limit游标
        this.startIndex=(this.pageNo-1)*this.pageSize+1;
        return startIndex;
    }

    public boolean getHasNext() {
        return hasNext;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
        //已知总数据量,页面数据量,当前页码
        //根据这些条件设置hasNext值
        this.hasNext=pageNo*pageSize<totalRow;
    }
}
