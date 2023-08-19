package _02_nested_loops._3_for_loop_gauntlet;

public class LoopPractice {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i += 1) {
			System.out.println(i);
		}
		for (int i = 100; i > -1; i -= 1) {
			System.out.println(i);
		}
		for (int i = 0; i < 101; i += 1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 101; i += 1) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 501; i += 1) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else if (i % 2 == 1) {
				System.out.println(i + " is odd");
			}
		}
		for (int i = 0; i < 778; i += 1) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 2007; i < 2024; i += 1) {

			System.out.println("in " + i + " i was " + (i-2007));
		}
		
	}
}
