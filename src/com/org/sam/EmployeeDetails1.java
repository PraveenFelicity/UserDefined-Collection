package com.org.sam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.org.udcl.Employee;

public class EmployeeDetails1 {

	public static void main(String[] args) {

		Employee et = new Employee ();
		et.setName("David Hussey");
		et.setId(875439);
		et.setSal(75000.60f);
		et.setPhn(9994145091l);
		
		Employee et1 = new Employee();
		et1.setName("Mike Hussey");
		et1.setId(875438);
		et1.setSal(70000.50f);		
        et1.setPhn(9443249968l);	
		
        List<Employee> td = new ArrayList<>();
        td.add(et);
        td.add(et1);
           for (int i = 0; i < td.size(); i++) {
           System.out.println( td.get(i).getName());          	
           System.out.println( td.get(i).getId());  
           }         
           Set<Employee> st = new HashSet<>();
           st.add(et);
           st.add(et1);
          for (Employee rt : st) {
			System.out.println(rt.getName());
			System.out.println(rt.getId());
			System.out.println(rt.getSal());
          }
			
          Map<Integer, Employee> mpt = new HashMap<> ();
          mpt.put(1, et);
          mpt.put(2, et1);
          for (Employee y : st) {
        	  System.out.println(y.getName());
			System.out.println(y.getPhn());
		}
          
    
	}
	
	
}
