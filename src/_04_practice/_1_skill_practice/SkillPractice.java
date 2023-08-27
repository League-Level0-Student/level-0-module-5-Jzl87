package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		
	
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Tell them how many cents they have (hint multiply by 10)
		int cents = Integer.parseInt(dimes);
		// Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog("How tall are you? (Inches)");
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		int inches = Integer.parseInt(height);
		if (inches < 36) {
			JOptionPane.showMessageDialog(null, "Eat your wheaties");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 0; i <= 30; i += 3) {
			System.out.println(i);
		}
	}

	void skill3() {
		int random = new Random().nextInt(20);
		System.out.println(random);
		int random2 = new Random().nextInt(10);
		System.out.println(random2);
		
		JOptionPane.showMessageDialog(null, random - random2);

		// Get a random number that is less than 20 and print it to the console
		// Get another random number that is less than 10 and print it to the console
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction

	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		// If they answered "San Diego", tell them they live in America's Finest City
		// Otherwise, tell them to move to San Diego
		String city = JOptionPane.showInputDialog("where do you live");
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in americas finest city!");
		} else {
			JOptionPane.showMessageDialog(null, "You should move to san diego!");
		}
		
		int cars = 2;
		if (cars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		} else if (cars == 1) {
			JOptionPane.showMessageDialog(null, "Make: Ford Model: Explorer");
		} else if (cars > 1) {
			JOptionPane.showMessageDialog(null, cars*4);
		}
		
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		// If there is 1 car, use a pop-up to display the make/model of the car
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		String school = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null,  "Is " + school + " a good school?");
	}
}
