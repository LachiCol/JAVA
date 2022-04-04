
import java.util.Scanner;

public class Todigit {

	public static void main(String[] args) {
		System.out.printf("정수를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		System.out.printf("8진수: %o, 10진수: %d, 16진수: %x", N, N, N);

	}

}
