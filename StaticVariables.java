import java.io.*;

class StaticVariables {

public static String Name = "Pritam Samui";		 //Declared static variable

	public static void main (String[] args) {
		
	//Name variable can be accessed withod object creation
	//Displaying O/P
	//taticVariables.Name --> using the static variable
		System.out.println("My Name is : "+StaticVariables.Name);
	}
}
