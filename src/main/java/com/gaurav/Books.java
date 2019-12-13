package com.gaurav;

public class Books {
	private long bookId;
	private String bookName;
	private Author author;
	
	public Books(long bookId, String bookName, Author author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public long getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}

}
