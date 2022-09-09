/*
public class Class2 {
	public static void main(String[]args) {
		int x = 10;
		int y = 9;
		if(x==10)
		System.out.println(x+y);
		else
		System.out.println(x-y);
	}

}*/

/*public class Class2 {
	    public static void main(String[]args) {
	    	int x = 10;
			int y = 9;
			if(x==10)
			System.out.println(x+y);
			else
			System.out.println(x-y);
	  
	}
}*/

import java.util.*;
public class Class2{
	public static void main(String[]args){
	int x,y,Sum;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first number");
	x=sc.nextInt();
	System.out.print("Enter the second number");
	y=sc.nextInt();
	Sum = sum(x,y);
	System.out.println("The sum of two numbers x and y is:" +Sum);
	}
	public static int sum(int x, int y){
		int sum = x+y;
		return sum;
	}
		
	}

	
	
	