package com.example.demo.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author ljy
 */
@Entity
@Table(name = "TbBooks")
public class TbBooks implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "price")
  private double price;

  @Column(name = "bookCount")
  private long bookCount;

  @Column(name = "author")
  private String author;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getBookCount() {
    return bookCount;
  }

  public void setBookCount(long bookCount) {
    this.bookCount = bookCount;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

}
