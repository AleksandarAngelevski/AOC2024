import java.util.Scanner;
import java.util.regex.*;
public class Main{
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int count=0;
            while(scan.hasNext()){
                String line = scan.nextLine();
                // if(line.equals("-1"))break;
                int start=0;
                for(int i=0;i<line.length()-4;i++){
                    if(line.subSequence(i, i+4).equals("mul(")){
                        i+=3;
                        int n =0;
                        while(line.charAt(i)!=','){
                            
                        }
                        
                    }
                }
                
            }
            System.out.println("LAAAAAA");
            System.out.println(count);
    }
}