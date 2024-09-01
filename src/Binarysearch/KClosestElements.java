package Binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class kClosestElements {

    public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        int index = Collections.binarySearch(arr, x);
        if (index < 0) {
            index = -(index + 1);
        }
        int i = index - 1, j = index;
        while (k-- > 0) {
            if (i < 0 || (j < arr.size() && Math.abs(arr.get(i) - x) > Math.abs(arr.get(j) - x))) {
                j++;
            } else {
                i--;
            }
        }
        return arr.subList(i + 1, j);
    }

    public static void main(String[] args) {
        kClosestElements closestElements = new kClosestElements();
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int k = 4;
        int x = 3;
        List<Integer> result = closestElements.findClosestElements(arr, k, x);
        System.out.println("Closest elements to " + x + ": " + result);
    }
}
