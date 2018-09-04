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
public class Computadores extends Aparelhoseletronicos{
    private String tipodeinternet;
    private String tipocomputador;

    public Computadores(String funcionalidade, String particularidade, String tipodeinternet, String tipocomputador) {
        super(funcionalidade, particularidade);
        this.tipodeinternet=tipodeinternet;
        this.tipocomputador=tipocomputador;
    }

    public String getTipodeinternet() {
        return tipodeinternet;
    }

    public void setTipodeinternet(String tipodeinternet) {
        this.tipodeinternet = tipodeinternet;
    }

    public String getTipocomputador() {
        return tipocomputador;
    }

    public void setTipocomputador(String tipocomputador) {
        this.tipocomputador = tipocomputador;
    }
    
    
}
