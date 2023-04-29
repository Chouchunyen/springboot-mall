package com.jim.springbootmall.product;

import java.util.Date;
import java.util.List;

public class Order {

    private Integer userId;
    private Integer totalamount;
    private Date createDate;
    private Date lastModifiedDat;

    private Integer orderId;

    private List<OrderItem> orderItemList;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Integer totalamount) {
        this.totalamount = totalamount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedDat() {
        return lastModifiedDat;
    }

    public void setLastModifiedDat(Date lastModifiedDat) {
        this.lastModifiedDat = lastModifiedDat;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }


}
