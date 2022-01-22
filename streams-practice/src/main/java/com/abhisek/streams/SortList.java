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
	
	public List<Integer> evennumbers(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		return list.stream().filter(t -> (t%2)==0).collect(Collectors.toList());
	}
	
	
	public List<Integer> oddnumbers(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		return list.stream().filter(t -> (t%2)!=0).collect(Collectors.toList());
	}

}
