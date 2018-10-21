import java.util.Scanner;
class PrimeOrNot{
	public static void main(String[] args){
		int count=0;
		System.out.println("Enter the number you want to check whether it is prime or not: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(num+" is prime number ");
		}
		else{
			System.out.println(num+" is not prime number ");
		}
		
		count=0;
	}
}