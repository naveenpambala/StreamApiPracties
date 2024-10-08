package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		
		//filter
		
		List<String> str= List.of("Navin","pubsu","Anu");
//		List<Integer> str2=str.stream().filter(e->e.startsWith("p");}).collect(Collectors.toList());
		List<String> newList=str.stream().filter(e->e.startsWith("p")).collect(Collectors.toList());
		System.out.println("Filter"+newList);
		
		
		
		//map
		List<Integer> list=Arrays.asList(2,4,5,6,7,8,9,0);
		List<Integer> newList2=list.stream().map(i-> i*i).collect(Collectors.toList());
		System.out.println("Map"+newList2);
		
		
	    List<Integer> list2=list.stream().filter(n-> n % 2 ==1).sorted().map(n-> n*2).collect(Collectors.toList());
	    System.out.println("Filter"+list2);
	
	
		
		
		
		
	};

}
