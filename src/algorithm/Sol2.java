package algorithm;

import java.util.Scanner;

public class Sol2 {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {

				System.out.println("숫자 A를 입력하시오");
				int a = sc.nextInt();
				System.out.println("숫자 B를 입력하시오");
				int b = sc.nextInt();
				System.out.println("수행할 연산을 입력하시오.");
				String operation = sc.next();
				int result = 0;
				switch (operation) {
				case "+":
					result = a + b;
					break;

				case "-":
					result = a - b;
					break;

				case "*":
					result = a * b;
					break;

				case "/":
					result = (a / b);
					break;

				default:
					System.out.println("잘못입력하였습니다");

				}

				System.out.println("결과: " + result);
				System.out.println("종료를 하시려면 exit를 입력하세요.");
				String exit = sc.next();
				if (exit.equals("exit") || exit.equals("EXIT")) {
					System.out.println("종료");
					return;
				}

			} catch (ArithmeticException e) {
				System.out.println("계산 오류 발생");
			} finally {
				System.out.println("----------------------");

			}

		}

	}

}
