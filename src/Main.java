import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        int nums[] = {3, 2, 2, 3};
        LinkedList<Integer> list = new LinkedList<>();
        for(int i : nums) {
            if (i != 3)
                list.add(i);
        }
        System.out.println(list);
        }
    }
