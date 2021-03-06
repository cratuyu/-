package com.example.demo.entity;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import java.io.Serializable;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/29 13:29
 */
public class TbBook implements Serializable {

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
