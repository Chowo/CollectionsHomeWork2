import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums); //Task 01 test
        printEvenUniqueNumbers(nums); //Task 02 test
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "три",
                "четыре", "четыре", "пять", "пять", "шесть", "семь"));
        printUniqueStrings(strings); //Task 03 test
        List<String> strings2 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printNumberOfRepeats(strings); //Task 04 test
        printNumberOfRepeats(strings2);//Task 04 test
    }

    //Task 1
    public static void printOddNumbers(List<Integer> list) {
        List<Integer> tmpList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                tmpList.add(integer);
            }
        }
        System.out.println(tmpList);
    }

    //Task 2
    public static void printEvenUniqueNumbers(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                set.add(integer);
            }
        }
        System.out.println(set);
    }

    //Task 03
    public static void printUniqueStrings(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
    }

    //Task 04
    public static void printNumberOfRepeats(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : list) {
            if (map.containsKey(string)) {
                int tmp = map.get(string) + 1;
                map.put(string, tmp);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map.values());
    }


}
