package first;

public class C {
	
	public static void countvowel(String word) {
		String letter=word.toLowerCase();
		char ch ;
		int count = 0,ccount=0,a=0,e=0,i=0,o=0,u=0;;
		for(int k=0;k<letter.length();k++) {
			ch=letter.charAt(k);
			if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
				count ++;
			}
			else if(ch>'a' && ch <'z') {
				ccount ++;
			}
			if(ch=='a') {
				 a++;
			 }
			if(ch=='e') {
				 e++;
			 }
			if(ch=='i') {
				 i++;
			 }
			if(ch=='o') {
				 o++;
			 }
			if(ch=='u') {
				 u++;
			 }
		}
		
		if(count>0) System.out.println("Count of vowel is  : "+count);
		if(ccount>0)System.out.println("Count of consenent is  : "+ccount);
		if(a>0)		System.out.println("Count of a is  : "+a);
		if(e>0)		System.out.println("Count of e is  : "+e);
		if(i>0)		System.out.println("Count of i is  : "+i);
		if(o>0)		System.out.println("Count of o is  : "+o);
		if(u>0)		System.out.println("Count of u is  : "+u);
	}

	
	public static void countcase(String word) {
		int upperc=0,lowerc=0;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			if(c>='A' && c<='Z') {
				upperc++;
			}
			if (c>='a' && c<='z') {
				lowerc++;
			}
		}
		System.out.println("Upper case : "+ upperc);
		System.out.println("Lower case : "+lowerc);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countvowel("TheKiranAcademy");
		countcase("TheKiranAcademy");
		
	}

}
