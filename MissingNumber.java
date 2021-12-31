package week1.day2.assignments;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {12,13,14,15,16,17,19,20,21};
		int n = arr.length;
		int idealSum= (n*(n+1))/2;
		int sum= calculateSum(arr);
		int missingNumber= idealSum-sum;
		System.out.println("The missing number is " +missingNumber);
			

	}
public static int calculateSum(int[] arr) {
int n=arr.length;
int total = 0;

for (int i=1; i<n; i++) 
	  {
	
	total= arr[i]+total;
}

return total;
}

}
