package com.library.librarymanagement.iyer.bean;

public class OrderBean {
    private String bookName;
    private int quantity;
    private double price;

    public OrderBean() {
    }

    public OrderBean(String bookName, int quantity, double price) {
        this.bookName = bookName;
        this.quantity = quantity;
        this.price = price;
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
