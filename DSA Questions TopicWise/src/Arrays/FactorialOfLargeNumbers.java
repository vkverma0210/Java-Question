package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorialOfLargeNumbers {
    public static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(1);

        for (int i = 2; i <= N; i++) {
            int carry = 0;

            for (int j = ls.size() - 1; j >= 0; j--) {
                int res = (ls.get(j) * i) + carry;
                ls.set(j, res % 10);
                carry = res / 10;
            }

            while (carry != 0) {
                ls.add(0, carry % 10);
                carry /= 10;
            }
        }

        return ls;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<Integer> ls = factorial(n);

        StringBuffer str = new StringBuffer();

        for (int i = 0; i < ls.size(); i++) {
            str.append(ls.get(i));
        }

        System.out.println(str);

        scn.close();

    }
}
