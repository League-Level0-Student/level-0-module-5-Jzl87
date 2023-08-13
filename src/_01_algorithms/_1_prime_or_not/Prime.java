package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {

	public static void main(String[] args) {
		String numberString = JOptionPane.showInputDialog(" GIMME A NUMBER!");
		int num = Integer.parseInt(numberString);
		boolean prime = true;
		for (int i = num - 1; i > 1; i -= 1) {
			if (num % i == 0) {
				prime = false;
			}
		}
		if (prime == true) {
			JOptionPane.showMessageDialog(null, "Your Number IS Prime");
		} else {
			JOptionPane.showMessageDialog(null, "Your Number is Not Prime");
		}
	}
}
