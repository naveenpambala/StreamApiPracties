package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(50);
		list.add(21);
		list.add(22);
		list.add(67);
		System.out.println(list);
		
//		without Stream
		List<Integer> newList=new ArrayList<>();
		for(int x:list) {
			if(x%2==0) {
				newList.add(x);
				
			}
		}
		System.out.println(newList);
		
						//With Stream
		           //one Way   
//		Stream<Integer> stream=list.stream();
//		List<Integer> newList1=stream.filter(i -> i%2 != 0).collect(Collectors.toList());
//		System.out.println(newList1);
		
		          //Second Way    
		List<Integer> newList2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList2);
	
		List<Integer> list2=list.stream().filter(i->i>=10).collect(Collectors.toList());
		System.out.println(list2);
		
		
		
		
	}

}
