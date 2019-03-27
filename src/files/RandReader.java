package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RandReader {

	public static void main(String args[]) {
		try {

			BufferedReader in = new BufferedReader(new FileReader("romeo.txt"));
			
			String line = in.readLine();

			while(line != null) {
				System.out.println(line);
				line = in.readLine();	
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error! File not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading from file!");
			e.printStackTrace();
		}

	}
}
