package com.kafka.kafka.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;



class CompareBooksTest {

	@Test
	void testSortBooks() {
		 Books book1 = new Books.Builder()
                 .withAuthor("Punitha")
                 .withBookId("1234")
                 .withBookName("I am getting this Job")
                 .withIsbnNumber("8970").build();
		 Books book2 = new Books.Builder()
		                 .withAuthor("Sakthivel")
		                 .withBookId("5678")
		                 .withBookName("I am getting this Job")
		                 .withIsbnNumber("4564").build();
		 Books book3 = new Books.Builder()
		                 .withAuthor("Mari Ganesh")
		                 .withBookId("5678")
		                 .withBookName("I am getting this Job")
		                 .withIsbnNumber("4564").build();
		
		 List<Books> bookList = Arrays.asList(book1, book2, book3);
		 
		 // Call the method to be tested
		 CompareBooks.sortBooks(bookList);
		
		 // Assert that the books are sorted by author's name
		 assertEquals("Mari Ganesh", bookList.get(0).getAuthor());
		 assertEquals("Punitha", bookList.get(1).getAuthor());
		 assertEquals("Sakthivel", bookList.get(2).getAuthor());
	}

}
