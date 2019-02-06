import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class AnotherFile {
	public static void main(String[] args){
		File file = new File("temp.txt");
		
		try{
			PrintWriter output = new PrintWriter(file);
			
			output.print("Elias\t");
			output.print("Haile\t");
			output.print(29 + "\t");
			
			output.close();
		}
		
		catch(Exception e){
			System.out.println("Writting to file error!");
		}
		
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
				String firstName = input.next();
				String middleName = input.next();
				int age = input.nextInt();
				
				System.out.println("First name: " + firstName + ", middle name: " + middleName + 
						", Age: " + age);
			}
			
			input.close();
		}
		
		catch(Exception e){
			System.out.println("Reading from file error!");
		}
		
		String lineSeparator = System.getProperty("line.separator");
		System.out.println(lineSeparator + lineSeparator + "jfkajdskfdjsfadkf");
	}
}
