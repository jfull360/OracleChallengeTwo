package com.oracle.api;

import com.oracle.api.frames.FrameStart;
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
    
    private final FrameStart frameL;
    
    @Autowired
    public Runner (FrameStart f){
        this.frameL=f;
    }

    @Override
    public void run(String... args) {
        EventQueue.invokeLater(() -> frameL.setVisible(true));
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
