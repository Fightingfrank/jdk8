package org.shengsiyuan.jdk8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);
        }
    }
}