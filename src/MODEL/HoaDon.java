/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class HoaDon {
    private String Mahd;
    private Date Ngaytao;
    private String Manv;
    private Float Dongia;

    public HoaDon() {
    }

    public HoaDon(String Mahd, Date Ngaytao, String Manv, Float Dongia) {
        this.Mahd = Mahd;
        this.Ngaytao = Ngaytao;
        this.Manv = Manv;
        this.Dongia = Dongia;
    }

    public String getMahd() {
        return Mahd;
    }

    public void setMahd(String Mahd) {
        this.Mahd = Mahd;
    }

    public Date getNgaytao() {
        return Ngaytao;
    }

    public void setNgaytao(Date Ngaytao) {
        this.Ngaytao = Ngaytao;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public Float getDongia() {
        return Dongia;
    }

    public void setDongia(Float Dongia) {
        this.Dongia = Dongia;
    }

    public void setManv(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
