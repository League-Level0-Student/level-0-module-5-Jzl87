package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(80);
		String shape = JOptionPane.showInputDialog("what shape would you like?");
		String color = JOptionPane.showInputDialog("what color would you like your shape in?");
		if (shape.equals("square")) {
			square(color);
		} else if (shape.equals("triangle")) {
			triangle(color);
		}
	}
	
	static void square(String color) {
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		} else if (color.equals("green")) {
			rob.setPenColor(0,255,0);
		} else if (color.equals("blue")) {
			rob.setPenColor(0,0,255);
		} else {
			rob.setPenColor(0,0,0);
		}
		rob.setX(400);
		rob.setY(300);
		for (int i = 0; i < 4; i +=1) {
		rob.move(100);
		rob.turn(90);
		}
	}
	static void triangle(String color) {
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		} else if (color.equals("green")) {
			rob.setPenColor(0,255,0);
		} else if (color.equals("blue")) {
			rob.setPenColor(0,0,255);
		} else {
			rob.setPenColor(0,0,0);
		}
		rob.setX(400);
		rob.setY(300);
		for (int i = 0; i < 3; i +=1) {
		rob.move(100);
		rob.turn(120);
		}
	}
}
 
