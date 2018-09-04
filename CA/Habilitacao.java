/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CA;

/**
 *
 * @author aluno
 */
public abstract class Habilitacao {
    private int numeroDeComandos;
    private String endereco;

    public Habilitacao(){}
    
    public Habilitacao(int numeroDeComandos, String endereco){
        this.numeroDeComandos=numeroDeComandos;
        this.endereco=endereco;
    }
    public int getNumeroDeComandos() {
        return numeroDeComandos;
    }

    public void setNumeroDeComandos(int numeroDeComandos) {
        this.numeroDeComandos = numeroDeComandos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public abstract double CalcularIPTU();
     
        
    }

