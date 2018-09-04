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
public class Car implements CarbonFootprint{
    private String combustivel;
    private String modelo;

   
    public void getCarbonFootprint(){
       this.combustivel=combustivel;
       this.modelo=modelo;
    }
    public Car(String combustivel, String modelo){
        this.combustivel=combustivel;
        this.modelo=modelo;
        
    }
    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
