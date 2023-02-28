package com.test.question;

public class Book {
	
		 

		   private String title;
		   private int price;
		   private String author;
		   private String publisher;
		   private String pubYear = "2019";
		   private String isbn;
		   private int page;

		   //getter, setter

		   public void setTitle(String title) {
				this.title = title;
			}

			public void setPrice(int price) {
				this.price = price;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public void setPublisher(String publisher) {
				this.publisher = publisher;
			}

			public void setPubYear(String pubYear) {
				this.pubYear = pubYear;
			}

			public void setIsbn(String isbn) {
				this.isbn = isbn;
			}

			public void setPage(int page) {
				this.page = page;
			}
			public String info() {
				StringBuilder sb = new StringBuilder();
				sb.append(String.format("����: %s\n",this.title));
				sb.append(String.format("����: %d��\n",this.price));
				sb.append(String.format("����: %s\n",this.author));
				sb.append(String.format("���ǻ�: %s\n",this.publisher));
				sb.append(String.format("����⵵: %s��\n",this.pubYear));
				sb.append(String.format("ISBN: %s\n",this.isbn));
				sb.append(String.format("������: %,d��\n",this.page));
				return sb.toString();
			}
}
