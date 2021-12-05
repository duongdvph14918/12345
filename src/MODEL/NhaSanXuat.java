/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Admin
 */
public class NhaSanXuat {

    private String MANSX;
    private String TENNSX;
    private String DIACHI;
    private String SDT;
    private String MAIL;

    public NhaSanXuat() {
    }

    public String getMANSX() {
	return MANSX;
    }

    public void setMANSX(String MANSX) {
	this.MANSX = MANSX;
    }

    public String getTENNSX() {
	return TENNSX;
    }

    public void setTENNSX(String TENNSX) {
	this.TENNSX = TENNSX;
    }

    public String getDIACHI() {
	return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
	this.DIACHI = DIACHI;
    }

    public String getSDT() {
	return SDT;
    }

    public void setSDT(String SDT) {
	this.SDT = SDT;
    }

    public String getMAIL() {
	return MAIL;
    }

    public void setMAIL(String MAIL) {
	this.MAIL = MAIL;
    }

    public NhaSanXuat(String MANSX, String TENNSX, String DIACHI, String SDT, String MAIL) {
	this.MANSX = MANSX;
	this.TENNSX = TENNSX;
	this.DIACHI = DIACHI;
	this.SDT = SDT;
	this.MAIL = MAIL;
    }

}
