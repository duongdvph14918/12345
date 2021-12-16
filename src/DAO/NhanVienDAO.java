/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utils.hepper;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import MODEL.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String> {
    
    String select_update = "update NHANVIEN set HOTEN =? ,GIOITINH=?, DIENTHOAI =? ,EMAIL=?,MATKHAU=?, VAITRO =? where MANV =?";
    String select_insert = "insert into NHANVIEN (MANV , HOTEN ,GIOITINH, DIENTHOAI,EMAIL,MATKHAU, VAITRO) values (?,?,?,?,?,?,?)";
    String delete_sql = "delete from NHANVIEN where MANV =?";
    String SELECT_ALL_SQL = "select * from NHANVIEN";
    String SELECT_BY_ID_SQL = "select * from NHANVIEN where MANV = ?";
    public void updatemk(NhanVien entity) {
	String sql = "UPDATE NHANVIEN set MATKHAU =? where MANV =?";
	hepper.update(sql,
		entity.getMATKHAU(),
		entity.getMANV());
    }
    
    @Override
    public void insert(NhanVien entity) {
	try {
	    hepper.update(select_insert,
                    entity.getMANV(),
		    entity.getHOTEN(),
                    entity.isGIOITINH(),
		    entity.getDIENTHOAI(),
                    entity.getEMAIL(),
                    entity.getMATKHAU(),
		    entity.isVAITRO());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    @Override
    public void update(NhanVien entity) {
	hepper.update(select_update,
		entity.getHOTEN(),
                entity.isGIOITINH(),
		entity.getDIENTHOAI(),
		entity.isVAITRO(),
		entity.getMANV());
	
    }
    public void updateNV(NhanVien nv){
        String sql = "update NHANVIEN set HOTEN =?, GIOITINH =?,DIENTHOAI=?,EMAIL=?,MATKHAU=?,VAITRO=? WHERE MANV =?";
        hepper.update(sql,
                nv.getHOTEN(),
                nv.isGIOITINH(),
                nv.getDIENTHOAI(),
                nv.getEMAIL(),
                nv.getMATKHAU(),
                nv.isVAITRO(),
                nv.getMANV());
    }
    @Override
    public void delete(String id) {
	hepper.update(delete_sql, id);
    }
    
    @Override
    public List<NhanVien> selectAll() {
	return this.selectBySQL(SELECT_ALL_SQL);
    }
    
    @Override
    List<NhanVien> selectBySQL(String sql, Object... args) {
	List<NhanVien> list = new ArrayList<>();
	try {
	    ResultSet rs = hepper.query(sql, args);
	    while (rs.next()) {
		NhanVien nv = new NhanVien();
		nv.setMANV(rs.getString("MANV"));
		nv.setHOTEN(rs.getString("HOTEN"));
		nv.setGIOITINH(rs.getBoolean("GIOITINH"));
		nv.setDIENTHOAI(rs.getString("DIENTHOAI"));
		nv.setEMAIL(rs.getString("EMAIL"));
		nv.setMATKHAU(rs.getString("MATKHAU"));
		nv.setVAITRO(rs.getBoolean("VAITRO"));
		list.add(nv);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (Exception e) {
	    throw new RuntimeException();
	}
    }
    
    @Override
    public NhanVien selectByID(String id) {
	List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
	if (list.isEmpty()) {
	    return null;
	}
	return list.get(0);
    }
        public List<NhanVien> selectByKeyword(String keyword) {
       String sql ="select * from NHANVIEN where MANV like N ? ";
        return this.selectBySQL(sql, "%" + keyword + "%");
    }
    public List<NhanVien> selectByEmail(String email){
        String sql = "select * from NHANVIEN where EMAIL LIKE ?";
        return selectBySQL(sql, "%" + email +"%");
    }
    public List<NhanVien> selectByMa(String ma){
        String sql = "select * from NHANVIEN where MANV LIKE ?";
        return selectBySQL(sql, "%" + ma +"%");
    }
        public List<NhanVien> selectByMa1(String key){
        String sql = "select * from NHANVIEN where MANV LIKE ? or HOTEN like ?";
        return selectBySQL(sql, "%" + key +"%","%" + key +"%");
    }
    public List<NhanVien> selectByName(String name){
        String sql = "select * from NHANVIEN where HOTEN LIKE ?";
        return selectBySQL(sql, "%" + name +"%");
    }
    
}
