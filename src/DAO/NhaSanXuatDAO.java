/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.NhaSanXuat;
import Utils.hepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaSanXuatDAO extends EduSysDAO<NhaSanXuat, String>{
  String select_all_sql = "select * from NHASANXUAT";
    @Override
    public void insert(NhaSanXuat entity) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhaSanXuat entity) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhaSanXuat> selectAll() {
	return this.selectBySQL(select_all_sql)
;    }

    @Override
    public NhaSanXuat selectByID(String key) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<NhaSanXuat> selectBySQL(String sql, Object... args) {
	List<NhaSanXuat> list = new ArrayList<>();
	try {
	    ResultSet rs = hepper.query(sql, args);
	    while (rs.next()) {		
		NhaSanXuat nsx = new NhaSanXuat();
		nsx.setMANSX(rs.getString("MANSX"));
		list.add(nsx);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (Exception e) {
	    throw new RuntimeException();
	}
    }
    
}
