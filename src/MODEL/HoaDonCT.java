/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author LENOVO
 */
public class HoaDonCT {
     private String MaHD;
    private String MaSP;
    private int Soluong;
    private double Thanhtien;

    public HoaDonCT() {
    }

    public HoaDonCT(String MaHD, String MaSP, int Soluong, double Thanhtien) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.Soluong = Soluong;
        this.Thanhtien = Thanhtien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(double Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
    
}
