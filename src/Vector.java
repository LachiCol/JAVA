import java.util.Scanner;

public class Vector {

	static int n = 3;

	static int dotProduct(int vect_A[], int vect_B[]) {

		int product = 0; // 내적 구하기

		for (int i = 0; i < n; i++)
			product = product + vect_A[i] * vect_B[i];
		return product;
	}

	static void sumProduct(int vect_A[], int vect_B[], int cross_P[])

	{

		cross_P[0] = vect_A[0] + vect_B[0];

		cross_P[1] = vect_A[1] + vect_B[1];

		cross_P[2] = vect_A[2] + vect_B[2];

	}

	public static void main(String[] args) {
		System.out.print("Input A's x, y, z:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		System.out.print("Input B's x, y, z:");
		Scanner input1 = new Scanner(System.in);
		int a = input1.nextInt();
		int b = input1.nextInt();
		int c = input1.nextInt();

		int vect_A[] = { x, y, z };
		int vect_B[] = { a, b, c };
		int cross_P[] = new int[n];

		System.out.print("Dot product:");
		System.out.println(dotProduct(vect_A, vect_B));

		System.out.print("sum product:");
		sumProduct(vect_A, vect_B, cross_P);

		for (int i = 0; i < n; i++)

			System.out.print(cross_P[i] + " ");

	}
}
