import java.util.ArrayList;

public class prac9_1 {
    public static void main(String[] args) {
        int capacity = 4;
        int arr[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };
        ArrayList<Integer> s = new ArrayList<>(capacity);
        int count = 0;
        int page_faults = 0;
        for (int i : arr) {
            if (!s.contains(i)) {
                if (s.size() == capacity) {
                    s.remove(0);
                    s.add(capacity - 1, i);
                } else
                    s.add(count, i);
                page_faults++;
                ++count;
            } else {
                s.remove((Object) i);
                s.add(s.size(), i);
            }
        }
        System.out.print("Page Faults : ");
        System.out.println(page_faults);
    }
}