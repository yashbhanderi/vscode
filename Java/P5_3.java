class Student {
    long en_no;
    String name;

    void setdata(long enroll_no, String stud_name) {
        en_no = enroll_no;
        name = stud_name;
    }

    void display() {
        System.out.println("Student's name " + name + ".");
        System.out.println("Student's Enrollment No. " + en_no + ".");
    }
}

class BE extends Student {
    void display1() {
        System.out.println("This is B.E. Student Information---");
    }
}

class ME extends Student {
    void display1() {
        System.out.println("This is M.E. Student Information---");
    }
}

class P5_3 {
    public static void main(String[] args) {
        System.out.println("Hello Yash!");
        System.out.println("<------Information of Student:----------------->");
        BE stu1 = new BE();
        stu1.display1();
        stu1.setdata(190280116007L, "Yash Bhanderi");
        stu1.display();
        System.out.println("<------Information of Student:----------------->");
        ME stu2 = new ME();
        stu2.display1();
        stu2.setdata(190280116007L, "Yash Bhanderi");
        stu2.display();
    }
}