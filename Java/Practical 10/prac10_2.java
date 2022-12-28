import java.io.*;
import java.util.Scanner;

public class pra10_3 {
	public static void main(String args[]) throws IOException {

		System.out.println("Hii Dhairya!");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		System.out.flush();
		String filename = scanner.nextLine();
		File file = new File(filename);
		scanner.close();
		FileReader fread = new FileReader(file);
		BufferedReader bread = new BufferedReader(fread);
		String s;
		while ((s = bread.readLine()) != null) {
			System.out.println(s);
		}
		fread.close();

	}
}
