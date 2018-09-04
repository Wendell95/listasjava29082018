/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CA;

/**
 *
 * @author aluno
 */
public class Apartamento extends Habilitacao {
    private double valorCondominio;
    
    public Apartamento(){
        
    }
   public Apartamento(int numeroComandos, String endereco, double valorCondominio){
       super(numeroComandos, endereco);
       this.valorCondominio=valorCondominio;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    
    
   
    public double CalcularIPTU(){
         return valorCondominio;
}}