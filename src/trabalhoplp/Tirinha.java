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
public class Tirinha extends Gibi implements ProprietarioDeGenero{
    private int numQuadrinhos;
    private String veiculoPrimeiraPublicacao;
    
    public Tirinha(int id, String nome, String editora, int anoPublicacao, String autor, String genero, int numQuadrinhos) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numQuadrinhos = numQuadrinhos;
        this.numVolumes = 1;
    }
    
    public int getNumQuadrinhos() {
        return numQuadrinhos;
    }
    
    public String getVeiculo(){
        return this.veiculoPrimeiraPublicacao;
    }
    
    public static final String[] GENEROS_TIRINHA = {"Single Panel","Daily Strip","Sunday Strip","Yonkoma"};
    
    @Override
    public String getGenero() {
        return super.genero;
    }
}
