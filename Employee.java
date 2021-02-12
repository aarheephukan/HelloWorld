package classandobject;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Employee robert = new Employee() ;
		robert.setName("Richard");
		robert.setAddress("64C-Walls Street");
		robert.setyearofjoining("1994");
		
		System.out.println(robert.getName());
		System.out.println(robert.getAddress());
		System.out.println(robert.getYearofjoining());
		
		Employee sam = new Employee() ;
		sam.setName("Sam");
		sam.setAddress("68D - Walls Street");
		sam.setyearofjoining("2000");
		
		System.out.println(sam.getName());
		System.out.println(sam.getAddress());
		System.out.println(sam.getYearofjoining());
		
		Employee john = new Employee() ;
		john.setName("John");
		john.setAddress("26B-Walls Street");
		john.setyearofjoining("1999");
		
		System.out.println(john.getName());
		System.out.println(john.getAddress());
		System.out.println(john.getYearofjoining());
		
		ArrayList<Employee> arr = new
				ArrayList<>();
		arr.add(robert);
		arr.add(sam);
		arr.add(john);
		
		for(int i=0;i<3;i++) {
			
			System.out.println(arr.get(i).getName());
		}
		}
		
	}
