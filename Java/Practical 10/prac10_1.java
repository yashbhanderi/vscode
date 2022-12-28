import java.io.*;

public class prac10_1 {
	public static void main(String[] args) throws IOException {
		FileReader freader = new FileReader("Data.txt");
		BufferedReader br = new BufferedReader(freader);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		freader.close();
	}
}
