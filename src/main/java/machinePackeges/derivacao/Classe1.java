package machinePackeges.derivacao;

import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean loopingMenu = true;

		while (true) {
			System.out.println("=== SALE MACHINE ===");
			System.out.println("  === WELCOME ===");
			System.out.println("");
			System.out.println("CHOOSE A PRODUCT");
			System.out.println("");
			System.out.println("1 - Coca-Cola");
			System.out.println("2 - Guaraná");
			System.out.println("3 - Água");
			System.out.println("4 - Suco");
			System.out.println("5 - Chocolate");
			System.out.println("6 - Salgadinho");
			System.out.println("7 - Biscoito");
			System.out.println("8 - Café");
			System.out.println("9 - Energético");
			System.out.println("10 - Balinha");
		

			int option = scan.nextInt();

			switch (option) {
			case 1:
				System.out.println("You chose Coca-Cola");
				break;

			case 2:
				System.out.println("You chose Guaraná");
				break;

			default:

				System.out.println("Invalid option");
				continue;
			// return;

			}

			if (ConfirmClass.confirmPurchase()) {
				System.out.println("DISPENSING PRODUCT");
				System.out.println("");
				System.out.println("THANKS FOR YOU PURCHASE");
				System.out.println("");
				System.out.println(": )");
				loopingMenu = false;

			} else {
				System.out.println("PURCHASE CANCELED");
			}
		}
	}
}
