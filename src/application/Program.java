package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Inform the student ID:");
			int id = sc.nextInt();
			a.add(id);
		}
		System.out.println("How many students for course B?");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Inform the student ID:");
			int id = sc.nextInt();
			a.add(id);
		}
		System.out.println("How many students for course C?");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Inform the student ID:");
			int id = sc.nextInt();
			a.add(id);
		}
		
		Set<Integer> total = new HashSet<>(a);
		
		total.addAll(b);
		total.addAll(c);
		
		System.out.println();
		System.out.println("Total Student: " + total.size());
		
		sc.close();
		
		
	}
	
}
