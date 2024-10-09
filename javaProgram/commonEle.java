import java.util.*;

public class commonEle {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];

            for(int i = 0 ; i < n1 ; i++){
                arr1[i] = sc.nextInt();
            }

            for(int i = 0 ; i < n2 ; i++){
                arr2[i] = sc.nextInt();
            }

            for(int j = 0 ; j < arr1.length; j++){
                for(int k = 0 ; k < arr2.length ; k++){
                    if(arr1[j] == arr2[k]){
                        System.out.println(arr1[j]);
                        break;
                    }
                }
            }

        }
}
