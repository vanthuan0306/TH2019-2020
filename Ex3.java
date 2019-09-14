package Tuan1Lab2;

 import java.util.Scanner;

 public class Ex3 {

 	public static void main(String[] args) {
		double soDien;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		soDien = scanner.nextDouble();

 		if (soDien < 50) {
			System.out.println("Tiền điện của quý khách là: " + soDien * 1000);
		}
		else {
			System.out.println("Tiền điện của quý khách là: " + soDien * 1200);
		}
	}
}