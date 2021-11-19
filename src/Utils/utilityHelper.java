/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import DAO.SanPhamDAO;
import MODEL.SanPham;
import java.awt.Color;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class utilityHelper {

    public static boolean checkpass(JPasswordField txt) {
	if (txt.getPassword().length > 0) {
	    return true;
	} else {
	    txt.setBackground(Color.yellow);
	    JOptionPane.showMessageDialog(txt.getRootPane(), "Không được để trống mật khẩu");
	    return false;
	}

    }

    public static boolean checkma(JTextField txt) {
	String id = txt.getText();
	String rgx = "[a-zA-Z0-9]{5}";
	if (id.matches(rgx)) {
	    return true;
	} else {
	    txt.setBackground(Color.yellow);
	    JOptionPane.showMessageDialog(txt.getRootPane(), txt.getName() + "phải có đúng 5 kí tự\nchữ thường, chữ hoa hoặc số");
	    return false;
	}
    }

    public static boolean checknull(JTextField txt) {
	txt.setBackground(Color.white);
	if (txt.getText().trim().length() > 0) {
	    return true;
	} else {
	    txt.setBackground(Color.yellow);
	    JOptionPane.showMessageDialog(txt.getRootPane(), "Vui lòng không để trống thông tin");
	    return false;
	}
    }
    //gồm 10 số 
    //các đầu 3 số của nhà mạng

    public static boolean checkSDT(JTextField txt) {
	txt.setBackground(white);
	String id = txt.getText();
	String rgx = "(086|096|097|098|032|033|034|035|036|037|038|039|089|090|093|070|079|077|078|076|088|091|094|083|084|085|081|082|092|056|058|099|059)[0-9]{7}";
	if (id.matches(rgx)) {
	    return true;
	} else {
	    txt.setBackground(pink);
	    JOptionPane.showMessageDialog(txt.getRootPane(), txt.getName() + " phải gồm 10 số.");
	    return false;
	}
    }

    public static boolean checkEmail(JTextField txt) {
	txt.setBackground(white);
	String id = txt.getText();
	String rgx = "^[a-zA-Z0-9_+&*-]+(?:\\."
		+ "[a-zA-Z0-9_+&*-]+)*@"
		+ "(?:[a-zA-Z0-9-]+\\.)+[a-z"
		+ "A-Z]{2,7}$";//Biểu Thúc chính quy;
	if (id.matches(rgx)) {
	    return true;
	} else {
	    txt.setBackground(pink);
	    JOptionPane.showMessageDialog(txt.getRootPane(), "Email không đúng định dạng");
	    return false;
	}
    }

    public static boolean checksoluong(JTextField txt) {
	txt.setBackground(white);
	try {
	    int soluong = Integer.valueOf(txt.getText());
	    if (soluong >= 0) {

		return true;
	    } else {
		txt.setBackground(pink);
		JOptionPane.showMessageDialog(txt.getRootPane(), txt.getName() + "Vui lòng nhập số lượng lớn hơn hoạc bằng 0");
		return false;
	    }
	} catch (NumberFormatException e) {
	    txt.setBackground(pink);
	    JOptionPane.showMessageDialog(txt.getRootPane(), txt.getName() + "Vui lòng nhập số lượng là số");
	    return false;
	}
    }

    public static boolean checkdongia(JTextField txt) {
	txt.setBackground(white);
	try {
	    Double don = Double.valueOf(txt.getText());
	    if (don >= 0) {
		return true;
	    } else {
		txt.setBackground(pink);
		JOptionPane.showMessageDialog(txt.getRootPane(), txt.getName() + "Vui lòng nhập số lượng đơn giá lớn hơn 0");
		return false;
	    }
	} catch (NumberFormatException e) {
	    txt.setBackground(pink);
	    JOptionPane.showMessageDialog(txt.getRootPane(), txt.getName() + "Vui lòng không nhập chữ");
	    return false;
	}
    }
    SanPhamDAO dao = new SanPhamDAO();

}
