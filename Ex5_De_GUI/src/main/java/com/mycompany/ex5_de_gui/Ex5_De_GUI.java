package com.mycompany.ex5_de_gui;

import gui.FrCadPet;


public class Ex5_De_GUI {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadPet().setVisible(true);
            }
        });
        
    }
}
