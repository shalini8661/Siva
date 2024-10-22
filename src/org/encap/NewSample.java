package org.encap;

import java.util.ArrayList;
import java.util.List;

public class NewSample {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.setId(100);
		s.setName("shalini");
		Sample s1=new Sample();
		s1.setId(200);
		s1.setName("arun");
		Sample s2=new Sample();
		s2.setId(300);
		s2.setName("kavin");
		List<Sample> l=new ArrayList<>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		for (int i = 0; i < l.size(); i++) {
			int id=l.get(i).getId();
			System.out.println(id);
			String name=l.get(i).getName();
			System.out.println(name);
			
		}
		
	
	}
}
