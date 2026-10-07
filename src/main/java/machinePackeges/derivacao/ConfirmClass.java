package machinePackeges.derivacao;

import java.util.Scanner;

public class ConfirmClass {

	// public static void main(String[] args) {

	public static boolean confirmPurchase() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Confirm purchase ?");
		System.out.println("1 - CONFIRM");
		System.out.println("2 - CANCEL");

		int response = scan.nextInt();
		return response == 1;

	}

}
