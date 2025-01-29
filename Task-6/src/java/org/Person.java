package java.org;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	//parameterized constructor 
	Person(String prname, int prage)
	{
		this.name=prname;
		this.age=prage;
	}	
	//getter method
	public String getName() {
		return name;
	}
	//getter method
	public int getAge() {
		return age;
	}
	//display() method is used for displaying
	private void display() {
		System.out.println("The name of the person is "+name+" and age is "+age);
	}
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		//name of the person is taken as input from user
		System.out.print("Enter the name of person : ");
		String prname = scanner.nextLine();
		//name of the age is taken as input from user
		System.out.print("\nEnter the age of person : ");
		int prage = scanner.nextInt();
		//object created for parameterized constructor
		Person person = new Person(prname,prage);
		//display method is called for display
		person.display();
	}
}