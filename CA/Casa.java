/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CA;

/**
 *
 * @author aluno
 */
public class Casa extends Habilitacao {
    private double tamanhoQuintal;

      public Casa(){
      }
    public Casa(int numeroComandos, String endereco, double tamanhoQuintal){
        super(numeroComandos, endereco);
          this.tamanhoQuintal=tamanhoQuintal;
       
        }
    public double getTamanhoQuintal() {
        return tamanhoQuintal;
    }

    public void setTamanhoQuintal(double tamanhoQuintal) {
        this.tamanhoQuintal = tamanhoQuintal;
    }
    
    


   
    
    public double CalcularIPTU(){
          return tamanhoQuintal;

}}

