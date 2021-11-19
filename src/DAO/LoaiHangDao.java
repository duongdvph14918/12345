/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import MODEL.LoaiHang;
import Utils.hepper;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class LoaiHangDao extends EduSyDao<LoaiHang, String>{

    public List<LoaiHang> selectAll() {
       String sql = "select * from LOAIHANG";
        return selectBySql(sql);
    }

    private List<LoaiHang> selectBySql(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

   
   }
   

