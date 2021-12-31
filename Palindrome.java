package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		int n = 34343;
		int num=34343;
		int reverse = 0;
		while(n!=0)
		{
			int remainder = n%10;
			reverse = reverse*10 + remainder;
			int number = n/10;
			n = number;
		}
	
		System.out.println("The reversed number is " +reverse);
if (reverse==num)
{
System.out.println("The given number is a Palindrome");
}

else
{
	System.out.println("Not a Palindrome");
	}

}
}
