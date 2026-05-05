import java.util.*;

public class problem1 {

    public static int maxCyclicSubstringSum(String s) {
        int n = s.length();
        String doubled = s + s;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            int currentSum = 0;

            for (int j = i; j < i + n; j++) {
                char ch = doubled.charAt(j);

                if (set.contains(ch)) {
                    break;
                }

                set.add(ch);
                int value = ch - 'a' + 1;
                currentSum += value;
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int result = maxCyclicSubstringSum(s);
        System.out.println("Maximum Sum: " + result);
    }
}