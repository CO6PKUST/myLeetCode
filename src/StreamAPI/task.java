package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task {
    public static void main(String[] args) {
        final int LENGTH = 10;
        Solution solution = new Solution();
        System.out.println
                (solution.DeterminingTheNumberOfEvenNumbersInList
                (solution.createRandomListInteger(LENGTH)));


    }
}

class Solution{

    //Как мне стоило бы правильно назвать методы?

    ArrayList<Integer> createRandomListInteger(int length) {
    Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<length-1; i++){
            list.add(rnd.nextInt(length));
        }
        System.out.println("список элементов = " + list);
        return list;
    }

    Long DeterminingTheNumberOfEvenNumbersInList (List<Integer> list){
        long numbers;
        numbers = list.stream()
                .filter(e -> e % 2 == 0)
                .count();
        return numbers;
    }


}
