/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.HoaDon;
import Utils.hepper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class HoaDonDAO {
     String SELECT_ALL_SQL = "select * from HoaDon";
    
    public List<HoaDon> selectAll(){
        return select(SELECT_ALL_SQL);
    }
    private HoaDon readFromResultSet(ResultSet rs ) throws SQLException{
        HoaDon model = new HoaDon();
        model.setMahd(rs.getString("MaHD"));
        model.setManv(rs.getString("MaNV"));
        model.setNgaytao(rs.getDate("NgayTao"));
        model.setDongia(rs.getFloat("DonGia"));
        return model;
    }
    private List<HoaDon> select(String sql, Object ... args){
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try{
                rs = hepper.query(sql, args);
                while(rs.next()){
                    list.add(readFromResultSet(rs));
                }
            }
            finally {
                        rs.getStatement().getConnection().close();
                        }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
}
