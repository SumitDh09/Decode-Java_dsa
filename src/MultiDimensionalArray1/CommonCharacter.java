package MultiDimensionalArray1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CommonCharacter{

    public static void main(String[] args) {
        String[] words = new String[]{"flower", "flow", "flight"};
        List<Character> commonChars = commonChars(words);
        System.out.println("Common characters: " + commonChars);
    }

    public static List<Character> commonChars(String[] words) {
        Map<Character, Integer> charFreq = new HashMap();
        char[] var2 = words[0].toCharArray();
        int var3 = var2.length;

        int freq;
        for(int var4 = 0; var4 < var3; ++var4) {
            freq = var2[var4];
            charFreq.put(Character.valueOf((char)freq), charFreq.getOrDefault(Character.valueOf((char)freq), 0) + 1);
        }

        int j;
        for(int i = 1; i < words.length; ++i) {
            Map<Character, Integer> tempFreq = new HashMap();
            char[] var12 = words[i].toCharArray();
            freq = var12.length;

            for(j = 0; j < freq; ++j) {
                char c = var12[j];
                tempFreq.put(c, tempFreq.getOrDefault(c, 0) + 1);
            }

            Iterator var13 = charFreq.keySet().iterator();

            while(var13.hasNext()) {
                char c = (Character)var13.next();
                charFreq.put(c, Math.min(charFreq.get(c), tempFreq.getOrDefault(c, 0)));
            }
        }

        List<Character> result = new ArrayList();
        Iterator var11 = charFreq.keySet().iterator();

        while(var11.hasNext()) {
            char c = (Character)var11.next();
            freq = charFreq.get(c);

            for(j = 0; j < freq; ++j) {
                result.add(c);
            }
        }

        return result;
    }
}

