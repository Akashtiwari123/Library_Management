package com.library.librarymanagement.iyer.entity;

import javax.persistence.*;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer orderId;
    @ManyToOne()
    @JoinColumn(name="userName")
    private String
    private String bookName;
    private int quantity;
    private double price;

    public OrderEntity() {
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
