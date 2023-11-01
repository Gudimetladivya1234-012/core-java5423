package com.kiju.Set;

import java.util.Iterator;
import java.util.TreeSet;

//program to demonsrate tree operation
public class TreeSetProg {
	public static void treeSetOperations() {
		TreeSet<Integer>num_treeSet=new TreeSet<Integer>();
		num_treeSet.add(55);
		num_treeSet.add(65);
		num_treeSet.add(155);
		num_treeSet.add(15);
		System.out.println("tree set ele are"+num_treeSet);
		//call iterator
		Iterator<Integer>iter=num_treeSet.iterator();
		System.out.println("ele are iterator");
		while(iter.hasNext());
		System.out.println(iter.next());
		
		
		
		
	}

}