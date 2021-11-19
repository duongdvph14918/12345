/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DAO.EduSysDAO;
import MODEL.NhaPhanPhoi;
import Utils.hepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class NhaPhanPhoiDAO extends EduSysDAO<NhaPhanPhoi, String>{

    String insert ="INSERT INTO NHAPHANPHOI "
            + "(MANHAPHANPHOI,TENNHAPHANPHOI,SODIENTHOAI,EMAIL,DIACHI) VALUES(?,?,?,?,?)";
    String update = "UPDATE NHAPHANPHOI "
            + "SET TENNHAPHANPHOI = ?, SODIENTHOAI = ? , EMAIL = ?, DIACHI = ?, WHERE MANHAPHANPHOI = ?";
    String delete = "delete from NHAPHANPHOI WHERE MANHAPHANPHOI = ?";
    String select_all = "Select * from NHAPHANPHOI ";
    String select_byID = "Select * from NHAPHANPHOI WHERE MANHAPHANPHOI = ?";
    @Override
    public void insert(NhaPhanPhoi entity) {
        try {
            hepper.update(insert, 
                    entity.getMaNhaphanphoi(),
                    entity.getTenNhaphanphoi(),
                    entity.getSdt(),
                    entity.getEmail(),
                    entity.getDiaChi());
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    @Override
    public void update(NhaPhanPhoi entity) {
        try {
            hepper.update(update, 
                    entity.getTenNhaphanphoi(),
                    entity.getSdt(),
                    entity.getEmail(),
                    entity.getDiaChi(),
                    entity.getMaNhaphanphoi());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            hepper.update(delete, 
                    id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<NhaPhanPhoi> selectAll() {
        return this.selectBySQL(select_all);
    }

    @Override
    public NhaPhanPhoi selectByID(String id) {
        List<NhaPhanPhoi> list = this.selectBySQL(select_byID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    List<NhaPhanPhoi> selectBySQL(String sql, Object... args) {
        List<NhaPhanPhoi> list = new ArrayList<>();
        try {
            ResultSet rs = hepper.query(sql, args);
            while(rs.next()){
                NhaPhanPhoi npp = new NhaPhanPhoi();
                npp.setMaNhaphanphoi(rs.getString("MANHAPHANPHOI"));
                npp.setTenNhaphanphoi(rs.getString("TENNHAPHANPHOI"));
                npp.setSdt(rs.getString("SODIENTHOAI"));
                npp.setDiaChi(rs.getString("DIACHI"));
                npp.setEmail(rs.getString("EMAIL"));
                list.add(npp);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
       
    }
    public List<NhaPhanPhoi> selectByKeyWord(String keyword){
        String sql = "Select * from NHAPHANPHOI WHERE MANHAPHANPHOI LIKE N ?";
        return this.selectBySQL(sql, "% "+ keyword + " %");
    }
}
