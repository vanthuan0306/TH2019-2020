package Tuan1Lab1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		double a, b, c, delta;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = scanner.nextDouble();
		System.out.println("Nhập b: ");
		b = scanner.nextDouble();
		System.out.println("Nhập c: ");
		c = scanner.nextDouble();
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Căn bậc hai của delta là" + Math.sqrt(delta));
	}

}
