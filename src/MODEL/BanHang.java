/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class BanHang {
  String mahd,masp;
  Date ngaytao;
  Float donGia;
  int soluong;
  Float thanhTien;
String nhanvien;
    public BanHang() {
    }

    public String getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(String nhanvien) {
        this.nhanvien = nhanvien;
    }

   

    public BanHang(String mahd, String masp, Date ngaytao, Float donGia, int soluong, Float thanhTien, String nhanvien) {
        this.mahd = mahd;
        this.masp = masp;
        this.ngaytao = ngaytao;
        this.donGia = donGia;
        this.soluong = soluong;
        this.thanhTien = thanhTien;
        this.nhanvien = nhanvien;
    }
    

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }
  
}
