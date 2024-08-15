/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package OPP.BT1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {

        Scanner tn = new Scanner(System.in);
        //khai báo 2 đối tượng r1,r2 kiểu rectagle
        Rectangle r1, r2;
        //Tạo đối tượng r1
        System.out.println("Tao doi tuong r1....");
        r1 = new Rectangle();
        // tạo đối tượng r2        
        System.out.println("Tao doi tuong r2....");
        System.out.println("Cho biet dai:");
        double dai = tn.nextDouble();
        System.out.println("Cho biet rong: ");
        double rong = tn.nextDouble();
        
        r2=new Rectangle(dai,rong);
        
        System.out.println("Thong tin ket qua: ");
        System.out.println("HCN thu 1: dai:" + r1.getLength() + "-rong" + r1.getWidth() + "-dien tich" + r1.FindArea()+ "chu vi" + r1.findPerimeter());
        System.out.println("HCN thu 2: dai:" + r2.getLength() + "-rong" + r2.getWidth() + "-dien tich" + r2.FindArea()+ "chu vi" + r2.findPerimeter());
    }

}
