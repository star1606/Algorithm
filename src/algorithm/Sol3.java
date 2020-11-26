package algorithm;

import java.util.Arrays;
import java.util.Random;

public class Sol3 {

	public static void main(String[] args) {
		Lottos lotto = new Lottos();
		lotto.start();

	}

}

class Lottos extends Thread {
	@Override
	public void run() {
		int[] lotto = new int[6];

		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) {
					i = i - 1;
					System.out.println("i: " + i);
					break;
				}
			}
		}
		Arrays.sort(lotto);

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
