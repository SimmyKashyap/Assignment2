import java.util.Scanner;
class leapyear_or_not{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year you want to check whether it is leap or not :");
		int year=sc.nextInt();
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println(year+" is leap year");
				}
				else{
					System.out.println(year+" is not a leap year");
				}
				
			}
			else{
				System.out.println(year+" is leap year");
			}
			
			
		}
		else{
			System.out.println(year+" is not leap year");
		}
	}
	
}