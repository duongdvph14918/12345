/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utils.hepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ThongKeDAO {
    public List<Object[]> getDoanhThu(int thang){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try{
                String sql = "{call sp_doanhthu (?)}";
                rs = hepper.query(sql, thang);
                while(rs.next()){
                    Object[] model = {
                        rs.getString("nhanvien"),
                        rs.getInt("tongHD"),
                        rs.getFloat("doanhthu"),
                        rs.getFloat("caonhat"),
                        rs.getFloat("thapnhat"),
                            rs.getFloat("trungbinh")
                    };
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
