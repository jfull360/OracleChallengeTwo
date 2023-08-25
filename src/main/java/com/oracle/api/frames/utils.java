/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle.api.frames;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author JORGE DOMINGUEZ
 */
public class utils {

    utils() {}

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

}
