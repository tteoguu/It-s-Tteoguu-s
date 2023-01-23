import java.util.Scanner;

public class ARRAY_IMPLICA_1 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        int []arr = new int[5];

        System.out.println("Enter the value of element 1: ");
        arr[0] = sc.nextInt();

        System.out.println("Enter the value of element 2: ");
        arr[1] = sc.nextInt();

        System.out.println("Enter the value of element 3: ");
        arr[2] = sc.nextInt();

        System.out.println("Enter the value of element 4: ");
        arr[3] = sc.nextInt();

        System.out.println("Enter the value of element 5: ");
        arr[4] = sc.nextInt();

        

        int index = 0;


        while (index < arr.length) {
            System.out.println(arr[index]);
            index++;

    sc.close();
}
}
}