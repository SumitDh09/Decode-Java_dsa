package Stack;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {

        Stack<Integer> st_Original = new Stack<>();
        System.out.println(st_Original.isEmpty());
        st_Original.push(1);
        st_Original.push(5);
        st_Original.push(10);
        st_Original.push(20);
        System.out.println(st_Original);

        Stack<Integer> st_Reversed = new Stack<>();
        while (!st_Original.isEmpty())
        {
            st_Reversed.push(st_Original.pop());
        }
        System.out.println(st_Reversed);
//        TC --> O(N) becuz we pop the original stack and push in reverse stack
//        SC --> O(N)


    }
}
