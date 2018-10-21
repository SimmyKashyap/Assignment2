import java.util.Scanner;
class ReverseOfNumber{
public static void main(String[] args){
	System.out.println("Enter the number You want to find the reverse: ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int real=num;
	int reverse=0;
	while(num>0){
		int reminder=num%10;
		reverse=reverse*10+reminder;
		num=num/10;
	}
	System.out.println("Reverse of number "+real+" is :"+reverse);
	
}	
}