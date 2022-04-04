import java.util.Scanner;

public class dice {

	static int diceNum, Roll;
	static int count[] = new int[6];

	public static void main(String[] args) {

		System.out.println("100번의 주사위를 던집니다.");
		System.out.println("주사위 눈을 고르세요.");
		Scanner input = new Scanner(System.in);
		diceNum = input.nextInt(); // 입력할 주사위의 눈

		if (diceNum >= 1 && diceNum <= 6) { // 만약 주사위가 1이상 6이하면
			System.out.println(+diceNum + "번 주사위를 선택했습니다.");
			for (int i = 0; i < 100; i++) { // 100번의 주사위 굴리기 실행
				Roll = (int) (Math.random() * 10); // 난수로 만들어지는 결과값
				while (Roll > 5) {
					Roll = (int) (Math.random() * 10);
				}
				for (int j = 0; j < 6; j++) {
					if (Roll == j) {
						count[j]++;
					}
				}
				Roll++;
			}

			System.out.println("\n 주사위 굴리기 시도 횟수 100번 중에\n");
			for (int i = 0; i < 6; i++) { // 1에서 6사이의 주사위 중에

				System.out.println(i + 1 + "번눈이 " + count[i] + "번 나왔습니다.");
			}
		} else { // 만약 올바르지 않은 눈을 입력하면 오류 출력
			System.err.println("잘못된 수를 입력하였습니다.");
		}
	}
}
