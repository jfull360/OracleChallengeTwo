/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle.api;

import com.oracle.api.frames.FrameLogin;
import java.awt.EventQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Component
public class Runner implements  CommandLineRunner{
    
    private final FrameLogin frameL;
    
    @Autowired
    public Runner (FrameLogin f){
        this.frameL=f;
    }

    @Override
    public void run(String... args) {
        EventQueue.invokeLater(() -> frameL.setVisible(true));
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
