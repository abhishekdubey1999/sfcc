package com.sapient.trg.pl;

public class App {

	/* Multi-line comment
	 * 
	 * The following methods explain about instance and 
	 * static methods 
	 */
	//Single-line comment
	//instance method, invoking instance method: objectName.instanceMethod()
	public int square(int n){
		return n*n;
	}

	//static method, invoking static method: ClassName.staticMethod()
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String []args) {
		//returns cube of a number
		System.out.println("Cube of 5 is "+ App.cube(5));
		App app= new App();
		System.out.println("Square of  5 is " + app.square(5));

	}

}


