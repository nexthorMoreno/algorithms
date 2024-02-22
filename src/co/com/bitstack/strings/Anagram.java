package co.com.bitstack.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String text = "apocalypsis";
        String text2 = "lypsisapoca";
        char[] arrA = text.toCharArray();
        char[] arrB = text2.toCharArray();
        Map<String, Integer> mapFrequency = new HashMap<>();
        Map<String, Integer> mapFrequency2 = new HashMap<>();

        mapFrequency = createAnagram(arrA, mapFrequency);
        mapFrequency2 = createAnagram(arrB, mapFrequency2);

        if(mapFrequency.equals(mapFrequency2)) {
            System.out.println("Equals!");
        } else {
            System.out.println("Not equals!!");
        }

        System.out.println(mapFrequency);
        System.out.println(mapFrequency2);
    }

    private static Map<String, Integer> createAnagram(char[] arrA, Map<String, Integer> mapFrequery) {
        Map<String, Integer> anagramMap = new HashMap<>();
        for (int i = 0; i <= arrA.length-1; i++) {
            if (anagramMap.containsKey(String.valueOf(arrA[i]))) {
                Integer value = anagramMap.get(String.valueOf(arrA[i]));
                anagramMap.put(String.valueOf(arrA[i]), value += 1);
            } else {
                anagramMap.put(String.valueOf(arrA[i]), 1);
            }
        }
        return anagramMap;
    }

}
