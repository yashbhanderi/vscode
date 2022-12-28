import java.io.*;

public class prac10_4 {
    public static void main(String args[]) throws IOException {
        Object o1 = new Object("Hey, I am Yash Bhanderi.\n I am 2nd year IT Engineering Student.\n");
        File file = new File("Hey.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(o1.s);
        writer.flush();
        writer.close();

        FileReader fr = new FileReader(file);
        char[] a = new char[100];
        fr.read(a); // reads the content to the array

        for (char c : a)
            System.out.print(c); // prints the characters one by one
        fr.close();
    }

}

class Object {
    String s;

    public Object() {
        s = "NULL";
    }

    Object(String s1) {
        s = s1;
    }
}