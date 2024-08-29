package FirstDay;

import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odd n even");
        System.out.println("Enter number of integer");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter integer");
        for (int i = 0; i < num;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i<num ; i++){
            int n = arr[i];
            if(n % 2 == 0){
            System.out.println(n + "is even");
        }
        else{
            System.out.println(n + "odd");
        }
        }
    }
}
