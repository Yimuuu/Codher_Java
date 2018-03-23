package muyi;

public class RedAndBlue {

		public static void main(String []args) {
			student p1 = new student ( "Red", 98, 77, 88 );
			int a = p1.sum();
			System.out.println( "Red's Score is" +""+a );
			
			student p2 = new student("Blue", 88 ,90 ,100 );
			int b = p2.sum();
			System.out.println("Blue's score is"+""+b);
			
			if(a > b) {
				System.out.println("Red is the No.1");
			}
			else if(a == b) {
				System.out.println("They r both No.1");
			}
			else {
				System.out.println("Blue is the No.1");
			}



		
	}
}
	
class student{
		String name;
		int math;
		int English;
		int Music;
		public student(String name,int math,int English,int Music) 
		{
			this.name = name;
			this.math = math;
			this.English = English;
			this.Music = Music;
		}
		int sum() {
			return (math+English+Music)/3;
		}	
	}


