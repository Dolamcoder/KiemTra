/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class menu {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh=new TuyenSinh();
        boolean ok=true;   
        while(ok){
        System.out.println("1: them thi sinh");
        System.out.println("2: hien thi thong tin thi sinh");
        System.out.println("3: tim kiem thi sinh");
        System.out.println("4: dong chuong trinh");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        switch(n){
            case 1: 
                tuyenSinh.addThiSinh();
                System.out.println("Enter de tiep tuc chon lua");
                sc.nextLine();
                break;
            case 2: 
                tuyenSinh.danhSachThiSinh();
                System.out.println("Enter de tiep tuc chon lua");
                sc.nextLine();
                break;
            case 3:
                System.out.println("sbd cua thi sinh can tim");
                String sbd=sc.nextLine();
                System.out.println(tuyenSinh.timKiem(sbd));
                System.out.println("Enter de tiep tuc chon lua");
                sc.nextLine();
                break;
            case 4:
                ok=false;
                break;
            default: 
                System.out.println("vui long chon dung lua chon");
                break;
        }
        }
    }
}
