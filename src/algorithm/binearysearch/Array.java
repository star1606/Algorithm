package algorithm.binearysearch;

import java.util.ArrayList;

public class Array {

	// 메소드에 static을 걸어줘야함..
	public String binarySearch(int[] array, int target, int guess) {
		// 배열하고 ArrayList는 다른 형태이다
		// ArrayList<Integer> array 이거 쓰면 안됨..
		// 배열은 Integer 안해도 됨!

		// 입력값은 array라고 부르는 배열, array의 요소의 개수 n, 검색 대상의 수 target입니다.
		// 결과값은 array 속 target의 인덱스 값입니다.

		// ArrayList<Integer> array = new ArrayList<>();
		// array 요소의 개수를 어떻게 구하지?
		// 여기서 n-1의 매개변수를 한 개 줄이고 array.length도입
		int min = 0;
		// int max = n - 1;
		int max = array.length;
		System.out.println("처음max값: " + max);
		while (true) {
			try {
				Thread.sleep(3000);

				System.out.println("실행?");
				System.out.println("target값: " + target);
				System.out.println("guess 값: " + guess);
				System.out.println("min 값: " + min);
				System.out.println("max 값: " + max);

				if (max < min) {
					return target + "이 " + array + "에 존재하지 않습니다 -1";

				}

				// Math.floor는 Double형에서 쓰는 함수이다.
				// int에서는 자동으로 내림을 하기 때문에 쓸 필요 없다.
				// guess = Math.floor((max-min)/2);
				guess = (max - min) / 2;

				// 왜 오류 뜨지?
				if (array[guess] == target) {
					return "타겟을 찾았습니다 guess: " + guess;
				}

				if (array[guess] < target) {
					min = guess + 1;
				}

				if (array[guess] > target) {
					max = guess - 1;
				}

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		// test는 main 함수에서 하면 된다.
		// 자바 배열 만드는 문법
		// 이렇게하면 오류 int[] testArray = [2, 3, 5];
		// 이것도 아님 int[] testArray = new Array() ;
		int[] testArray = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		Array arrayObject = new Array();

		// static영역에 안에 있는 함수부터 먼저 실행되서. 메소드가 static이어야한다
		System.out.println(arrayObject.binarySearch(testArray, 30, 4));

	}

}
