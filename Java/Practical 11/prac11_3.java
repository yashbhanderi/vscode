import java.io.BufferedReader;
import java.io.InputStreamReader;

class Number extends Thread {
    int enroll;

    public static void main(String args[]) throws Exception {
        Number a1 = new Number();
        Number a2 = new Number();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a1.enroll = Integer.parseInt(br.readLine());
        a2.enroll = Integer.parseInt(br.readLine());
        if ((a1.enroll & 1) == 1) {
            System.out.println("a1 is odd");
        } else {
            System.out.println("a1 is even");
        }
        if ((a2.enroll & 1) == 1) {
            System.out.println("a2 is odd");
        } else {
            System.out.println("a2 is even");
        }
    }
}
