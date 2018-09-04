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
public abstract class Building implements CarbonFootprint {
    private int numeropessoas;
    private boolean energiarenovavel;
    private int numerolampadas;
    private boolean arcondicionado;
    
    
    public Building(int numeropessoas, boolean energiarenovavel, boolean arcondicionado){
        this.numeropessoas=numeropessoas;
        this.energiarenovavel=energiarenovavel;
        this.arcondicionado=arcondicionado;
        
    }

    public int getNumeropessoas() {
        return numeropessoas;
    }

    public void setNumeropessoas(int numeropessoas) {
        this.numeropessoas = numeropessoas;
    }

    public boolean isEnergiarenovavel() {
        return energiarenovavel;
    }

    public void setEnergiarenovavel(boolean energiarenovavel) {
        this.energiarenovavel = energiarenovavel;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }
    public void getCarbonFootprint(){
     
    }

    public int getNumerolampadas() {
        return numerolampadas;
    }

    public void setNumerolampadas(int numerolampadas) {
        this.numerolampadas = numerolampadas;
    }
}
