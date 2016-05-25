package by.epam.cdp.task_2_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareCollections {
	public static final int NUMBER_OF_ELEMENTS = 30000;
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// ADD operation
		// ArrayList
		System.out.println("---ADD operation---");

		long startTime = System.nanoTime();
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("ArrayList:  " + totalTime);

		// LinkedList
		startTime = System.nanoTime();
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("LinkedList: " + totalTime);
		

		// GET operation
		// ArrayList
		System.out.println("---GET operation---");

		startTime = System.nanoTime();
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("ArrayList:  " + totalTime);

		// LinkedList
		startTime = System.nanoTime();
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("LinkedList: " + totalTime);
		

		// REMOVE operation
		// ArrayList remove
		System.out.println("---REMOVE operation---");

		startTime = System.nanoTime();
		for (int i = NUMBER_OF_ELEMENTS - 1; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("ArrayList:  " + totalTime);

		// LinkedList remove
		startTime = System.nanoTime();
		for (int i = NUMBER_OF_ELEMENTS - 1; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("LinkedList: " + totalTime);
	}

}
