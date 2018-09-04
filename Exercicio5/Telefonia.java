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
public class Telefonia extends Aparelhoseletronicos{
    private String cor;
    private String formato;

    public Telefonia(String funcionalidade, String particularidade, String cor, String formato) {
        super(funcionalidade, particularidade);
        this.cor=cor;
        this.formato=formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
}
