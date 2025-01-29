package java.org;

import java.util.Scanner;

public class Class {
	float radius,pi;
	//default constructor
	 Class() {
		System.out.println("Circumference of the circle");		
	}
	//parameterized constructor
	Class(float radius,float pi)
	{
		this.radius=radius;
		this.pi=pi;
		return;
	}
	//circumference method for calculation and printing the calculation
	public void circumference() {
		
		float circle=2*pi*radius;
		System.out.println("Circumference of the circle is "+circle);
	}
	public static void main(String[] args) {

		//object created for default class
		Class cls1 = new Class();
		float pi=3.14f;
		Scanner s = new Scanner(System.in);
		//taking the radius as input from user
		System.out.print("\nEnter the radius of the circle : ");
		float r = s.nextFloat();
		//object created for parameterized constructor
		Class cls2 = new Class(r, pi);	
		//circumference method is called
		cls2.circumference();
	}

}