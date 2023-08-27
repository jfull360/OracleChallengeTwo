package com.oracle.api.frames;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author JORGE DOMINGUEZ
 */
public class utils {

    utils() {
    }

    protected void SetImage(JLabel labelName, String image) {
        ImageIcon imageicon = new ImageIcon(image);
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
    }

    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (Exception excepcion) {
            resultado = false;
        }
        return resultado;
    }
    
     public static boolean containsNumber(String cadena) {
        return cadena.matches(".*[0-9].*") || cadena.matches(".*[0-9]")
                || cadena.matches("[0-9].*") || cadena.matches("[0-9]");
    }

    protected static void exit() {
        JFrame f = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(f, "¿Esta seguro que desea salir?",
                "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

}
