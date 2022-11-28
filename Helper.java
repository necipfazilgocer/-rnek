package com.patikadev.Helper;
import javax.swing.*;
import java.awt.*;
public class Helper {
    public static int ScreenCenterPoint(String eksen, Dimension size) {
        int point ;
        switch (eksen) {
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
             point=(Toolkit.getDefaultToolkit().getScreenSize().height-size.width)/2;
                break;
            default:
                point=0;
        }
        return point;
    }

    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }

    public static void showMsg(String str){
        optionPageTR();
        String msg;
        String title;
        switch (str){
            case "fill":
                msg= "Lütfen tüm alanları doldurunuz.";
                title="HATA";
            break;
            case "done":
                msg ="İşlem başarılı.";
                title="SONUÇ";
                break;
            case "error":
                msg="Bir hata oluştu";
                title="Hata";
            default:
                msg=str;
                title=str;
        }
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str){
        optionPageTR();
        String msg;
        switch (str){

            case "sure":
                msg="Bu işlemi gerçekleştirmek istediğine emin misin?";
                break;
            default:
                msg=str;
        }

        return  JOptionPane.showConfirmDialog(null,msg,"son kararın mı",JOptionPane.YES_NO_OPTION)==0;
    }


    public static void optionPageTR(){
        UIManager.put("OptionPane.okButtonText","Tamam");
        UIManager.put("OptıonPane.YesButtonText","Evet");
        UIManager.put("OptıonPane.NoButtonText","Hayır");
    }



}
