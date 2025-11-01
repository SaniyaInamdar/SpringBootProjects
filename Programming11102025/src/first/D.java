package first;

public class D {

		public static void checkleap(int num) {
			int count=0;
			while(num>0) {
				num=num/10;
				count++;
			}
			
			if(count==4) {
				if(num%400==0 || (num%100!=0 && num%4==0)){
					System.out.println("Leap Year");
				}
				else {
					System.out.println("Not a Leap Year");
				}
			}
			else  {
				System.out.println("Invalid !");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkleap(1956);
	}

}
