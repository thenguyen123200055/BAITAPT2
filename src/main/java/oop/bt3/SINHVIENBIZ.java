/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt3;

/**
 *
 * @author MSI_PC
 */
public class SINHVIENBIZ extends SINHVIEN{
     public double diemMaketing;
    public double diemSales;

    public SINHVIENBIZ(String hoten,double diemMaketing,double diemSales){
        super(hoten,"Biz");
        this.diemMaketing=diemMaketing;
        this.diemSales=diemSales;
    }
    @Override
    public double getDiem() {
        return(diemMaketing*2+diemSales)/3;
    }
}
