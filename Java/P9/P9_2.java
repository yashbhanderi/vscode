// package P9;

// import java.util.*;

// class pra9_3 {
//     public static void main(String[] args) {
//         searchStudent();
//     }

//     static void searchStudent() {
//         ArrayList<String> Student_name = new ArrayList<String>();
//         Student_name.add("Yash");
//         Student_name.add("Rahul");
//         Student_name.add("Rohan");
//         ArrayList<String> Yash = new ArrayList<String>();
//         Yash.add("Name : Yash");
//         Yash.add("Enrollment : 190280116007");
//         Yash.add("Branch : IT");
//         ArrayList<String> Rahul = new ArrayList<String>();
//         Rahul.add("Name : Rahul");
//         Rahul.add("Enrollment : 190280116008");
//         Rahul.add("Branch : IT");
//         ArrayList<String> Rohan = new ArrayList<String>();
//         Rohan.add("Name : Rohan");
//         Rohan.add("Enrollment : 190280116009");
//         Rohan.add("Branch : IT");
//         String name;
//         Scanner student = new Scanner(System.in);
//         System.out.println("Enter name of student");
//         name = student.next();
//         for (int i = 0; i < Student_name.size(); i++) {
//             if (name.equals(Student_name.get(i))) {
//                 if (name.equals("Yash")) {
//                     for (int j = 0; j < Yash.size(); j++) {
//                         System.out.println(Yash.get(j));
//                     }
//                 } else if (name.equals("Rahul")) {
//                     for (int k = 0; k < Rahul.size(); k++) {
//                         System.out.println(Rahul.get(k));
//                     }
//                 } else if (name.equals("Rohan")) {
//                     for (int l = 0; l < Rohan.size(); l++) {
//                         System.out.println(Rohan.get(l));
//                     }
//                 }
//                 break;
//             } else {
//                 throw new ArithmeticException("Name not exist");
//             }
//         }
//     }
// }
