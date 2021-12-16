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
public class CTHoaDon {
    private String MaHD;
    private String MaSP;
    private int Soluong;
    private Float Thanhtien;

    public CTHoaDon() {
    }

    public CTHoaDon(String MaHD, String MaSP, int Soluong, Float Thanhtien) {
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

    public Float getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(Float Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
    
    
}
