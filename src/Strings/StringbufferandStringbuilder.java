package Strings;

public class StringbufferandStringbuilder {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Sumit");

        sb.append(" dhondikar ");
//        System.out.println(sb);

//        sb.deleteCharAt(2);
        sb.insert(6, "Java ");

        sb.setLength(30);
        System.out.println(sb);


    }
}


