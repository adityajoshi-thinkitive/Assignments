package com.thinkitive;

import java.util.Collections;
import java.util.List;

public class SortUtils {

	public static void sortByName(List<Book> list) {

		CompareBooksByName cn = new CompareBooksByName();
		Collections.sort(list, cn);
	}

	public static void sortByPrice(List<Book> list) {

		CompareBooksByPrice cp = new CompareBooksByPrice();
		Collections.sort(list, cp);
	}
}
