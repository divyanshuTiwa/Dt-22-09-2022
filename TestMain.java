package com.inheritanceinterfaces.pll;

import com.inheritanceinterfaces.bll.Author;

import com.inheritanceinterfaces.bll.Book;

public class TestMain {
	public class TestAuthorMain {

		public static  void main(String[] args) {
			//Test Author class
			Author a1= new Author("James franklin" , "Jamesfranklin@gmail.com");
			System.out.println(a1);
			a1.setEmail("Jamesfranklin@gmail.com");
			
			System.out.println(a1);
			System.out.println(" name is: " + a1.getName());
			System.out.println("email is: " + a1.getEmail());
			
			//Test Book class
			Book b1= new Book();
			System.out.println(b1);
			b1.setPrice(9.9);
			b1.setQty(99);
			
			System.out.println(b1);
			System.out.println("isbn is: " +b1.getName());
			System.out.println("name is:" + b1.getName());
			System.out.println("price is: " +b1.getPrice());
			System.out.println("qty is: " + b1.getQty());
			System.out.println("author is:"+b1.getAuthor());
			//Author's  toString()
			System.out.println("author's name:"+b1.getName());
			System.out.println("author's name:" +b1.getAuthor().getName());
			System.out.println("author's email:"+b1.getAuthor().getEmail());
			
			

		}

	}

}
