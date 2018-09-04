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
public class Aparelhoseletronicos {
    private String funcionalidade;
    private String particularidade;
    
    
    public Aparelhoseletronicos (String funcionalidade, String particularidade){
        this.funcionalidade=funcionalidade;
        this.particularidade=particularidade;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public String getParticularidade() {
        return particularidade;
    }

    public void setParticularidade(String particularidade) {
        this.particularidade = particularidade;
    }
            
}
