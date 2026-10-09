package machinePackeges.derivacao;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import machinePackeges.service.StockService;

public class SaleMachine implements CommandLineRunner {

	@Autowired
	private StockService stockService;

	public static void main(String[] args) {
		SpringApplication.run(SaleMachine.class, args);
	}

	@Override
	public void run(String... args) {

		Scanner scan = new Scanner(System.in);
		int slot = 0;
		while (true) {

			System.out.println("=== SALE MACHINE ===");
			System.out.println("");
			System.out.println("CHOOSE A PRODUCT");
			System.out.println("");
			System.out.println("1 - Coca-Cola");
			System.out.println("2 - Guaraná");
			System.out.println("3 - Água");
			System.out.println("4 - Suco");

			int option = scan.nextInt();

			switch (option) {
			case 1:
				System.out.println("You chose Coca-Cola");
				slot = 1;
				break;

			case 2:
				System.out.println("You chose Guaraná");
				slot = 2;
				break;

			default:

				System.out.println("Invalid option");
				continue;

			}

			System.out.println("1 - CONFIRM");
			System.out.println("2 - CANCEL");

			int response = scan.nextInt();

			if (response == 1) {

				System.out.println(" Product available!");
				System.out.println("");
				System.out.println(" Purchase confirmed ! ");
				System.out.println("");
				System.out.println(" Dispensing product !");
				System.out.println("");
				System.out.println(" Thanks for your purchase  ");
				System.out.println("");
				System.out.println("");
			}

			if (response == 2) {
				System.out.println("");
				System.out.println("###################");
				System.out.println(" Purchase canceled ");
				System.out.println(" Try again");
				System.out.println("###################");
				System.out.println("");
			}
		}
	}

}
