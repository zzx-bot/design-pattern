package com.zzx.interpret.original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExpressionCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入表达式: ");
        String strIn = "";
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            strIn = scan.nextLine();

        }
        List<String> calList = new ArrayList<>();
        List<String> letterList = new ArrayList<>();
        Arrays.stream(strIn.split(""))
                .forEach(s -> {
                    if (s.equals("+") || s.equals("-")) {
                        calList.add(s);
                    } else {
                        letterList.add(s);
                    }
                });


        int sum = 0;
        int number;
        for (int i = 0; i < letterList.size(); i++) {
            System.out.print("请输入" + letterList.get(i) + "的值:");
            number = scan.nextInt();

            if (i != 0) {
                String s = calList.get(i - 1);
                if (s.equals("+")) {
                    sum = sum + number;
                } else if (s.equals("-")) {
                    sum = sum - number;
                }
            } else {
                sum = number;
            }
        }

        System.out.print("运算结果  " + strIn + " = " + sum);
        scan.close();
    }
}
