import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		System.out.println("달을 입력하시오.");
		Scanner input = new Scanner(System.in);
		double Month = input.nextInt();

		if (Month >= 1 && Month <= 6) {
			System.out.println("상반기 입니다");
		} else if (6 < Month && Month <= 12) {
			System.out.println("하반기 입니다");
		} else {
			System.out.println("그런 달은 없습니다..");
		}
	}

}
