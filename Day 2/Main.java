
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int safe = 0;
        String line="";
        boolean safeFlag = true;
        for (int j = 0; j < 1000; j++) {
        
            safeFlag = true;
            line = scan.nextLine();
            String[] arr = line.split(" ");
            int problemCounter=0;
            for(int i=0;i<arr.length;i++){
                int point=0;
                String[] arr2 = new String[arr.length-1];
                for(int k=0;k<arr.length;k++){
                    if(k==i)continue;
                    arr2[point]=arr[k];
                    point++;
                }
                if(check(arr2)){
                    safe++;
                    break;
                }
            }
            // if(safeFlag)safe++;
            // safeFlag=true;
            
    }

        System.out.println(safe);
    }
    public static boolean check(String[] arr){
        Integer diff=null;
        for(int i=0;i<arr.length-1;i++){
            int n1= Integer.parseInt(arr[i]);
            int n2= Integer.parseInt(arr[i+1]);
            if(Math.abs(n1-n2)>3)return false;
            if(diff !=null){
                if(diff<0&&n1>n2)return false;
                if(diff>0&&n1<n2)return false;
                if(n1==n2)return false;
            }else{
                if(n1==n2)return false;
            }
            diff=n1-n2;
        }
        return true;

    }
}
