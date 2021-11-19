/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class DialogHelper{
    //Hiển thị thông báo dành cho người dùng 
    // parten là  cửa sổ chứa thông báo
    // message là nội dung thông báo
    public static void  alert(Component parten, String message){
        JOptionPane.showMessageDialog(parten, message,"Dự án 1 - Nhóm 6",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(Component parten, String message){
        int reslut = JOptionPane.showConfirmDialog(parten, message,
                "Dự án 1 - Nhóm 6",JOptionPane.YES_NO_OPTION );
        return reslut == JOptionPane.YES_OPTION;
}
    public static String prompt(Component parten, String message){
        return JOptionPane.showInputDialog(parten, message,"Dự án 1 - Nhóm 6",
                JOptionPane.INFORMATION_MESSAGE);
    }
}