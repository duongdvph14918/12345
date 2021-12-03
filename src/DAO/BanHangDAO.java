/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.BanHang;
import Utils.hepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class BanHangDAO {
    
    
    public List<BanHang> select(){ 
        String select_all = "Select * from Hoadon " ;
        return select(select_all);
    }

    private List<BanHang> select(String sql, Object... args) {
       List<BanHang> list  = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = hepper.query(sql, args);
                while(rs.next()){
                    BanHang model = new BanHang();
                    model.setMahd(rs.getString("mahd"));
                    model.setNgaytao(rs.getDate("NgayTao"));
                    model.setNhanvien(rs.getString("manv"));
                    model.setDonGia(rs.getFloat("trigia"));
//                    model.setMasp(rs.getString("masp"));
//                    model.setSoluong(rs.getInt("soluong"));
//                    model.setThanhTien(rs.getFloat("Thanhtien"));
                    list.add(model);
                }
            }finally{
                rs.getStatement().getConnection().close();
            } 
           
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
}
