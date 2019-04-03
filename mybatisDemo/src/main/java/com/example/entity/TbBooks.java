package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/4/2 13:24
 */
public class TbBooks implements Serializable {

    private long id;

    private String bookName;

    private double price;

    private int bookCount;

    private String author;

    public void setId(long id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public int getBookCount() {
        return bookCount;
    }

    public String getAuthor() {
        return author;
    }

}
