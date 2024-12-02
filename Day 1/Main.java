import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        int[] arr1 = new int[1000];
        int[] arr2 = new int[1000];
        Map<Integer,Integer> mapa = new HashMap<Integer,Integer>();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<1000;i++){
            int num1=scan.nextInt();
            int num2=scan.nextInt();
            if(mapa.containsKey(num1)){
            }else{
                mapa.put(num1,0);
            }
            
            arr1[i]=num1;
            arr2[i]=num2;
        }
        for(int i=0;i<1000;i++){
        if(mapa.containsKey(arr2[i])){
            mapa.replace(arr2[i],mapa.get(arr2[i])+1);
        }
    }   
        int sumu=0;
        for(int i=0;i<1000;i++){
            sumu+=arr1[i]*mapa.get(arr1[i]);
        }
        System.out.println(sumu);
        bubbleSort(arr1, 1000);
        bubbleSort(arr2, 1000);
        int sum=0;
        for(int i=0;i<1000;i++){
            sum+=Math.abs(arr1[i]-arr2[i]);
        }
        // System.out.println(sum);
        scan.close();


    }
    static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
}