package Tuan1Lab2;

 import java.util.Scanner;

 public class Ex1 {

 	public static void main(String[] args) {
		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hằng số b: ");
		b = scanner.nextDouble();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			System.out.println("Nghiệm của phương trình là: " + -b / a);
		}
	}