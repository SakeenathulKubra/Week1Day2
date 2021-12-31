package week1.day2.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		int m;
		m=input/2;
		for(int i=2 ; i<=m; i++) 
		{
			if(input % i == 0) 
			{
	System.out.println("Not a Prime Number");
				flag = true;
				
							}
		
	
			else {
		System.out.println("Prime Number");
		
		break;
	}

}
}
}