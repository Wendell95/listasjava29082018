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
public class celulares extends Aparelhoseletronicos {
    private String bateria;
    private String frequenciadetransmissao;

    public celulares(String funcionalidade, String particularidade, String bateria, String frequenciadetransmissao) {
        super(funcionalidade, particularidade);
        this.bateria=bateria;
        this.frequenciadetransmissao=frequenciadetransmissao;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getFrequenciadetransmissao() {
        return frequenciadetransmissao;
    }

    public void setFrequenciadetransmissao(String frequenciadetransmissao) {
        this.frequenciadetransmissao = frequenciadetransmissao;
    }
}
