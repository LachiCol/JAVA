import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		System.out.println("문자와 온도를 입력하세요.");
		Scanner input = new Scanner(System.in);
		double Char = input.next().charAt(0);
		double Temp = input.nextInt();

		if (Char == 'c' || Char == 'C') {
			System.out.printf("섭씨: " + Temp + " 화씨: " + (5.0 / 9.0) * (Temp - 32));
		} else if (Char == 'f' || Char == 'F') {
			System.out.printf("화씨: " + Temp + " 섭씨: " + (9.0 / 5.0) * (Temp + 32));
		} else {
			System.out.println("잘못된 값을 입력하였습니다.");
		}
	}

}
