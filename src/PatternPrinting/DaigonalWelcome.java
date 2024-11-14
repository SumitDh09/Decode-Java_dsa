package PatternPrinting;


public class DaigonalWelcome {
    public static void main(String[] args) {
        String message = "WELCOME";
        int messageLength = message.length();
        int totalLength = messageLength;

        // Print the left diagonal
        for (int i = 0; i < totalLength; i++) {
            // Print leading spaces for left diagonal
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i < messageLength) {
                System.out.println(message.charAt(i));
            } else {
                System.out.println();
            }
        }

    }
}