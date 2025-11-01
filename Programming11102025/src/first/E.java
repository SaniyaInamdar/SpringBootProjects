package first;

public class E {

	
	public static void reversewords(String name) {
		System.out.println(name);
		String[] word=name.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversewords("The Kiran Academy");
	}

}
