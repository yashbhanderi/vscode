import java.io.*;
import java.lang.*;
import java.util.ArrayList;

class Student {
    int enroll;
    String name;

    public Student(int enroll, String name) {
        this.name = name;
        this.enroll = enroll;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        ArrayList<Student> al = new ArrayList<>();

        while (true) {
            System.out.println("\n1. To Add a Student");
            System.out.println("2. To Update Student Details");
            System.out.println("3. To Search Student");
            System.out.println("4. To Delete a Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    setData(al);
                    break;
                case 2:
                    System.out.println("Enter the enroll no. of the student to be updated ");
                    int no = Integer.parseInt(br.readLine());
                    update(al, no);
                    break;
                case 3:
                    System.out.println("Enter the enroll no. of the student to be Searched ");
                    int noo = Integer.parseInt(br.readLine());
                    search(al, noo);
                    break;
                case 4:
                    System.out.println("Enter the enroll no. of the student to be deleted ");
                    int nooo = Integer.parseInt(br.readLine());
                    Delete(al, nooo);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("enter a valid choice");
                    break;
            }
        }
    }

    static void setData(ArrayList<Student> al) throws IOException {
        System.out.println("Enter the Enrollment no. of the student : ");
        int mrp = Integer.parseInt(br.readLine());
        System.out.println("Enter the name of the student : ");
        String name = br.readLine();
        al.add(new Student(mrp, name));
    }

    static void update(ArrayList<Student> al, int no) throws IOException {
        if (!search(al, no)) {
            System.out.println("Cannot update student , student Enroll no. invalid ");
        } else {
            int ind = -1;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).enroll == no) {
                    ind = i;
                }
            }
            System.out.println("Enter new name:");
            String n = br.readLine();
            al.get(ind).name = n;
            System.out.println("Enter new enrollement no.:");
            // int num = br.read();
            int mrp = Integer.parseInt(br.readLine());
            al.get(ind).enroll = mrp;
            System.out.println("Name and enroll no. updated.1");
        }
    }

    static boolean search(ArrayList<Student> al, int no) {
        boolean found = false;
        int ind = -1;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).enroll == no) {
                found = true;
                ind = i;
                break;
            }
        }
        if (found) {
            System.out.println("Student Details : ");
            System.out.println("Name: " + al.get(ind).name + "\nEnroll no.: " + al.get(ind).enroll);
            return true;
        } else {
            return false;
        }
    }

    static void Delete(ArrayList<Student> al, int no) {
        if (!search(al, no)) {
            System.out.println("Student not found , cannot be deleted ");
        } else {
            int ind = -1;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).enroll == no) {
                    ind = i;
                    break;
                }
            }
            al.remove(ind);
            System.out.println("Student Removed");
        }
    }
}