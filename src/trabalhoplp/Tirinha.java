/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe Tirinha (Tirinha.java)
 */
package trabalhoplp;

/**
 * Classe Tirinha que herda atributos de Gibi e implementa ProprietarioDeGenero.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe
 */
public class Tirinha extends Gibi implements ProprietarioDeGenero{
    private int numQuadrinhos;
    private String veiculoPrimeiraPublicacao;
    
    public Tirinha(int id, String nome, String editora, int anoPublicacao,
            String autor, String genero, int numQuadrinhos, String primPub) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numQuadrinhos = numQuadrinhos;
        this.numVolumes = 1;
        this.veiculoPrimeiraPublicacao = primPub;
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
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
               this.genero + "\n" +
               this.numQuadrinhos + "\n" +
               1 + "\n" +
               this.veiculoPrimeiraPublicacao;
    }
}
