/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP.BT2;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class Programs {

    public static void main(String[] args) {
        Account ac1 = new Account("TK01", "Tran Quang Nha", 1000000000);//my
        Account ac2 = new Account("TK05", "The Nguyen", 100);//my friend

        //Tao doi tuong Format du lieu
        DecimalFormat fm = new DecimalFormat("#,##0.00");
         System.out.println("Thong tin tai khoan ban dau");
        System.out.println("MyAccount[id:"+ac1.getId()+"name"+ac1.getName()+"balance"+fm.format(ac1.getBalance()));
        System.out.println("MyFriend Account[id" +ac2.getId()+ ", name"+ac2.getName()+",balance:" +ac2.getBalance()+"]");
       
        System.out.println("Rut 200000 tien tu tai khong Account.....");
        ac1.debit(200000);
       
        System.out.println("Nap 1000000 vao tai khoan MyFriend Account......");
        ac2.credit(1000000);
        System.out.println("Chuyen khoan 50000000 tu MyAccount to MyFriend......");
        ac1.tranferto(ac2,50000000);
       
        System.out.println("Thong tin tai khoan sau giao dich:");
        System.out.println("My Account [id: "+ac1.getId()+ ",name: "+ac1.getName()+",balance:" +ac1.getBalance()+"]");
        System.out.println("MyFriend Account [id:"+ac2.getId()+ ",name:"+ac2.getName() +",balance: "+ac2.getBalance()+"]");
    }
}
