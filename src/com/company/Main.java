package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuong trinh nhap xuat thong tin ung vien");
        System.out.println("=========================================");
        System.out.println("***Moi nhap ung vien so 1:");
        System.out.println("\t+ Nhap ho ten:");
        String name1 = sc.next();
        System.out.println("\t+ Nhap nam sinh:");
        String sn1 = sc.next();
        System.out.println("\t+ Nhap gioi tinh:");
        String gt1 = sc.next();
        System.out.println("\t+ Nhap chieu cao:");
        float cc1 = sc.nextFloat();
        System.out.println("\t+ Nhap can nang:");
        String cn1 = sc.next();
        System.out.println("\t+ Nhap que quan:");
        String qq1 = sc.next();
        System.out.println("\t+ Nhap chuyen nganh:");
        String cng1 = sc.next();
        System.out.println("\t+ Nhap diem TB :");
        float dtb1 = sc.nextFloat();

        System.out.println("***Moi nhap ung vien so 2:");
        System.out.println("\t+ Nhap ho ten:");
        String name2 = sc.next();
        System.out.println("\t+ Nhap nam sinh:");
        String sn2 = sc.next();
        System.out.println("\t+ Nhap gioi tinh:");
        String gt2 = sc.next();
        System.out.println("\t+ Nhap chieu cao:");
        float cc2 = sc.nextFloat();
        System.out.println("\t+ Nhap can nang:");
        String cn2 = sc.next();
        System.out.println("\t+ Nhap que quan:");
        String qq2 = sc.next();
        System.out.println("\t+ Nhap chuyen nganh:");
        String cng2 = sc.next();
        System.out.println("\t+ Nhap diem TB :");
        float dtb2 = sc.nextFloat();

        System.out.println("***Moi nhap ung vien so 3:");
        System.out.println("\t+ Nhap ho ten:");
        String name3 = sc.next();
        System.out.println("\t+ Nhap nam sinh:");
        String sn3 = sc.next();
        System.out.println("\t+ Nhap gioi tinh:");
        String gt3 = sc.next();
        System.out.println("\t+ Nhap chieu cao:");
        float cc3 = sc.nextFloat();
        System.out.println("\t+ Nhap can nang:");
        String cn3 = sc.next();
        System.out.println("\t+ Nhap que quan:");
        String qq3 = sc.next();
        System.out.println("\t+ Nhap chuyen nganh:");
        String cng3 = sc.next();
        System.out.println("\t+ Nhap diem TB :");
        float dtb3 = sc.nextFloat();

        System.out.println("=========================================");
        System.out.println("Danh sach cac ung vien da nhap");
        System.out.println("=========================================");
        System.out.println("***Ung vien so 1");
        System.out.println("\t+ Ho ten: " + name1 );
        System.out.println("\t+ Nam sinh: " + sn1 );
        System.out.println("\t+ Gioi tinh: " + gt1 );
        System.out.println("\t+ Chieu cao: " + cc1 + "m");
        System.out.println("\t+ Can nang: " + cn1 + "kg");
        System.out.println("\t+ Que quan: " + qq1 );
        System.out.println("\t+ Chuyen nganh: " + cng1 );
        System.out.println("\t+ Diem TB: " + dtb1);

        System.out.println("***Ung vien so 2");
        System.out.println("\t+ Ho ten: " + name2 );
        System.out.println("\t+ Nam sinh: " + sn2 );
        System.out.println("\t+ Gioi tinh: " + gt2 );
        System.out.println("\t+ Chieu cao: " + cc2 + "m");
        System.out.println("\t+ Can nang: " + cn2 + "kg");
        System.out.println("\t+ Que quan: " + qq2 );
        System.out.println("\t+ Chuyen nganh: " + cng2 );
        System.out.println("\t+ Diem TB: " + dtb2);

        System.out.println("***Ung vien so 3");
        System.out.println("\t+ Ho ten: " + name3 );
        System.out.println("\t+ Nam sinh: " + sn3);
        System.out.println("\t+ Gioi tinh: " + gt3 );
        System.out.println("\t+ Chieu cao: " + cc3 + "m");
        System.out.println("\t+ Can nang: " + cn3 + "kg");
        System.out.println("\t+ Que quan: " + qq3 );
        System.out.println("\t+ Chuyen nganh: " + cng3 );
        System.out.println("\t+ Diem TB: " + dtb3);

    }
}
