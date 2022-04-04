import java.util.Scanner;

public class grade {

	public static void main(String[] args) {

		char grade;
		for (int i = 0; i < 3; i++) {

			int score;
			System.out.println("성적을 입력하세요.");
			Scanner input = new Scanner(System.in);
			score = input.nextInt();

			if (score > 0 && score < 100) {
				switch (score / 10) {
				case 10:
				case 9:
					grade = 'A';
					break;

				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				default:
					grade = 'F';
					break;
				}
				System.out.println("성적은: " + grade);
			} else {
				System.err.print("잘못된 점수입니다");
			}
		}
	}

}
