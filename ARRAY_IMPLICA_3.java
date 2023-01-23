import java.util.Scanner;

public class ARRAY_IMPLICA_3 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of storage: ");
        int n = sc.nextInt();

        int [] array = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
    
        }
        
        System.out.println("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }

        System.out.println(" ");
        System.out.println("Reversed Data: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    
        sc.close();
    }

    }


