package algorithm.binearysearch;

import java.util.ArrayList;

public class Array {
	
	public String binarySearch(Integer[] array, int n, int target, int guess ) {
		// 배열하고 ArrayList는 다른 형태이다
		// ArrayList<Integer> array 이거 쓰면 안됨..
		
		// 입력값은 array라고 부르는 배열, array의 요소의 개수 n, 검색 대상의 수 target입니다. 
		// 결과값은 array 속 target의 인덱스 값입니다.
		
		//ArrayList<Integer> array = new ArrayList<>();
		// array 요소의 개수를 어떻게 구하지? 
		
		int min = 0;
		int max = n - 1;
		while(true) {
			
			if(max< min) {
				return  target + "이 " + array + "에 존재하지 않습니다 -1";
			
			}

			// Math.floor는 Double형에서 쓰는 함수이다.
			// int에서는 자동으로 내림을 하기 때문에 쓸 필요 없다.
			//guess = Math.floor((max-min)/2);
			guess = (max-min)/2;
			
			// 왜 오류 뜨지?
			if(array[guess] == target) {
				return "타겟을 찾았습니다 guess: " + guess;
			}
			
			if(array[guess] < target) {
				min = guess + 1;
			}
			
			if(array[guess] > target) {
				max = guess -1;
			}
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		int test1 = 2;
		int test2 = 5;
		
		System.out.println((test2-test1)/2);
	}
	
	
}
