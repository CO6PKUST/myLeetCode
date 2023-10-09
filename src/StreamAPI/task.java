package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Comparator;

public class task {
    public static void main(String[] args) {
        final int LENGTH = 10;
        Solution1 solution1 = new Solution1();

        System.out.print(solution1.DeterminingTheNumberOfEvenNumbersInList
                (solution1.createRandomListInteger(LENGTH)));
        System.out.println(" четных элемента");
        System.out.println("---------");


        final String searchStartElement = "A";
        Solution2 solution2 = new Solution2();
        ArrayList<String> nameEmployee= new ArrayList<>();
        nameEmployee.add("Egor");
        nameEmployee.add("Anna");
        nameEmployee.add("Fred");
        nameEmployee.add("Igor");
        nameEmployee.add("Anastasia");

        System.out.println("Список сотрудников: " + nameEmployee);
        System.out.print("Сотрудники, имена которых, начинаются на " + searchStartElement + ": ");
        System.out.println
                (solution2.searchInString(nameEmployee, searchStartElement));
        System.out.println("---------");


        Solution3 solution3 = new Solution3();
        System.out.println("список сотрудников отсортирован:");
        System.out.println
                (solution3.sortString(nameEmployee));
    }
}

class Solution1{

    //Как мне стоило бы правильно назвать методы?

    ArrayList<Integer> createRandomListInteger(int length) {
    Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<length-1; i++){
            list.add(rnd.nextInt(length));
        }
        System.out.println("список элементов: " + list);
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

class Solution2{
    List<String> searchInString (List<String> list, String searchStartElement){
        list = list.stream()
                .filter(e->e.startsWith(searchStartElement))
                .collect(Collectors.toList());
        return list;
    }
}
class Solution3{
    List<String> sortString (List<String> list){
        list = list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return list;
    }
}
