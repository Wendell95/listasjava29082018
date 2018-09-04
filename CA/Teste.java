/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CA;

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
        
             
                               
                Casa C = new Casa(2, "12", 300.0);
                        
                        Apartamento A = new Apartamento(5, "14", 200.0);
        
        
                       JOptionPane.showMessageDialog(null, "Dados da casa");
                       
                       
                       JOptionPane.showMessageDialog(null, "numero comandos:"+C.getNumeroDeComandos());
                       JOptionPane.showMessageDialog(null, "Endereco:"+C.getEndereco());
                       JOptionPane.showMessageDialog(null, "Tamanho do quintal:"+C.getTamanhoQuintal());
                      
                       
                       JOptionPane.showMessageDialog(null, "Dados do apartamento");
                       
                       JOptionPane.showMessageDialog(null, " numero comandos: "+A.getNumeroDeComandos());
                      JOptionPane.showMessageDialog(null, "Endereco:"+A.getEndereco());
                      JOptionPane.showMessageDialog(null, "Valor do Condominio:"+A.getValorCondominio());
    

    
    }
}
