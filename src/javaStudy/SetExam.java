package javaStudy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExam {
		
	public static void main(String[] args) {
		
//		Set<String> set1 = new HashSet<>();
//		boolean flags1 = set1.add("kang");
//		boolean flags2 = set1.add("kim");
//		boolean flags3 = set1.add("kang");
//		
//		System.out.println(set1.size());
//		
//		System.out.println(flags1);
//		System.out.println(flags2);
//		System.out.println(flags3);
//		
//		Iterator<String> iter = set1.iterator();
//		while(iter.hasNext()) {
//			String str = iter.next();
//			System.out.println(str);
		
		List<String> list = new ArrayList<>();

		list.add("kim");                 // list에 2개의 문자열을 저장합니다.
		list.add("lee");

		for(int i = 0; i < list.size(); i++){
		    String str = list.get(i);    // list의 값을 받아올 때에는 list.get()을 사용합니다.
		    System.out.println(str);
		}
		}
	}
	

