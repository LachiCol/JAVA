	import java.util.Scanner;

public class dotGame {


		public static void main(String[] args) {
		
			int randomNumber=(int)(Math.random()*10000)%10;
			
			for(int i=10;i>=1;i=i-1) {
				System.out.println(+i+"�� �ȿ� ������ ���߼���.");
				
				Scanner input=new Scanner(System.in);
				int data=input.nextInt();
				
				if(data==randomNumber) {
					System.out.println("�����Դϴ�.");
					break;
				}
				else if(data>randomNumber) {
					System.out.println("���亸�� Ů�ϴ�.");
				}
				else{
					System.out.println("���亸�� �����ϴ�.");
				}
			}
	return;
		}
	}
