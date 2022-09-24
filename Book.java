package com.inheritanceinterfaces.bll;

public class Book {
	private String isbn;
	private String Name;
	private Author author;
	private double price;
	private int qty=0;
	
	
  public Book() {
	 
  }
  public Book(String isbn, String name, String Author,double price,int qty) {
	this.isbn=isbn;
	this.Name=name;
	this.author=author;
	this.price=price;
	this.qty=qty;
	  
  }
  public Book(String isbn, String name, String Author, double price) {
	  this.isbn= isbn;
	  this.Name=name;
	  this.author=author;
	  this.price=price;
  }
  public String getIsbn() {
	  return isbn;
  }
	  public String getName() {
		  return Name;
		  
		  
	  }
	  public Author  getAuthor() {
		  return  author;
	  }
	  public double getPrice() {
		  return price;
		   }
	  public void setPrice(double price) {
		  this.price=price;
		  
		  
	  }
	  public int getQty() {
		  return qty;
		  }
	  public void setQty(int qty) {
		  this.qty=qty;
	  }
	  public String getAuthorName() {
		  return author.getName();
		  
	  }
	  @Override
	  public String toString() {
		  return "Book [isbn=" + ",name="+ Name +",author=["+author +"],price="+price+",qty=" + qty+"]";
	  }
	  }
 
  

