package com.kafka.kafka.data;

public class Books {
	
	private String bookName;
	private String bookId;
	private String isbnNumber;
	private String author;
	
	
	private Books(Builder builder) {
		this.bookName = builder.bookName;
		this.bookId = builder.bookId;
		this.isbnNumber = builder.isbnNumber;
		this.author = builder.author;
	}
	
	
	public String getBookName() {
		return bookName;
	}


	public String getBookId() {
		return bookId;
	}


	public String getIsbnNumber() {
		return isbnNumber;
	}


	public String getAuthor() {
		return author;
	}


	public static class Builder {
		private String bookName;
		private String bookId;
		private String isbnNumber;
		private String author;
		
		public Builder withBookName(String bookName) {
			this.bookName = bookName;
			return this;
		}
		
		public Builder withBookId(String bookId) {
			this.bookId = bookId;
			return this;
		}
		
		public Builder withIsbnNumber(String isbnNumber) {
			this.isbnNumber = isbnNumber;
			return this;
		}
		
		public Builder withAuthor(String author) {
			this.author = author;
			return this;
		}
		
		public Books build() {
			return new Books(this);
		}
	}
	

	
	public String toString() {
		return this.getBookName() + ", " + this.getAuthor() + ", " + this.getBookId() + ", " + this.getIsbnNumber();
	}



}
