package control_flow;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		System.out.print("Please type only the valid characters (numbers, upper and lower case letters) above then 'enter' when responding to prompt.\n\nEnter your name: ");
		try (Scanner scanner1 = new Scanner(System.in)) {
			String name = scanner1.next();
			System.out.println("\nHello " + name + "\nWould you like to participate in a survey?");

			Function();
		}
		
	}

	private static void Function() {
		
		Scanner scanner2 = new Scanner(System.in);
			String approvePlay = scanner2.next();
			
			switch (approvePlay) {
			case "yes":
			 	Survey surveys = new Survey();
				break;
			case "Yes":
			 	Survey surveys1 = new Survey();
				break;
			case "y":
			 	Survey surveys2 = new Survey();
				break;
			case "Y":
			 	Survey surveys3 = new Survey();
				break;
			case "YES":
			 	Survey surveys4 = new Survey();
				break;
			case "no":
				System.out.println("Please return later to complete the survey.");
				break;
			case "No":
				System.out.println("Please return later to complete the survey.");
				break;
			case "n":
				System.out.println("Please return later to complete the survey.");
				break;
			case "N":
				System.out.println("Please return later to complete the survey.");
				break;
			case "NO":
				System.out.println("Please return later to complete the survey.");
				break;
			default:
				System.out.println("Please enter yes or no.");
				Function();
				
			}
			scanner2.close();

		}


	}


