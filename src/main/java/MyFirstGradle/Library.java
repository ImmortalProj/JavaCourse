/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyFirstGradle;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
			System.out.println("Please entr your name:");
			String name = sc.next();
			StringBuilder reverse = new StringBuilder(name);
			reverse.reverse();

			try {
				FileWriter myWriter = new FileWriter("Myname.txt");
				myWriter.write("Hello, " + reverse);
				myWriter.close();
				System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

			System.out.print("Welcome to home: " + reverse);
			System.out.print("\n");
			System.out.print("\n");
			
			while(true) {
				
			}
			
		sc.close();

	}
	
    public boolean someLibraryMethod() {
        return true;
    }
}
