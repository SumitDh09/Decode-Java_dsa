package MultiDimensionalArray2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
public class ArrayList2D {

        public static void main(String[] args) {
            List<Integer> a = new ArrayList();
            a.add(10);
            a.add(20);
            a.add(30);
            List<Integer> b = new ArrayList();
            b.add(40);
            b.add(50);
            b.add(60);
            List<Integer> c = new ArrayList();
            c.add(70);
            List<Integer> d = new ArrayList();
            d.add(90);
            d.add(100);
            List<List<Integer>> l = new ArrayList();
            l.add(a);
            l.add(b);
            l.add(c);
            l.add(d);

            for(int i = 0; i < l.size(); ++i) {
                for(int j = 0; j < l.get(i).size(); ++j) {
                    PrintStream var10000 = System.out;
                    String var10001 = String.valueOf(((List)l.get(i)).get(j));
                    var10000.print(var10001 + "  ");
                }

                System.out.println();
            }

        }
}

