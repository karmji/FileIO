
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class FileIO {
	public static void main(String[] args) throws IOException
    {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter first file: ");
		String firstfile = reader.next();
		Scanner reader2 = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter second file: ");
		String newfile = reader2.next();
 
		PrintWriter out = null;
        try {
            out = new PrintWriter
                    (new File(newfile));
        } catch (FileNotFoundException e1) {
            System.out.println("Error opening the file " + firstfile);
            System.exit(0);
        }
        Scanner input = null;
        try {
            input = new Scanner
                    (new File(firstfile));
        } catch (FileNotFoundException e1) {
            System.out.println("Error opening the file " + firstfile);
            System.exit(0);
        }
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            String[] arr = line.split(" ");
            for(int i = 1; i < arr.length; i++)
                out.write(arr[i]+" ");
            out.println();
        }
        out.close();
        input.close();
    }
}