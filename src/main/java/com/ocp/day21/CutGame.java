package com.ocp.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *   請撰寫一隻程式,需由鍵盤輸入一個整數,用來表示繩子的長度(單位:公尺)
 *   如果每天減去一半的長度要花費幾天長度會等於5公尺
     繩子長度有1000跟99
 */
public class CutGame {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入繩子的長度");
        int rope = 0;
        try {
            rope = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("錯誤原因 " + e);
            System.out.println("請重新輸入");
            main(args);
        }
        if (rope > 0) {
            while (rope >= 5) {

                count++;
                rope /= 2;
            }
            System.out.println("count: " + count);
        }

    }
}
