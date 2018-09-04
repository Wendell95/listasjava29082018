/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio62;

/**
 *
 * @author PC
 */
public class House extends Building{
    private String cor;

    public House(String cor, int numeropessoas, boolean energiarenovavel, boolean arcondicionado) {
        super(numeropessoas, energiarenovavel, arcondicionado);
        this.cor=cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
