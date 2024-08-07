package HashMaps;

import java.util.HashMap;
import java.util.Map;

// Q1. First non-repeated char in a string

public class ques {
    public static void main(String[] args) {
        Map<Character, Integer> freqMap = new HashMap<>();
        String str = "Programming";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }
        //        System.out.println(freqMap);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqMap.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }


        //System.out.println(freqMap);
    }
}
