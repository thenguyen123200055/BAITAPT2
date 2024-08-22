/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt3;

/**
 *
 * @author MSI_PC
 */
public  class SINHVIENIT extends SINHVIEN{
     public double diemJava;
    public double diemCSS;
    public double diemHtml;

    public SINHVIENIT(String hoten,double diemJava,double diemCSS,double diemHtml){
        super(hoten,"IT");
        this.diemJava=diemJava;
        this.diemCSS=diemCSS;
        this.diemHtml=diemHtml;
    }

    @Override
    public double getDiem() {
        return (diemJava*2+diemHtml+diemCSS)/4;
    }
}
