package cn.happy.day01;

import java.io.Serializable;

public class Book implements Serializable{

private String bookName;
  private Integer bookPrice;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
  
}
