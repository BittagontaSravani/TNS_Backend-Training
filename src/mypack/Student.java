// Demo for types of variables using Employee class
package mypack;
//Demo for types of variables
public class Student {
	//instance variable
	int rollno;
	String name;
	String branch;
	//static variable
	static String collegeName="AVN";
	//method
	void print() {
		//local variable
		String msg="These are TNSIF Students";
		System.out.println(msg);
		System.out.println("The Student details are" + "\nName: " + name + "\nRoll Number: " + rollno + "\nBranch: " + branch + "\nCollege: " + collegeName);
	}
}
