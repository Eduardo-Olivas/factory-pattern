package factory.pattern;

import java.util.Scanner;

import factory.pattern.user.User;

public class Principal {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter your choice of user");
		System.out.println("1-Developer, 2- ERS, 3- FunctionalAnalyst, 4- ProjectLeader, 5-QA");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		System.out.println("\n Enter your NAME");
		String name = scanner.nextLine();

		User user = null;
			user = UserFactory.getInstance(type);
			user.setTypeUser(type);
			user.setNameUser(name);
			user.prepare();
			
		System.out.println("\nThank You ");

	}

}
