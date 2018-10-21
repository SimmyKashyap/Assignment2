import java.util.Scanner;
class PalindromeOrNot{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number you want to check: ");
	int num=sc.nextInt();
	int real=num;
	int reverse=0;
	while(num>0){
		int reminder=num%10;
		reverse=reverse*10+reminder;
		num=num/10;
	}
	if(reverse==real){
		System.out.println("number is paindrome ");
	}
	else{
		System.out.println("Number is not palindrome ");
	}
	
	
	}
}