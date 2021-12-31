package week1.day2.assignments;

public class NegativeToPositive {

	public static void main(String[] args) {
		int num=-35;
		if(num<0)
		{
			num= num - 2*num;
			System.out.println("The converted number is " +num);
		}
		else
		{
			System.out.println("The number is not negative");
		}

	}

}
