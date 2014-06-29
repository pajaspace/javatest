/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxswingapplication12;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;

public class MujProgram extends JFrame {
    
    MujProgram() {
        this.setTitle("Můj Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MujPanel panel = new MujPanel();
        this.add(panel);
        
        this.setSize(400, 300);
    }
    
    public static void main(String[] args) {
        MujProgram program = new MujProgram();
        program.setVisible(true);
    }
}