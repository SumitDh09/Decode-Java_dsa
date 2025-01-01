package LeetcodeProblems;

import java.util.*;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {
        SearchSuggestionsSystem sss = new SearchSuggestionsSystem();
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> suggestions = sss.suggestedProducts(products, searchWord);
        for (List<String> suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        String prefix = "";

        for (char c : searchWord.toCharArray()) {
            prefix += c;
            int index = Arrays.binarySearch(products, prefix);
            if (index < 0) {
                index = -index - 1;
            }

            List<String> suggestions = new ArrayList<>();
            for (int i = index; i < Math.min(index + 3, products.length) && products[i].startsWith(prefix); i++) {
                suggestions.add(products[i]);
            }
            result.add(suggestions);
        }

        return result;
    }
}
