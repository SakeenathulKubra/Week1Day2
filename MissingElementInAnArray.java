package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int n= arr.length;
		for(int i = 1; i<=n; i++)
		{
			if (i!=arr[i-1])
			{
				System.out.println("Missing Number is "+i);
				break;
			}
			
		}
		

	}

}
