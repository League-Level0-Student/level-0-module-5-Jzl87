package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String animalSelection = JOptionPane.showInputDialog("what animal do you want?");

	public static void main(String[] awrgs) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		while (happinessLevel < 75) {
			int task = JOptionPane.showOptionDialog(null, "how do you want to make your " + animalSelection + " happy?", "Animal Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "walk", "feed", "comb" }, null);
			if(task == 0) {
				walk();
			}
			if(task == 1) {
				feed();
			}
			if(task == 2) {
				comb();
			}
			
			
		   
			// 6. Use user input to call the appropriate method created in step 5 below.
			
			// 7. If you determine the happiness level is large enough, tell the
			 
		}
		JOptionPane.showMessageDialog(null, "You love your pet!");
	}

	public static void walk() {
		JOptionPane.showMessageDialog(null, "You walked your " + animalSelection + " and it is very happy!");
		happinessLevel += 10;
	}

	public static void feed() {
		JOptionPane.showMessageDialog(null, "You fed your " + animalSelection + " and it is jubilant!");
		happinessLevel += 15;
	}

	public static void comb() {
		JOptionPane.showMessageDialog(null, "You comberd your " + animalSelection + " and it is upset with you!");
		happinessLevel -= 35;
	}
	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}