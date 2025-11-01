package first;

import java.util.Scanner;

public class A {
	
	public static void large(int a,int b) {

	    if (a == b) {
            System.out.println("Both are equal");
        } 
	    else if (a > b) {
            System.out.println("Greater: " + a);
        } 
	    else {
            System.out.println("Greater: " + b);
        }
    }

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		
		large(a,b);
		sc.close();
	}
}
