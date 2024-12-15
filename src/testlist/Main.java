package testlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private int countOccurance(List<String> testList, String testStr) {
        int counter = 0;
        for (String str : testList) {
            if (str.equals(testStr)) {
                counter++;
            }
        }
        return counter;
    }

    private List toList(Integer[] inputArray) {
        List<Integer> outputList = new ArrayList<>();
        for (Integer i : inputArray) {
            outputList.add(i);
        }
        return outputList;
    }

    private List findUnique(List<Integer> arbitraryArray) {
        List<Integer> notArbitraryArray = new ArrayList<>();
        for (Integer etem : arbitraryArray) {
            if (!notArbitraryArray.contains(etem)) {
                notArbitraryArray.add(etem);
            }
        }
        return notArbitraryArray;
    }

    private void calcOccurance(List<String> calcOccuranceList) {
        List<String> newArray = new ArrayList<>();
        for (String string : calcOccuranceList) {
            if (!newArray.contains(string)) {
                newArray.add(string);
            }
        }
        for (String str : newArray) {
            int counter = 0;
            for (String s : calcOccuranceList) {
                if (str.equals(s)) {
                    counter++;
                }
            }
            System.out.println(str + ": " + counter);
        }
    }

    private List<NameOccurence> findOccurance(List<String> calcOccuranceList) {
        List<String> newArray = new ArrayList<>();
        List<NameOccurence> result = new ArrayList<>();
        for (String string : calcOccuranceList) {
            if (!newArray.contains(string)) {
                newArray.add(string);
            }
        }
        for (String str : newArray) {
            int counter = 0;
            for (String s : calcOccuranceList) {
                if (str.equals(s)) {
                    counter++;
                }
            }
            result.add(new NameOccurence(str, counter));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> testList = List.of(
                "potato", "meat", "apple", "meat",
                "pear", "lemon", "potato",
                "pear", "pear", "lemon"
        );
        String testStr = "pear";
        Main main = new Main();
        System.out.println(main.countOccurance(testList, testStr));

        System.out.println();

        Integer[] inputArray = new Integer[]{1, 2, 3};
        System.out.println("Arrays " + Arrays.toString(inputArray));
        System.out.println("List " + main.toList(inputArray));

        System.out.println();

        List<Integer> arbitraryArray = List.of(1, 2, 1, 7, 5, 2, 67, 24, 67);

        System.out.println(arbitraryArray);
        System.out.println(main.findUnique(arbitraryArray));

        System.out.println();

        List<String> calcOccuranceList = List.of(
                "potato", "meat", "apple", "meat",
                "pear", "lemon", "potato",
                "pear", "pear", "lemon"
        );

        main.calcOccurance(calcOccuranceList);

        System.out.println();

        List<NameOccurence> occuranceList = main.findOccurance(calcOccuranceList);
        System.out.println("[");
        for (NameOccurence occurence: occuranceList){
            System.out.println(occurence);
        }
        System.out.println("]");
    }
}
