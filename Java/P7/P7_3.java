package P7;

import java.util.*;

class P7_3 {
    public static void main(String[] args) {
        ArrayList<BE> ba = new ArrayList<BE>();
        BE be1 = new BE();
        be1.course();
        be1.details("Yash Bhanderi", 190280116007L, "Information Technology");
        ba.add(be1);

        Iterator<BE> itr = ba.iterator();
        while (itr.hasNext()) {
            BE be2 = (BE) itr.next();
            System.out.println("NAME :" + be2.name + "\nENROLLMENT NUMBER:" + be2.enno + "\nBRANCH:" + be2.branch);
        }

        ArrayList<ME> ma = new ArrayList<ME>();
        ME me1 = new ME();
        me1.course();
        me1.details("Yash Bhanderi", 190280113007L, "Computer Science");
        ma.add(me1);

        Iterator<ME> it = ma.iterator();
        while (it.hasNext()) {
            ME me2 = (ME) it.next();
            System.out.println("NAME :" + me2.name + "\nENROLLMENT NUMBER:" + me2.enno + "\nBRANCH:" + me2.branch);
        }
    }
}

class Student {
    String name;
    long enno;
    String branch;

    void details(String name, long enno, String branch) {
        this.name = name;
        this.enno = enno;
        this.branch = branch;
    }
}

class BE extends Student {
    void course() {
        System.out.println("\nBE STUDENT INFORMATION");
    }
}

class ME extends Student {
    void course() {
        System.out.println("\nME STUDENT INFORMATION");
    }
}
