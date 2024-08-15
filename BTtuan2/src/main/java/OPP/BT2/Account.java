/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP.BT2;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    
  
    public Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId(){
        return id;
}
    public String getName(){
        return name;
}
    public int getBalance(){
        return balance;
}
    public void credit(int amount){
        if(balance>0){
            balance+=amount;
        }else{
            System.out.println("So tien nap vao phai la so duong");
        }
    }
    public void debit(int amount){
        if(balance>=amount){
            balance-=amount;
        }else{
            System.out.println("So tien vuot qua so du.Thanh toan khong thanh cong");
        }
    }
        public void tranferto(Account acc,int amount){
            if(amount<=balance){
                balance-=amount;
                acc.balance+=amount;
            }else{
                System.out.println("So tien vuot qua so du.Chuyen khoan khong thanh cong");
            }
        }
}