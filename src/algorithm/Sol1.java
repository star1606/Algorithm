package algorithm;

import java.util.Scanner;

public class Sol1 {

	public static void main(String[] args) {

		Sol1 sol = new Sol1();
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
