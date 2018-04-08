/*
This game asks the user for various words or parts of speech and then inserts the words the player chose into a template, usually resulting in a funny story. 
 */

import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String adjective1;
		String adjective2;
		String noun1;
		String noun2;
		String place1;
		String state1;
		String pastTenseState1;
		String pastTenseVerb1;

		

		System.out.println("Enter an adjective:");
		adjective1 = scan.nextLine();
		System.out.println("Enter an adjective:");
		adjective2 = scan.nextLine();
		System.out.println("Enter a noun:");
		noun1 = scan.nextLine();
		System.out.println("Enter a noun:");
		noun2 = scan.nextLine();
		System.out.println("Enter a place:");
		place1 = scan.nextLine();
		System.out.println("Enter a past tense emotional state:");
		pastTenseState1 = scan.nextLine();
		System.out.println("Enter an emotional state:");
		state1 = scan.nextLine();
		System.out.println("Enter a past tense verb:");
		pastTenseVerb1 = scan.nextLine();
		
		
		scan.close();
				
		System.out.println("Once I got really " + adjective1 + " in a " + place1 + " and my " + adjective2 + " " + noun1);
		System.out.println(" had to pick me up so I was trying to act " + pastTenseState1 + " by keeping up a conversation so I " + pastTenseVerb1);
		System.out.println(" her to see if she's a " + noun2 + " and she looked at me with " + state1 + " in her eyes and said, 'I wish I was'");		

	}
}
