public class practical {
	public static void main(String[] args) {
		File myFile = new File("Data.txt");
		if (myFile.exists()) {
			System.out.println(myFile.getName() + " exists");
			System.out.println("The file is " + myFile.length() + " bytes long");
			if (myFile.canRead())
				System.out.println(" ok to read");
			else
				System.out.println(" not ok to read");
			if (!myFile.canWrite())
				System.out.println(" ok to write");
			else
				System.out.println(" not ok to write");
			System.out.println("path: " +myFile.getAbsolutePath());
			System.out.println("File Name: "+ myFile.getName());
			System.out.println("File Size: "+ myFile.length() + " bytes");
		} 
		else
			System.out.println("File does not exist");
	}
}
