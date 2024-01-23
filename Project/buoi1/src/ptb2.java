import java.util.Scanner;

public class ptb2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = sc.nextInt();
		System.out.print("Nhập b: ");
		int b = sc.nextInt();
		System.out.print("Nhập c: ");
		int c = sc.nextInt();
		double delta = Math.pow(b, 2) - 4*a*c;
		if (delta < 0)
		{
			System.out.println("Phương trình vô nghiệm");
		} else if (delta == 0)
		{
			System.out.println("Phương trình có nghiệm kép x = " + -b/(2*a));
		} else
		{
			System.out.println("Phương trình có nghiệm x1 = "
					+ Math.round((-b - Math.sqrt(delta)) / (2*a)));
			System.out.println("Phương trình có nghiệm x2 = "
					+ Math.round((-b + Math.sqrt(delta)) / (2*a)));
		}
		sc.close();
	}
}