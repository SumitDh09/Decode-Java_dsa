package Stack;

import java.util.Stack;

// Push Elements at bottom/ any index
public class PushElements {
    public static void main(String[] args) {
        //Insert at bottom
        Stack<Integer> st_original = new Stack<>();
        // System.out.println(st_Original.isEmpty());
        st_original.push(1);
        st_original.push(51);
        st_original.push(10);
        st_original.push(20);

        int new_element = 50;
//        int pos =2;


//        System.out.println(st_original);
        Stack<Integer> st_temp = new Stack<>();
        while (st_original.size()>0){
            st_temp.push(st_original.pop());
        }

//        our position in org. stack is empty so we push new element
        st_original.push(new_element);

        while (st_temp.size()>0){
            st_original.push(st_temp.pop());
        }
        System.out.println(st_original);
    }
}