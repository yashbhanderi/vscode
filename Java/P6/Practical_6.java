// class first implements place {
//     public void search() {
//         System.out.println("This is abstract method...");
//         System.out.println("Block no:- " + b_no);
//     }
// }

// interface place {
//     int b_no = 7;

//     void search();
// }

// public class P1 {
//     public static void main(String[] args) {
//         first f = new first();
//         f.search();
//     }
// }

// class second implements branch {
//     public void search() {
//         System.out.println("This is abstract method..");
//         System.out.println("State Bank of India");
//         System.out.println("IFSC code:- " + ifsc);
//     }
// }

// interface branch {
//     String ifsc = "SBIN00SURAT";

//     void search();
// }

// class pra6_2 {
//     public static void main(String[] args) {
//         second s = new second();
//         s.search();
//     }
// }

import java.util.*;

class third implements result {
    public void getMarks() {
        float s1, s2, s3, avg;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextFloat();
        s2 = sc.nextFloat();
        s3 = sc.nextFloat();
        avg = (s1 + s2 + s3) / 3;
        System.out.println("Average Marks :- " + avg);
        System.out.println("Percentage :- " + percentage + "%");
        sc.close();
    }
}

interface result {
    float percentage = 93.4f;

    void getMarks();
}

public class Practical_6 {
    public static void main(String[] args) {
        third t = new third();
        t.getMarks();
    }
}