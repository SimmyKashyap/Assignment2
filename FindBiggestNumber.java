import java.util.Scanner;
class FindBiggestNumber{
	public static void main(String[] args){
		//int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three different numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println(a+" is biggest number ");
		}
		else if(b>a && b>c){
			System.out.println(b+" is biggest number ");
		}
		else if(c>a && c>b){
			System.out.println(c+" is biggest number ");
		}
	}
}