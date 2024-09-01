package Strings;

public class Maxvalue {
    public static void main(String[] args) {
        String[] arr = new String[]{"14523", "7487687896", "561421"};
        String maxS = arr[0];

        for(int i = 0; i < arr.length; ++i) {
            maxS = max(maxS, arr[i]);
        }

        System.out.println(maxS);
    }

    public static String max(String a, String b) {
        String s = purify(a);
        String t = purify(b);
        if (s.length() > t.length()) {
            return a;
        } else if (s.length() < t.length()) {
            return b;
        } else {
            for(int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) != t.charAt(i)) {
                    if (s.charAt(i) > t.charAt(i)) {
                        return a;
                    }

                    return b;
                }
            }

            if (a.length() >= b.length()) {
                return a;
            } else {
                return b;
            }
        }
    }

    public static String purify(String s) {
        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                return s.substring(i);
            }
        }

        return s;
    }
}
