package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        System.out.println("\t+ Nhap ho ten:" + name1);
        int sn1 = sc.nextByte();
        System.out.println("\t+ Nam sinh:" + sn1);
        String gt1 = sc.next();
        System.out.println("\t+ Gioi tinh:" + gt1);
        float cc1 = sc.nextFloat();
        System.out.println("\tChieu cao:" + cc1);
        String cn1 = sc.next();
        System.out.println("\tCan nang");
    }
}
