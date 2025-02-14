package LeetcodeProblems;

import java.util.*;
class ProductOfNumbers {
    private List<Integer> products;

    public ProductOfNumbers() {
        products = new ArrayList<>();
        products.add(1);
        // Initial value for product calculations
    }

     public static void main(String[] args) {
         ProductOfNumbers productOfNumbers = new ProductOfNumbers();

         productOfNumbers.add(3);   // [3]
         productOfNumbers.add(0);   // [3, 0]
         productOfNumbers.add(2);   // [3, 0, 2]
         productOfNumbers.add(5);   // [3, 0, 2, 5]
         productOfNumbers.add(4);   // [3, 0, 2, 5, 4]

         System.out.println(productOfNumbers.getProduct(2));
         // Output: 20 (5 * 4)
         System.out.println(productOfNumbers.getProduct(3));
         // Output: 40 (2 * 5 * 4)
         System.out.println(productOfNumbers.getProduct(4));
         // Output: 0  (0 * 2 * 5 * 4)

         productOfNumbers.add(8);   // [3, 0, 2, 5, 4, 8]

         System.out.println(productOfNumbers.getProduct(2));
         // Output: 32 (4 * 8)
     }

    public void add(int num) {
        if (num == 0) {
            products.clear();
            products.add(1);
            // Reset the list if num is zero
        } else {
            products.add(products.get(products.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int size = products.size();
        if (k >= size) {
            return 0;
            // If k is larger than the current number of products, the product includes a zero
        }
        return products.get(size - 1) / products.get(size - 1 - k);
    }
}
