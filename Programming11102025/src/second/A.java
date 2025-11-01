package second;

public class A {

		public static void Square(int num) {
			/*
			 * double square=Math.sqrt(num);
			 * System.out.println("Square of number is  : "+square);
			 */
			int i=1;
			while(i*i<=num) {
				i++;
			}
			i--;
			System.out.println("Square root of number is  : "+i);
		}
		
		public static void Root(int num) {
			/*
			 * double root=Math.cbrt(num); 
			 * System.out.println("Root of number is : "+root);
			 */
			
			int i=1;
			while(i*i*i<=num) {
				i++;
			}
			i--;
			System.out.println("Cube root of number is  : "+i);
		}
		
		public static void SimpleInterest(int prinipalamt,int interestrate,int timeperiod) {
			double simpleinterest= (prinipalamt * interestrate * timeperiod)/100;
			System.out.println("Simple Interest is : "+simpleinterest);
		}
	
		public static void CompundInterest(int principleamt, int interestrate, int timeperiod) {
			double amount = principleamt * Math.pow((1 + interestrate / 100.0), timeperiod);
		    double compoundinterest = amount - principleamt;
			System.out.println("Compund interest is : "+compoundinterest);
		}
		
		public static void KMConverter(int kilimeter) {
			int meter= kilimeter*1000;
			int centimeter = kilimeter*100000;
			int milimeter = kilimeter*1000000;
			System.out.println("Meter : "+meter+" Centimeter : "+centimeter+" Milimeter : "+milimeter);
		}
		
		public static void CalenderConverter(int days){
			int years = days / 365;
			int remainingDays = days % 365;
			int weeks = remainingDays / 7;
			int day = remainingDays % 7;
			System.out.println(days+" Year: "+years+" week : "+weeks+" day :"+day);
		}
		
		public static void TimeConverter(int hours) {
			double minutes= hours*60;
			double seconds = minutes*60;
			System.out.println(hours +" Minutes : "+minutes+" Seconds : "+seconds);
		}

		
	public static void main(String[] args) {
		 Square(40000); 
		 Root(8000); 
		 SimpleInterest(50000, 4, 1);
		 CompundInterest(10000, 10, 2);
		 KMConverter(1);
		 CalenderConverter(365);
		 TimeConverter(1);
	}

}
