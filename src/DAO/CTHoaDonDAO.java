/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utils.hepper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CTHoaDonDAO {
    String SELECT_ALL_SQL = "select * from HoaDon";
    
    public List<HoaDonCT> selectAll(){
        return select(SELECT_ALL_SQL);
    }
    private HoaDonCT readFromResultSet(ResultSet rs ) throws SQLException{
        HoaDonCT model = new HoaDonCT();

        return model;
    }
    private List<HoaDonCT> select(String sql, Object ... args){
        List<HoaDonCT> list = new ArrayList<>();
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

    private static class HoaDonCT {

        public HoaDonCT() {
        }
    }
}
