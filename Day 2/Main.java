
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int safe = 0;
        boolean safeFlag = true;
        for (int j = 0; j < 1000; j++) {
            safeFlag = true;
            String line = scan.nextLine();
            String[] arr = line.split(" ");
            int diff = 0;
            int problem = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                problem = 0;
                int number1 = Integer.parseInt(arr[i]);
                int number2 = Integer.parseInt(arr[i + 1]);
                if (Math.abs(number1 - number2) > 3) {
                    safeFlag = false;
                    break;
                } else {
                    if (i == 0) {
                        if (number1 - number2 == 0) {
                            problem++;
                            if (problem > 1) {
                                safeFlag = false;
                                break;
                            }
                        }
                        diff = number1 - number2;
                    } else {
                        if (number1 - number2 == 0) {
                            problem++;
                            if (problem > 1) {
                                safeFlag = false;
                                break;
                            }
                        } else if (diff == 0 && number1 - number2 != 0 || diff != 0 && number1 - number2 == 0) {

                        } else if (diff > 0 && (number1 - number2) < 0 || diff < 0 && (number1 - number2) > 0) {
                            problem++;
                            if (problem > 1) {
                                safeFlag = false;
                                break;
                            }
                        }
                        diff = number1 - number2;
                    }

                }

            }
            if (safeFlag) {
                safe++;
                System.out.println(line);
                System.out.println("Safe");
            } else {
                System.out.println(line);
                System.out.println("Not safe");
            }

        }
        System.out.println(safe);
    }
}
