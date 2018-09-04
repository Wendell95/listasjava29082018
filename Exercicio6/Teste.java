/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<CartaoWeb> c = new ArrayList<CartaoWeb>();
        
                    
       
        for(int i=0;i<=0; i++){ 
        
        Aniversario a = new Aniversario("Feliz Aniversario"); 
        
        JOptionPane.showMessageDialog(null,""+a.getDestinatario()); 
           
        DiaDosNamorados d = new DiaDosNamorados("Feliz Dia dos Namorados");
        JOptionPane.showMessageDialog(null,""+d.getDestinatario());
      
        Natal n = new Natal("Feliz Natal");
        JOptionPane.showMessageDialog(null,""+n.getDestinatario()); 
       
        
        c.add(a);
        c.add(d);
        c.add(n);
        
        } }}
      
        
             
                         
       
   

