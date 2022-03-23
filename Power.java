import java.util.Scanner;

	class Power {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			float num1;
			int num2;
			System.out.print("Base: ");
			num1 = ler.nextFloat();
			System.out.print("Power: ");
			num2 = ler.nextInt();
			new Pow().pow(num1,num2);
		}
	}
