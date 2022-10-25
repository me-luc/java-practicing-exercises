package pacote;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int nRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int n1 = result.get(i - 1).get(j);
                    int n2 = result.get(i - 1).get(j - 1);
                    list.add(n1 + n2);
                }
            }

            result.add(list);
        }

        return result;
    }

    public void showList(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = "";
            for (int j = 0; j < list.get(i).size(); j++) {
                str += list.get(i).get(j) + " ";
            }
            System.out.println(str + "\n");
        }
    }

    public static void main(String[] args) {
        PascalsTriangle p = new PascalsTriangle();
        p.showList(p.generate(50));
    }
}
