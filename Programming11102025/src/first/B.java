package first;

public class B {
	
	public static void vowelcheck(char ch) {
		if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' 
				|| ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("its a vowel");
		}
		 else if (ch == '@' || ch=='#' || ch=='!'|| ch=='~') {
	           System.out.println("Its a special character");
	        } 
		    else {
	           System.out.println("Its a concenet");
	        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelcheck('a');
		vowelcheck('b');
		vowelcheck('@');
	}

}
