import java.util.Random;
import java.util.Scanner;

public class gameLauncher {

	public class GuessGame {
	}

	public class Player {
	}

	public static void main(String[] args) {

		int com[] = new int[3];

		int user[] = new int[3];

		Random r = new Random();

		Scanner sc = new Scanner(System.in);

		int count = 0;

		while (com[0] == 0) {

			com[0] = r.nextInt(6);

		}

		while (com[0] == com[1] || com[1] == 0) {

			com[1] = r.nextInt(6);

		}

		while (com[1] == com[2] || com[2] == 0) {

			com[2] = r.nextInt(6);

		}

		while (true) {

			System.out.println("1~6 사이의 세 개의 숫자를 입력해주세요.");

			int strike = 0;

			for (int i = 0; i < user.length; i++) {

				System.out.print((i + 1) + "번째 수: ");

				user[i] = sc.nextInt();

				if (user[i] > 6 || user[i] <= 0) {

					System.err.println("숫자 범위는 1~6 입니다.");

					return;

				}

			}

			for (int i = 0; i < com.length; i++) {

				for (int j = 0; j < user.length; j++) {

					if ((com[i] == user[j] && i == j) || (com[i] == user[j] && i != j)) {

						strike++;

					}

				}

			}

			System.out.println("일치하는 수: " + strike);

			count++;

			if (strike == 3) {

				System.out.println("게임 끝\n" + count + "번째 시도만에 성공!");

				break;

			}

		}

	}

}