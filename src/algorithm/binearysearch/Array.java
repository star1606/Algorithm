package algorithm.binearysearch;

import java.util.ArrayList;

public class Array {

	public String binarySearch(int[] array, int target) {
		// 배열하고 ArrayList는 다른 형태이다
		// ArrayList<Integer> array 이거 쓰면 안됨..
		// 배열은 Integer 안해도 됨!
		// int guess로 매개변수 넣었는데 매개 변수를 넣을 필요가 없음 guess는 내가 지정하는게 아니라
		// guess는 이진검색으로 max - min / 2 해서 나오는 값임

		// 입력값은 array라고 부르는 배열, array의 요소의 개수 n, 검색 대상의 수 target입니다.
		// 결과값은 array 속 target의 인덱스 값입니다.

		// ArrayList<Integer> array = new ArrayList<>();
		// array 요소의 개수를 어떻게 구하지?
		// 여기서 n-1의 매개변수를 한 개 줄이고 array.length도입
		int min = 0;
		// int max = n - 1;
		int max = array.length;
		int guess = (max-min)/2;
		
		System.out.println("초기 target값: " + target);
		System.out.println("초기 guess 값: " + guess);
		System.out.println("초기 min 값: " + min);
		System.out.println("초기 max 값: " + max);
		while (true) {
			try {
				Thread.sleep(3000);

				if (max < min) {
					System.out.println("max < min 인 경우");
					return target + "이 " + array + "에 존재하지 않습니다 -1";

				}else if (max > min) {
					
					if (array[guess] == target) {
						System.out.println("guess와 타겟 일치함");
						return "타겟을 찾았습니다 guess: " + guess;
					}

					if (array[guess] < target) {
						System.out.println("target이 array[guess]값보다 큼");
						min = guess + 1;
						System.out.println("min 값: " + min);
						System.out.println("max 값: " + max);
				
						System.out.println("target이 클 때: " +guess);
					} if(array[guess] > target) {
						System.out.println("target이 array[guess]값보다 작음");
						max = guess;
						System.out.println("min 값: " + min);
						System.out.println("max 값: " + max);
						
						System.out.println("target이 작을 때: " + guess);
					}
					
					
				} {
					
					
				}

				// Math.floor는 Double형에서 쓰는 함수이다.
				// int에서는 자동으로 내림을 하기 때문에 쓸 필요 없다.
				// guess = Math.floor((max-min)/2);
				// guess = (max - min) / 2;

				// 왜 오류 뜨지?
				

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

		// 메소드가 메모리에 존재하지 않기 떄문에 메모리에 띄어주기 위해 new 한다 (heap영역)
		Array arrayObject = new Array();
		System.out.println(arrayObject.binarySearch(testArray, 30));

	}

}
