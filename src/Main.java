import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers in first array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter how many numbers in second array: ");
        n = sc.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        int arrNew[] = new int[2];
        if (arr.length != 0) {
            arrNew[0] = arr[0];
        }
        if (arr2.length != 0) {
            arrNew[1] = arr2[0];
        }
        if (arr.length != 0 && arr2.length != 0) {
            System.out.println("[" + arrNew[0] + ", " + arrNew[1] + "]");
        }
        else if (arr.length != 0) {
            System.out.println("[" + arrNew[0] + "]");
        }
        else if (arr2.length != 0) {
            System.out.println("[" + arrNew[1] + "]");
        }
    }
}