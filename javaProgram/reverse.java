import java.util.*;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }   

        for(int j = arr.length-1 ; j >= 0 ; j--){
            System.out.println(arr[j]);
        }

        int sum = 0;
        for(int k = 0 ; k < arr.length; k++){
            if(arr[k] % 2 == 0){
                sum+=arr[k];
            }
        }

        System.out.println(sum/2);
    }
}
