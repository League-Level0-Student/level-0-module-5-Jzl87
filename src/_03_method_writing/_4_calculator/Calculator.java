package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);
		if(task == 0) {
			int total3 = divide(number1,number2);
			result(total3);
		}
		if(task == 1) {
			int total2 = multiply(number1,number2);
			result(total2);
		}
		if(task == 2) {
			int total1 = subtract(number1, number2);
			result(total1);
		}
		if(task ==3) {
			int total0  = add(number1,number2);
			result(total0);
		}

		// 3) Call the correct method depending on what option the user chooses
		
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 public static int add(int number1,int number2) {
		int total1 = number1 + number2;
		return(total1);
	 }
	 public static int subtract(int number1,int number2) {
		 int total2 = number1 - number2;
		 return(total2);
	 }
	 public static int multiply(int number1,int number2) {
		 int total3 = number1 * number2;
		 return(total3);
	 }
	 public static int divide(int number1,int number2) {
		 int total4 = number1 / number2;
		 return(total4);
	 }
	 public static void result(int total) {
		 JOptionPane.showMessageDialog(null, "Your answer is " + total);
	 }
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
