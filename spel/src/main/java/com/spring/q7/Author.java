package com.spring.q7;

public class Author {
	private String name;
    
    private Book book;
     
    private String bookTitle;
     
    private String fullAuthorInfo;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
     
    public Book getBook() {
        return book;
    }
 
    public void setBook(Book book) {
        this.book = book;
    }
 
    public String getBookTitle() {
        return bookTitle;
    }
 
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
     
    public String getFullAuthorInfo() {
        return fullAuthorInfo;
    }
 
    public void setFullAuthorInfo(String fullAuthorInfo) {
        this.fullAuthorInfo = fullAuthorInfo;
    }
     
    @Override
    public String toString(){
        return name + " has writen the book : " + book + ". \n" + bookTitle + " is a wonderful title of a wonderful book.";
    }


}
