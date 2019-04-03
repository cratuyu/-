package com.example.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/4/3 15:13
 */
public class Anjvke implements Serializable {
    private String title;
    private String houseType;
    private int size;
    private String height;
    private Date buildYear;
    private String address;
    private BigDecimal totalPrice;
    private int price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setBuildYear(Date buildYear) {
        this.buildYear = buildYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getSize() {
        return size;
    }

    public String getHeight() {
        return height;
    }

    public Date getBuildYear() {
        return buildYear;
    }

    public String getAddress() {
        return address;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public int getPrice() {
        return price;
    }
}
