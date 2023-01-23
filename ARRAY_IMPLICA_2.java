import java.util.Scanner;

public class ARRAY_IMPLICA_2 {

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
        sc.close();
    }

    }


