/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class Program {
      public static ArrayList<SINHVIEN> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("-----------CHUONG TRINH QUAN LY SINH VIEN----------");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.println("===================================");
            System.out.print("Chon chuc nang (0>5): ");
            chon = sc.nextInt();
            sc.nextLine();  

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatHocLucGioi();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    System.out.println("Goodbye Tam biet hen gap lai ");
                    break;
                default:
                    System.out.println("Lua chon sai roi kia, vui long nhap lai !!! ");
            }
        } while (chon != 5);
    }

    private static void nhap() {
        System.out.println("Thuc hien nhap:");

        Scanner sc = new Scanner(System.in);
        String tieptuc;

        do {
            System.out.println("Cho biet loai sinh vien (IT:1,Biz:2): ");
            int chon = Integer.parseInt(sc.nextLine());
            SINHVIEN sv = null;
            if (chon == 1) {

                //1. Nhap thong tin
                System.out.println("Cho biet ho ten:");
                String hoTen = sc.nextLine();
                System.out.print("Diem Java: ");
                double java = Double.parseDouble(sc.nextLine());
                System.out.print("Diem HTML: ");
                double html = Double.parseDouble(sc.nextLine());
                System.out.print("Diem CSS: ");
                double css = Double.parseDouble(sc.nextLine());

                sv = new SINHVIENIT(hoTen, java, css, html);
            } else if (chon == 2) {
                System.out.println("Cho biet ho ten:");
                String hoTen = sc.nextLine();
                System.out.print("Diem Marketing: ");
                double marketing = Double.parseDouble(sc.nextLine());
                System.out.print("Diem Sales: ");
                double sales = Double.parseDouble(sc.nextLine());

                sv = new SINHVIENBIZ(hoTen, marketing, sales);
            }
            //3. Them SV
            if (sv != null) {
                ds.add(sv);
            }

            System.out.println("Tiep tuc (Y/N?");
            tieptuc = sc.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }

    private static void xuat() {
        System.out.println("Thuc hien xuat danh sach sinh vien:");
        for (SINHVIEN sv : ds) {
            sv.Xuat();
        }
    }

    private static void xuatHocLucGioi() {
        System.out.println("Thuc hien xuat danh sach sinh vien hoc luc gioi:");
        for (SINHVIEN sv : ds) {
            if (sv.getHocLuc().equals("Gioi") || sv.getHocLuc().equals("Xuất sắc")) {
                sv.Xuat();
            }
        }

    }

    private static void sapXep() {
        System.out.println("Thuc hien sap xep:");
        //dinh nghia tieu chi sap xep tren sinhvien
        Comparator<SINHVIEN> cmp = (SINHVIEN sv1, SINHVIEN sv2) -> Double.compare(sv1.getDiem(), sv2.getDiem());
        Collections.sort(ds, cmp);
        xuat();
    }
}