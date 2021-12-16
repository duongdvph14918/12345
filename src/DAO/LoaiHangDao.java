/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import MODEL.LoaiHang;
import Utils.hepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class LoaiHangDao extends EduSyDao<LoaiHang, String>{

 

    private List<LoaiHang> selectBySql(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public List<LoaiHang> selectAll() {
        String sql = "select * from LOAIHANG";
        return select(sql);
    }

    private List<LoaiHang> select(String sql, Object... args) {
        List<LoaiHang> lstLoaiHang = new ArrayList<>();
        try {
            ResultSet rs = hepper.query(sql, args);
            while (rs.next()) {
                LoaiHang loaiHang = new LoaiHang();
                loaiHang.setMALH(rs.getString("MALH"));
                loaiHang.setTENLH(rs.getString("TENLH"));
                lstLoaiHang.add(loaiHang);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstLoaiHang;
    }

    public void them(LoaiHang ld) {
        String select_update = "insert into LOAIHANG values(?,?) ";
        try {
            hepper.update(select_update,
                    ld.getMALH(),
                    ld.getTENLH());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void SuaLH(LoaiHang lh) {
        String sql = "update LOAIHANG set TENLH =? where MALH = ?";
        hepper.update(sql,
                lh.getTENLH(),
                lh.getMALH());
    }

    public List<LoaiHang> selectLH_byTen(String tenLH) {
        String sql = "select * from LOAIHANG where TENLH like ?";
        String ten =  tenLH + "%";
        return select(sql, ten);
    }

   
   }
   

