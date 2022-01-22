package com.abhisek.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,3,9,6,4);
		
		List<Object> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
	}

}
