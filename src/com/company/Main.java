package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        System.out.println("Nhap b:");
        int b = sc.nextInt();
        System.out.println("Nhap c:");
        int c = sc.nextInt();
        int k = b*b - 4*a*c ;
        System.out.println("Delta = " + k);
        }

    }
