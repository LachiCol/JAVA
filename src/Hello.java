
import java.util.Scanner;

public class Hello {
static int A;
static int B;
static int C;
static int D;
static int E;
	public static void main(String[] args) {
		System.out.println("1000원 미만의 거스름돈을 입력하시오.");
		Scanner input = new Scanner(System.in);
		int W = input.nextInt();
		
		if (W >= 1000) {
			 System.out.println("입력한 금액이 1000원 이상입니다.");
			 return;
		}
		
		while (true) {
			if (W >= 500) {
				W = W - 500;
				A++;
				continue;
			}
			if (W >= 100) {
				W = W - 100;
				B++;
				continue;
			}
			if (W >= 50) {
				W = W - 50;
				C++;
				continue;
			}
			if (W >= 10) {
				W = W - 10;
				D++;
				continue;
			}
			if (W >= 1) {
				W = W - 1;
				E++;
				continue;

			}
			if (W == 0) {
				break;
			}
		}
		
		
		System.out.println("거스름돈은 500원 "+A+"개, 100원 "+B+"개, 50원"+
		C+"개, 10원 "+D+"개, 1원"+E+"개 입니다.");
	}

}
