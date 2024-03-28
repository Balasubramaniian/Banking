package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapwithList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("love","action","science"));
		Map<Integer,String> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		boolean ans=true;
		int i=1;
		while(ans) {
			int choice=sc.nextInt();
			switch(choice) {
			case 1->{
				System.out.println("Enter the Genre");
				String genre=sc.next().toLowerCase();
				
					if(list.contains(genre))
					   map.put( i++,genre);
				System.out.println(map);
			}
			case 2-> ans=false;
			}
		}
		
	}
}
