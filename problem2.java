import java.util.*;

public class problem2{

    public static int minOperations(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((arr[i] - arr[0]) % k != 0) {
                return -1;
            }
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i] / k;
        }
        Arrays.sort(b);
        int median = b[n / 2];
        int ops = 0;
        for (int x : b) {
            ops += Math.abs(x - median);
        }

        return ops;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

   
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = minOperations(arr, k);

        if (result == -1) {
            System.out.println("Not possible ans=" + result);
        } else {
            System.out.println("Minimum operations: " + result);
        }

        sc.close();
    }
}