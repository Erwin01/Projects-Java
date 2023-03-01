/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApagarEquipo;

import javax.swing.JOptionPane;

/**
 *
 * @author ERWIN
 */
public class Apagar {
    
    public void Ejecutar(String cmd){
        
        try {
            
            Runtime.getRuntime().exec(cmd);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error, no fue posible conectarse al equipo." + e.getMessage());
        }
        
    }
    
}
