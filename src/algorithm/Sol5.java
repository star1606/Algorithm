package algorithm;

import java.util.Scanner;

public class Sol5 {

	public static void main(String[] args) {

		Sol5 sol = new Sol5();
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println(sol.reverse(value));

	}
	
	
	public int reverse(int x) {

		int value = 0;
		while (x != 0) {
			value = value * 10 + x % 10;
			x /= 10;
		}
		return value;

	}

	

}
