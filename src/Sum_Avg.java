import java.util.Scanner;

public class Sum_Avg {

	public static void main(String[] args) {
		System.out.println("숫자 두개를 입력하세요.");
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();

		double SUM = A + B;
		double AVG = SUM / 2.0;
		System.out.println("합: " + SUM);
		System.out.println("평균: " + AVG);
	}

}
