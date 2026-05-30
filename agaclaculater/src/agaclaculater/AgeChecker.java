package agaclaculater;

import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("Adult");
		}else {
			System.out.println("Minor");
		}
		scanner.close();
	}

}
