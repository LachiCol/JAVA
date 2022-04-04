import java.util.Scanner;

public class KgtoPound {

	public static void main(String[] args) {
		System.out.println("무게(kg)를 입력하세요.");
		Scanner input = new Scanner(System.in);
		double kg = input.nextInt();

		double pound = 0.453592 * kg;

		System.out.println("파운드(pound)로 변환한 무게: " + (String.format("%.3f", pound)));

	}

}
