/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio62;

import Exercicio6.CartaoWeb;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<CarbonFootprint> ca = new ArrayList<CarbonFootprint>();
        Building b = new Building(13, true, false) {};
                ca.add(b);
                Car c = new Car("Gasolina", "Gol");
                ca.add(c);
                JOptionPane.showMessageDialog(null, "Dados do Building");
                JOptionPane.showMessageDialog(null, ":"+b.getNumerolampadas());
                JOptionPane.showMessageDialog(null, ":"+b.isEnergiarenovavel());
                JOptionPane.showMessageDialog(null, ":"+b.getNumerolampadas());
                JOptionPane.showMessageDialog(null, ":"+b.isArcondicionado());
                
                
                JOptionPane.showMessageDialog(null, "Dados do carro");
                JOptionPane.showMessageDialog(null, ":"+c.getCombustivel());
                JOptionPane.showMessageDialog(null, ":"+c.getModelo());
                
                House h = new House("Amarelo", 3, true, true);
                ca.add(h);
                
                School s = new School("Amarelo", 3, true, true);
                ca.add(s);

    }
    
}
