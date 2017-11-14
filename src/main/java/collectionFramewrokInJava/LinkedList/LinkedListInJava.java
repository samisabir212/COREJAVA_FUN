package collectionFramewrokInJava.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {
	
	public static void main(String[] args) {



		List linkedList = new LinkedList<List>();

		linkedList.add(50);
		linkedList.add(50);
		linkedList.add(9.8);
		linkedList.add(100);
		linkedList.add(true);
		linkedList.add(50);
		linkedList.add("sami");

		System.out.println(linkedList);

		linkedList.add(2, 10);

		System.out.println(linkedList.get(2));

		System.out.println(linkedList);
		linkedList.remove(2);
		System.out.println(linkedList.get(2));
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.get(4));
		
		List<Object> linkedList1 = new LinkedList<Object>();
		linkedList1.add(50);
		linkedList1.add(50);
		linkedList1.add(9.8);
		linkedList1.add(100);
		linkedList1.add(true);
		linkedList1.add(50);

		
		System.out.println(linkedList1);
		System.out.println(linkedList1);
	}

}
