package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; // erro de compilação

		List<?> myObjs1 = new ArrayList<Object>();
		List<Integer> myNumbers1 = new ArrayList<Integer>();
		myObjs1 = myNumbers1;

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
		list.add(3); // erro de compilação
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}