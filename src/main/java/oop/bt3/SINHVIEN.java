/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt3;

/**
 *
 * @author MSI_PC
 */
public abstract class SINHVIEN {
     public String hoten;
    public String nganh;

    public SINHVIEN(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    //Phương thức tính điểm trung bình
    abstract public double getDiem();
    //Phương thức xếp loại

    public String getHocLuc() {
        String kq = "";
        double dtb = getDiem();
        if (dtb < 5) {
            kq = "Yeu";
        } else if (dtb < 6.5) {
            kq = "Trung Binh";
        } else if (dtb < 7.5) {
            kq = "Kha";
        } else if (dtb < 9) {
            kq = "Gioi";
        } else {
            kq = "Xuat Sac";
        }
        return kq;
    }

    //Phương thức xuất thông tin sinh viên
    public void Xuat() {
        System.out.println("Sinh Vien[Ho ten: " + hoten + " Nganh :" + nganh + " Diem Trung Binh :"
                + getDiem() + " Hoc Luc: " + getHocLuc());
    }
}
