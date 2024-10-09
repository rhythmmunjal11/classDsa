import java.util.*;

public class longestLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[100];
        int[] arr2 = new int[100];

        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt();
        }

        if(n1>n2){
            int s = 0;
            int e = arr1.length;

            int mid = s+(e-s)/2;

            System.out.println(arr1[mid]);
        }

    }
}
