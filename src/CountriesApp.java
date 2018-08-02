import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Amna Anjum 
public class CountriesApp {

	//method for printing list
	public static void printList(List<Countries> list) {
		int count = 1;
		for (Countries t : list) {
			System.out.println(count++ + ". " + t);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
		
		int input;
		
		
		System.out.println("Welcome to the Countries Maintanence Aplpication");
		System.out.println();
		System.out.println("Here are your options: ");
		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a Country");
		System.out.println("3 - Exit");
		
		System.out.println("Enter option number: ");
		input = scnr.nextInt();
		List<Countries> list = new ArrayList<Countries> ();
		do {
			if (input == 1) {
				list = CountriesFileUtil.readFile();
				printList(list);
			} else if (input == 2) {
				//appending (Adding)
				list.add(new Countries(Validator.getStringMatchingRegex(scnr, "Enter your country", "[a-zA-Z].*")));
				CountriesFileUtil.appendLine(list.get(list.size()-1));
				printList(list);
				
				
			} else {
				System.out.println("Goodbye.");
				break;
			}
			
			System.out.println("Enter option number: ");
			input = scnr.nextInt();
			
		}while(input != 3);
		System.out.println("GOODBYE.");
		
scnr.close();
	}

}
