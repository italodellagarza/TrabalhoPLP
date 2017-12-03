/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoplp;

/**
 *
 * @author italo
 */
public class Endereco {
    public String cidade;
    public String pais;
    
    public Endereco(String cidade, String pais) {
        this.cidade = cidade;
        this.pais = pais;
    }
    @Override
    public String toString() {
        return (cidade + ", " + pais);
    }
}
