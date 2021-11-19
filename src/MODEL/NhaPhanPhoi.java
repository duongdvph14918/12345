/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author HP
 */
public class NhaPhanPhoi {
    private String maNhaphanphoi;
    private String tenNhaphanphoi;
    private String sdt;
    private String diaChi;
    private String email;
    public NhaPhanPhoi() {
    }

    public NhaPhanPhoi(String maNhaphanphoi, String tenNhaphanphoi, String sdt, String diaChi, String email) {
        this.maNhaphanphoi = maNhaphanphoi;
        this.tenNhaphanphoi = tenNhaphanphoi;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getMaNhaphanphoi() {
        return maNhaphanphoi;
    }

    public void setMaNhaphanphoi(String maNhaphanphoi) {
        this.maNhaphanphoi = maNhaphanphoi;
    }

    public String getTenNhaphanphoi() {
        return tenNhaphanphoi;
    }

    public void setTenNhaphanphoi(String tenNhaphanphoi) {
        this.tenNhaphanphoi = tenNhaphanphoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
    
}
