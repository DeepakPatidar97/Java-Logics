package java_logics;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String ar[]) {
        Scanner obj = new Scanner(System.in);
       boolean flage = false;
        int k = obj.nextInt();
        for (int i = 1; i <= k; i++) {
            if (i % 1 == 0) {
                if (i == 2) {
                    System.out.print(i+" ");
                }
                for (int num = 2; num < i; num++) {
                    if (i % num == 0) {
                        flage = false;
                        break;
                    } else {
                        flage = true;
                    }
                }
                if (flage == true) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}