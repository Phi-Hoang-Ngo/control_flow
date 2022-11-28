package control_flow;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.*;

@SuppressWarnings("rawtypes")
public class Survey {
	String[] questions = { "Do you have a red car? yes or no",
			"What is the first name of your favorite actor or actress?", "What is the name of your favorite pet?",

			"How old is this pet?", "What is your lucky number?",
			"What is your favorite quarterback's number, if you have one?",
			"What is the two digit model year of your car?", "Enter a number between 1 and 50." };
	String[] answers = new String[3];
	static int[] numAnswers = new int[5];
	int t = 0;
	int i;

	{

		for (i = 0; i < questions.length; i++) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);

			System.out.println(questions[i]);

			if (i < 3) {
				answers[i] = input.next();
			} else {
				if (input.hasNextInt()) {
					numAnswers[t] = input.nextInt();
					t++;
				} else {
					Function();

				}

			}
		}

		Random random = new Random();
		int x = random.nextInt(50);
		int y = random.nextInt(50);
		int z = random.nextInt(74);
		int magicBall = x * numAnswers[1];
		{
			if (magicBall < 76) {
				;
			} else if (magicBall < 0) {
				for (; magicBall < 0;) {
					magicBall = magicBall + 75;
				}
			} else {
				for (; magicBall > 75;) {
					magicBall = magicBall - 75;
				}
			}
			if (magicBall == 0) {
				magicBall = z + 1;
			}
		}
		int first = numAnswers[1] + numAnswers[3];
		int second = numAnswers[4] - y;
		int third = numAnswers[0] + numAnswers[3];
		int fourth = numAnswers[0] + numAnswers[1] + numAnswers[2];
		String s = answers[1];
		char n = s.charAt(2);
		int fifth = (int) n;
		int lottoNums[] = new int[5];
		{
			lottoNums[0] = first;
			lottoNums[1] = second;
			lottoNums[2] = third;
			lottoNums[3] = fourth;
			lottoNums[4] = fifth;
			for (int h = 0; h < 5; h++) {
				if (lottoNums[h] == 0) {
					lottoNums[h] = random.nextInt(65);
				}
			}
			Function1(lottoNums);
			for (int h = 0; h < 5; h++) {
				if (lottoNums[h] > 66) {
					for (; lottoNums[h] > 66;) {
						lottoNums[h] = lottoNums[h] - 65;
					}
				} else if (lottoNums[h] < 0) {
					for (; lottoNums[h] < 0;) {
						lottoNums[h] = lottoNums[h] + 65;
					}
				} else {
					;
				}
			}
			Arrays.sort(lottoNums);
			System.out.println("Lotto Numbers are " + Arrays.toString(lottoNums) + " Powerball: " + magicBall + ".");
		}
	}

	void Function() {
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please Only Enter Numbers\n\n" + questions[i]);
		if (input2.hasNextInt()) {
			numAnswers[t] = input2.nextInt();
			t++;
		} else {
			Function();

		}
	}

	private void Function1(int[] lottoNums) {

		for (int i = 0; i < lottoNums.length - 1; i++) {
			for (int j = i + 1; j < lottoNums.length; j++) {
				if ((lottoNums[i] == lottoNums[j]) && (i != j)) {
					System.out.println("Duplicate Element : " + lottoNums[j]);
					lottoNums[j] = lottoNums[i] * 2;
					Function1(lottoNums);
				} else if (lottoNums[i] == 0) {
					Random random1 = new Random();
					int z = random1.nextInt(65);
					lottoNums[i] = z;
				}
			}
		}
	}

}