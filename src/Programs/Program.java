package Programs;

import java.util.*;
public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean ans=true;
		while(ans) {
			System.out.println("Enter the day");
			int day=sc.nextInt();
			switch(day) {
			case 1,2,3,4->
				System.out.println("Welcome friends");
			
			case 5,6->
				System.out.println("Sunday kku innum 2 days iruku");
			default->ans=false;
			}
		}
	}
}
