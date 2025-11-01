package java;


/*76.	Write a program to accept a array and find its sum of elements. 
77.	Write a program to accept a array and print only even nos. 
78.	Write a program to accept a array and print sum of even nos. 
79.	Write a program to accept a array and print reverse array. 
80.	Write a program to accept a array and print array in ascending order. 
81.	Write a program to accept a array and print only prime nos array. 
82.	Find elements divisible by 5 and 7 in given array. (Input: 30 35 45 70 8 2 → Output: 
35,70). 
83.	Find smallest no of given array (e.g. 3 5 4 7 8 2). 
84.	Find the missing no from given array (1 2 4 5 6 7 8 → Output: 3). 
85.	Find the square of all array elements given array. 
86.	Find unique (not repeated) elements in array. 
87.	Find second smallest and second biggest number in array without sorting. 
88.	Write a program to count the frequency of each element in an array. 
89.	Write a program to accept an array and remove duplicate elements. 
90.	Write a program to accept an array and find the largest and smallest element. 
91.	Write a program to accept an array and search for a given element (linear search). */

public class  AllArrayPrograms{
	
	private static void orignalArray(int[] arr) {
		System.out.print("Orignal array : ");
		for(int i:arr) {
			System.out.print(i+" ");	
		}
		System.out.println();
	}
	
	public static void sumOfElements(int num[]) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println("Sum of all is : "+ sum);
	}
	
	public static void printEven(int num[]) {
		System.out.print("Even Numbers Are : ");
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
	}

	public static void sumOfEven(int num[]) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				sum=sum+num[i];
			}
		}
		System.out.println("Sum of even numbers is : "+sum);
	}
	
	public static void reverseArray(int num[]) {
		System.out.print("Reverse aarray is : ");
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	public static void ascendingOrder(int num[]) {
		System.out.print("Ascending order : ");
		int max=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[i]<num[j]) {
					max=num[i];
					num[i]=num[j];
					num[j]=max;
				}
			}
		}
		for(int i:num) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void primeNumbers(int num[]) {
		
		System.out.print("Prime Numbers are : ");
		for(int i=0;i<num.length;i++) {
			int count=0;
			if(num[i]>1) {
				for(int k=1;k<=num[i];k++) {
					if(num[i]%k==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.print(num[i]+" ");
				}
			}
		}
		System.out.println();
	}
	
	public static void divisibleBy5_7(int num[]){
		System.out.print("Number divisible by 5 and 7 is  : ");
		for(int i=0;i<num.length;i++) {
			if(num[i]%5==0 && num[i]%7==0) {
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void smallestNumber(int num[]) {
		System.out.print("Minimum number is array is : ");
		int min=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[i]<num[j]) {
					min=num[i];
					num[i]=num[j];
					num[j]=min;
				
			}
		}
	}
		System.out.println(num[0]);
}
	
	public static void squareElements(int num[]) {
		System.out.print("Square of elements are : ");
		for(int i=0;i<num.length;i++) {
			int square=num[i]*num[i];
			System.out.print(square+" ");
		}
		System.out.println();
	}
	
	public static void uniqueNumber(int num[]) {
		System.out.print("Unique numbers are : ");
		for(int i=0;i<num.length;i++) {
			boolean b=true;
			for(int j=0;j<num.length-1;j++) {
				if(num[i]==num[j] && i!=j) {
					b=false;
					break;
				}
			}
			if(b) {
				System.out.print(num[i]+" ");
			}
		}

		System.out.println();
	}
	
	public static void secondSmallestAndSecondLargest(int num[]) {
		
		System.out.print("Second smallest number is : ");
		int smallest=0,largest=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[i]<num[j]) {
					smallest=num[i];
					num[i]=num[j];
					num[j]=smallest;
				}
			}
		}
		System.out.print(num[1]);
		
		System.out.print("    Second largets number is : ");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[i]>num[j]) {
					largest=num[i];
					num[i]=num[j];
					num[j]=largest;
				}
			}
		}
		System.out.print(num[1]);
	}
	
	public static void frequencyofElements(int num[]) {
		for(int i=0;i<num.length;i++) {
			boolean alreadycounted=false;
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					alreadycounted=true;
					break;
				}
			}
			
			if(!alreadycounted) {
				int count=0;
				for(int l=0;l<num.length;l++) {
					if(num[i]==num[l]) {
						count++;
					}
				}
				System.out.println(num[i] +" = "+ count);
			}
		}
	}
	
	public static void searchElement(int num[],int number) {
		boolean b = false;
		for(int i=0;i<num.length;i++) {
			if(num[i]==number) {
				 b = true;
				 break;
			}
			else {
				 b = false;
			}
		}
		if(b==true) {
			System.out.println(number+" Is Founded...");
		}
		else {
			System.out.println(number+" Is not founded...");
		}
	}
	
	public static void missingElement(int num[]) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		if(sum==30) {
			System.out.println("No number is missing");
		}
		else {
			int miss= sum-30;
			System.out.println("Missing num is : "+miss);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {30,35,45,70,8,9,70,35,8,30};
		int arr2[]= {1,2,4,5,6,7,8};
		
		orignalArray(arr);
		sumOfElements(arr);
		printEven(arr);
		sumOfEven(arr);
		reverseArray(arr);
		ascendingOrder(arr);
		primeNumbers(arr);
		divisibleBy5_7(arr);
		smallestNumber(arr);
		squareElements(arr);
		uniqueNumber(arr);
		secondSmallestAndSecondLargest(arr);
		frequencyofElements(arr);
		searchElement(arr,78965);
		missingElement(arr2);
	}
}
