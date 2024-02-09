
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {11, 22, 33, 45};
        int[] num2 = {1, 2, 3};

        int[] combined = combine(num1, num2);
        for (int num : combined) {
            System.out.print(num + ",");
        }
    }

    public static int[] combine(int[] num1, int[] num2) {
        List<Integer> combinedList = new ArrayList<>();
        int index1 = 0, index2 = 0;

        while (index1 < num1.length || index2 < num2.length) {
            if (index1 < num1.length) {
                combinedList.add(num1[index1]);
                index1++;
            }
            if (index2 < num2.length) {
                combinedList.add(num2[index2]);
                index2++;
            }
        }

        int[] result = new int[combinedList.size()];
        for (int i = 0; i < combinedList.size(); i++) {
            result[i] = combinedList.get(i);
        }

        return result;
    }
}
