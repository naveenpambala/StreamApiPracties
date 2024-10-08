package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
	
	
	public static void main(String[] args) {
		
		//!-way
		Stream<Object> stream=Stream.empty();
		stream.forEach(e->{
			System.out.println(e);
		});
		
		//2-way array,object,collection
		String str[]= {"navin","pubsu","anu"};
		
		Stream<String> stream1=Stream.of(str);
			stream1.forEach(e->{
				System.out.println(e);
				
			});
			
			//3 list ,set
			List<Integer> list= new ArrayList<>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			Stream<Integer> stream2=list.stream();
			stream2.forEach(e->{
				System.out.println(e);
			});
			
	
	}

}
