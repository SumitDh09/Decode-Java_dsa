package ArrayAndArraylist;

public class passingarray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
        System.out.println(arr);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 90;
    }
}

