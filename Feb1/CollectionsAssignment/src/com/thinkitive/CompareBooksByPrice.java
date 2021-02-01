package com.thinkitive;

import java.util.Comparator;

public class CompareBooksByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());
	}

}
