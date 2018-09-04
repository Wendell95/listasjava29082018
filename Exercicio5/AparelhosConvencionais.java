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
public class AparelhosConvencionais  extends Aparelhoseletronicos{
    private int comprimentocabo;
    private String basefixação;

    public AparelhosConvencionais(String funcionalidade, String particularidade, int comprimentocabo, String basefixacao) {
        super(funcionalidade, particularidade);
        this.comprimentocabo=comprimentocabo;
        this.basefixação=basefixacao;
    }

    public int getComprimentocabo() {
        return comprimentocabo;
    }

    public void setComprimentocabo(int comprimentocabo) {
        this.comprimentocabo = comprimentocabo;
    }

    public String getBasefixação() {
        return basefixação;
    }

    public void setBasefixação(String basefixação) {
        this.basefixação = basefixação;
    }
    
    
    
}
