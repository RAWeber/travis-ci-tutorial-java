package io.github.joaomlneto.travis_ci_tutorial_java;

public class Driver {

	public static void main(String[] argv){
		
		SimpleCalculator calculator = new SimpleCalculator();
		
		int number = 73;
		number = calculator.mul(number, 3);
		number = calculator.mul(number, 7);
		number = calculator.mul(number, 13);
		number = calculator.mul(number, 37);
		System.out.println(number);
	}
}
