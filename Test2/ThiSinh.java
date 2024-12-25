/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

/**
 *
 * @author Admin
 */
public class ThiSinh {
    private String sbd, name, adress;
    private int mucUuTien;
  private char khoiThi;
    public ThiSinh(String sbd, String name, String adress, int mucUuTien) {
        this.sbd = sbd;
        this.name = name;
        this.adress = adress;
        this.mucUuTien = mucUuTien;
    }

    public void setKhoiThi(char khoiThi) {
        this.khoiThi = khoiThi;
    }

    public char getKhoiThi() {
        return khoiThi;
    }

    public String getSbd() {
        return sbd;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }
 public String traKhoiThi(char x) {
    switch (x) {
        case 'A':
        case 'a': // Thêm trường hợp cho 'a'
            return "Toan, Ly, Hoa";
        case 'B':
        case 'b': // Thêm trường hợp cho 'b'
            return "Toan, Hoa, Sinh";
        case 'C':
        case 'c': // Thêm trường hợp cho 'c'
            return "Van, Su, Dia";
        default:
            return "Khoi khong hop le";
    }
}

  
    @Override
    public String toString() {
        return "ThiSinh{" + "sbd=" + sbd + ", name=" + name + ", adress=" + adress + ", mucUuTien=" + mucUuTien + ", Khoi thi: "+ traKhoiThi(this.khoiThi)+"}";
    }
    
}
