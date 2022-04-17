	import java.util.Scanner;

public class dotGame {


		public static void main(String[] args) {
		
			int randomNumber=(int)(Math.random()*10000)%10;
			
			for(int i=10;i>=1;i=i-1) {
				System.out.println(+i+"번 안에 정답을 맞추세요.");
				
				Scanner input=new Scanner(System.in);
				int data=input.nextInt();
				
				if(data==randomNumber) {
					System.out.println("정답입니다.");
					break;
				}
				else if(data>randomNumber) {
					System.out.println("정답보다 큽니다.");
				}
				else{
					System.out.println("정답보다 작읍니다.");
				}
			}
	return;
		}
	}
