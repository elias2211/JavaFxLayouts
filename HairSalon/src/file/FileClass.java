package file;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileClass {
	public static void main(String[] args) throws IOException{
		File file = new File("myFile2");
	/*	if (file.exists()){
			System.out.println("The file already exists");
		}  */
		
		PrintWriter output = new PrintWriter(file);
		
		output.print("Elias Feredegn ");
		output.println("30");
		output.print("Medu");
		output.println("26");
		
		output.print("Elias Feredegn ");
		output.println("30");
		output.print("Medu ");
		output.println("26");
		
		output.close();  
		
		Scanner keyboard = new Scanner(file);
		while(keyboard.hasNext()){
			String firstName = keyboard.next();
			String lastName = keyboard.next();
			String age = keyboard.next();
			System.out.println("First name: " + firstName + " Last name: " + lastName + " Age: " + age);
		}

		keyboard.close();
	}

}
