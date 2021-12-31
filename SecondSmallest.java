package week1.day2.assignments;

import java.util.Arrays;

public class SecondSmallest {

	public static int main(String[] args) {
		int[] ex= {23,45,67,32,89,22};
		Arrays.sort(ex);
		System.out.println("The second smallest number is ");
		return(ex[1]);
		
	}

}
