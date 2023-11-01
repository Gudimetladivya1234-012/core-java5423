package com.kiju.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
	public static void operations() {
		Set<Integer>numSet=new HashSet<Integer>();
		//add an ele
		numSet.add(13);
		//add a list of numbers to the set
		numSet.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		System.out.println("set ele are"+numSet);
		//size
		System.out.println("set ele are"+numSet.size());
		//create a new set class and intialize with list of ele
		Set<Integer>oddSet=new HashSet<Integer>();
		oddSet.addAll(Arrays.asList(new Integer[] {1,7,3,5}));
		System.out.println("set ele are"+oddSet);
		//contains()
		System.out.println("num set contain ele 3"+numSet.contains(3));
		//Intersection=>retainAll
		Set<Integer>Set_intersection=new HashSet<Integer>(numSet);
		Set_intersection.retainAll(oddSet);
		System.out.println(Set_intersection);
		//union=>addAll
		Set<Integer>Set_union=new HashSet<Integer>(numSet);
		Set_union.addAll(oddSet);
		System.out.println(Set_union);
		//difference=>removeAll
		Set<Integer>Set_difference=new HashSet<Integer>(numSet);
		Set_difference.removeAll(oddSet);
		System.out.println(Set_difference);
		
	}

}