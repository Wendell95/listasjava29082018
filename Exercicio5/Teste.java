/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

/**
 *
 * @author PC
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Computadores c = new Computadores("Navegar na internet", "Empresas que fabricam", "Banda Larga", "Samsung");
        
        AparelhosConvencionais ac = new AparelhosConvencionais ("Substituir aparelhos antigos", "Fabricado em lojas", 35, "Aparelhos móveis");
        
        celulares ce = new celulares("Fazer ligações", "Uso pessoal", "100%", "3,25 Hertz");
        
        Telefonia t = new Telefonia ("Aparelhos fixos para fazer ligações", "Uso residencial", "Preta", "Quadrado");
        
        
        
        
        System.out.println("************DADOS DOS COMPUTADORES*******************");
        
        System.out.println("Funcionalidade:"+c.getFuncionalidade());
        System.out.println("Particularidade:"+c.getParticularidade());
        System.out.println("Tipo da internet:"+c.getTipodeinternet());
        System.out.println("Tipo do computador:"+c.getTipocomputador());
        
        System.out.println("************DADOS DOS APARELHOS CONVENCIONAIS***********");
        
        System.out.println("Funcionalidade:"+ac.getFuncionalidade());
        System.out.println("Particularidade:"+ac.getParticularidade());
        System.out.println("Comprimento do cabo:"+ac.getComprimentocabo());
        System.out.println("Base da fixação:"+ac.getBasefixação());
        
        System.out.println("************DADOS DOS CELULARES***********************");
        
      
        System.out.println("Funcionalidade:"+ce.getFuncionalidade());  
        System.out.println("Particularidade:"+ce.getParticularidade());
        System.out.println("Bateria:"+ce.getBateria());
        System.out.println("Frequência de transmissão:"+ce.getFrequenciadetransmissao());
        
        System.out.println("************DADOS DA TELEFONIA************************");
                
        System.out.println("Funcionalidade:"+t.getFuncionalidade());
        System.out.println("Particularidade:"+t.getParticularidade());
        System.out.println("Cor:"+t.getCor());
        System.out.println("Formato:"+t.getFormato());
    }
    
}
