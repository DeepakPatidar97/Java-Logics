/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_logics;

import java.util.Scanner;

/**
 *
 * @author Win_7
 */
public class CityTravel {

    public static void main(String[] args) {
        int s, x, n = 0;
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        x = in.nextInt();
        n = in.nextInt();

        int t[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        int min_i, temp1, temp2;
        for (int i = 0; i < n; i++) {
            min_i = i;
            for (int j = i + 1; j < n; j++) {
                if (t[min_i] > t[j]) {
                    min_i = j;
                }
            }
            if (min_i != i) {
                temp1 = t[i];
                t[i] = t[min_i];
                t[min_i] = temp1;
                temp2 = y[i];
                y[i] = y[min_i];
                y[min_i] = temp2;
            }
        }
        int d = 0, k = 0, p = 0;
        while (s > p) {
            if (t[k] == d + 1) {
                p += y[k];
                k++;
            } else {
                p += x;
            }
            d++;
        }
        System.out.println(d);
    }
}