package com.kafka.kafka.data;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareBooks {
	
	
	
	public static void main(String[] args) {
		List<Books> bookList = Stream.of(new Books.Builder().withAuthor("Punitha")
															.withBookId("1234")
															.withBookName("I am getting this Job")
															.withIsbnNumber("8970").build(),
										new Books.Builder().withAuthor("Sakthivel")
															.withBookId("5678")
															.withBookName("I am getting this Job")
															.withIsbnNumber("4564").build(),
										new Books.Builder().withAuthor("Mari Ganesh")
															.withBookId("5678")
															.withBookName("I am getting this Job")
															.withIsbnNumber("4564").build()).collect(Collectors.toList());
				
		System.out.println(bookList);
				
		sortBooks(bookList);
		
	}
	
	public static void sortBooks(List<Books> bookList) {
		Collections.sort(bookList, (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
		
		System.out.println(bookList);
	}



}
