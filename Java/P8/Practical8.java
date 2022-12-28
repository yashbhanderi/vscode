// //Built in packages
// import java.util.*;
// //user defined packages
// import Technical_Courses.*;
// import vocationl_courses.*;

// class P8_1 {
//     public static void main(String[] args) {
//         int num;
//         Scanner s1 = new Scanner(System.in);
//         System.out.println("For Technical courses information enter 1\nFor vocational Courses information enter 2.");
//         num = s1.nextInt();
//         s1.close();

//         switch (num) {
//         case 1:
//             Mech m1 = new Mech();
//             m1.mechInfo();
//             IT i1 = new IT();
//             i1.itInfo();
//             Comp c1 = new Comp();
//             c1.compInfo();
//             Civil v1 = new Civil();
//             v1.civilInfo();
//             break;
//         case 2:
//             BA b1 = new BA();
//             b1.baInfo();
//             Bsc sc1 = new Bsc();
//             sc1.bscInfo();
//             Bcom co1 = new Bcom();
//             co1.bcomInfo();
//             break;

//         default:
//             System.out.println("You choice is not avialble in package.");
//         }
//     }
// }
// class Practical8_2 {
//     public static void main(String[] args) {
//         Student s1 = new Student(190280116007L, "Yash Bhanderi", 20);
//         Student s2 = new Student(190280116008L, "Rahul Sharma", 21);
//         int temp = s1.compareTo(s2);

//         switch (temp) {
//         case 0:
//             System.out.println("Both students ages are equal.");
//             break;
//         case 1:
//             System.out.println(s1.name + " is older than " + s2.name + ".");
//             break;
//         case -1:
//             System.out.println(s1.name + " is younger than " + s2.name + ".");
//             break;
//         default:
//             System.out.println("Something Gone wrong.");
//         }
//     }
// }

// class Student implements Comparable<Student> {
//     long rollno;
//     String name;
//     int age;

//     Student(long rollno, String name, int age) {
//         this.rollno = rollno;
//         this.name = name;
//         this.age = age;
//     }

//     public int compareTo(Student st) {
//         if (age == st.age)
//             return 0;
//         else if (age > st.age)
//             return 1;
//         else
//             return -1;
//     }
// }
class Students implements Cloneable {
    int i;
    String s;

    public Students(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Practical8 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Students a = new Students(37, "Class Student");
        Students b = (Students) a.clone();
        // printing values of student
        System.out.println("This is From Student");
        System.out.println(a.i);
        System.out.println(a.s);
        System.out.println();
        b.s = "clone of a";
        // printing values of clone
        System.out.println("This is From Clone");
        System.out.println(b.i);
        System.out.println(b.s);
    }
}
