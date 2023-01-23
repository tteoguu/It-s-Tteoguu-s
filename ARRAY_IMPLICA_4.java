import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class ARRAY_IMPLICA_4 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of storage: ");
        int n = sc.nextInt();

        float [] array = new float[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
    
        }
        
        System.out.println("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        float sum = 0;
        for (int i = 0; i < n; i++){
            sum += array[i];
        }
        System.out.println("Sum of the elements: " + sum);
        float average = sum/n;
        System.out.println("Average of the elements: " + average);
           

    }
    
    }





