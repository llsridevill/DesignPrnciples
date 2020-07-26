package calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator c = new Calculator();
		double input1=sc.nextDouble();
		double input2=sc.nextDouble();
		System.out.println("Addition of given numbers:"+c.add(input1,input2));
		System.out.println("Subtraction of given numbers:"+c.sub(input1,input2));
		System.out.println("Multiplication of given numbers:"+c.mul(input1,input2));
		System.out.println("Division of given numbers:"+c.div(input1,input2));
	}

}
