/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TuyenSinh {
    List<ThiSinh> danhSach;
    Scanner sc=new Scanner(System.in);
    
    public TuyenSinh()
    {
        danhSach=new ArrayList<>();
    }
    public boolean checkTonTai(String id){
        for(ThiSinh x: danhSach){
            if(x.getSbd().equals(id)) return false;
        }
        return true;
    }
    public void addThiSinh(){
       
        System.out.println("So bao danh: ");
        String sbd=sc.nextLine();
        if(!checkTonTai(sbd)) {
            System.out.println("so bao danh da ton tai");
            return;
        }
        System.out.println("Ho va Ten: ");
        String name=sc.nextLine();
        System.out.println("Dia chi: ");
        String adress=sc.nextLine();
        System.out.println("Muc uu tien: ");
        int n=sc.nextInt();
        sc.nextLine();
        ThiSinh ts=new ThiSinh(sbd, name, adress, n);
        danhSach.add(ts);
        System.out.println("khoi thi: ");
        char x=sc.next().charAt(0);
        sc.nextLine();
        ts.setKhoiThi(x);
        System.out.println("them thi sinh thanh cong");  
    }
    public void danhSachThiSinh(){
        if(danhSach.isEmpty()){
            System.out.println("Danh Sach trong");
            return;
        }
        for(ThiSinh x: danhSach){
            System.out.println(x);
        }
    }
    public ThiSinh timKiem(String sbd){
        for(ThiSinh x: danhSach){
            if(x.getSbd().equals(sbd)){
                return x;
            }
        }
        return null;
    }
}
