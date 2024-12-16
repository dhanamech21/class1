package com.encapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program2 extends Program1{
	
	public static void main(String[] args) {
		
		Program2 c=new Program2();
		c.setName("Mani");
		String name = c.getName();
		System.out.println(name);
		
		c.setAccountnumber(12345);
		int accountnumber = c.getAccountnumber();
		System.out.println(accountnumber);
		
		Program2 c1=new Program2();
		c1.setName("Bala");
		String name1 = c1.getName();
		System.out.println(name1);
		
		c1.setAccountnumber(67890);
		int accountnumber1 = c1.getAccountnumber();
		System.out.println(accountnumber1);
		
		Program2 c2=new Program2();
		c2.setName("Hari");
		String name2 = c2.getName();
		System.out.println(name2);
		
		c2.setAccountnumber(111213);
		int accountnumber2 = c2.getAccountnumber();
		System.out.println(accountnumber2);
		
		System.out.println("===User Defined List===");
		
		List<Program1> li=new ArrayList<Program1>();
		li.add(c);
		li.add(c1);
		li.add(c2);
		
		for(int i=0; i<li.size();i++) {
			Program1 program1 = li.get(i);
			System.out.println(program1.getName());
			System.out.println(program1.getAccountnumber());
		}
		System.out.println("===User Defined Set===");
		Set<Program1> si=new HashSet<Program1>();
		si.add(c);
		si.add(c1);
		si.add(c2);
		
		for(Program1 s:si) {
			System.out.println(s.getName());
			System.out.println(s.getAccountnumber());
		}
		System.out.println("====User Defined Map====");
		
		Map<Integer,Program1>mi=new HashMap<Integer,Program1>();
		mi.put(10, c);
		mi.put(20, c1);
		mi.put(30, c2);
		
		System.out.println("Dhana");
		
		Set<Entry<Integer,Program1>>entrySet=mi.entrySet();
		for(Entry<Integer,Program1>d:entrySet) {
			Program1 value = d.getValue();
			System.out.println(value.getName());
			System.out.println(value.getAccountnumber());
		}
			
		}
		
		}
	


