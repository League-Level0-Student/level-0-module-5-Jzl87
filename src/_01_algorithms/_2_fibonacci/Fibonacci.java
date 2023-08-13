package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 0; i < 400; i += 1) {
		int sum = num1 + num2;
		num1 = num2;
		num2 = sum;
		
		System.out.println(sum);
		}
	}
}
