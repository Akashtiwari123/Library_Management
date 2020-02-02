package com.library.librarymanagement.iyer.bean;

public class BookBean {
    private  String bookCode;
    private  double price;
    private  String bookName;

    public BookBean() {
    }

    public BookBean(String bookName, String bookCode, double price) {
            this.bookName = bookName;
            this.bookCode = bookCode;
            this.price = price;
        }


        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getBookCode() {
            return bookCode;
        }

        public void setBookCode(String bookCode) {
            this.bookCode = bookCode;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }



    }


