package com.abhisek.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,3,9,6,4);
		
		List<Object> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
	}
	
	//Filtering even numbers
	public List<Integer> evennumbers(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		return list.stream().filter(t -> (t%2)==0).collect(Collectors.toList());
	}
	
	//Filtering odd numbers
	public List<Integer> oddnumbers(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		return list.stream().filter(t -> (t%2)!=0).collect(Collectors.toList());
	}
	
	//method to find god
	public Optional<String> findGod(){
		List<String> list = Arrays.asList("God","Gita","Ganga","Gau");
		Optional<String> thee = list.stream().filter(t -> t.equalsIgnoreCase("god")).findAny();
		if(thee.isPresent()){
			thee.get();
		}
		return thee;
	}

}
