/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe Ramos Palmuti
 * Classe Tirinha (Tirinha.java)
 */
package trabalhoplp;

/**
 * Classe Tirinha que herda atributos de Gibi e implementa ProprietarioDeGenero.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe Ramos Palmuti
 */
public class Tirinha extends Gibi implements ProprietarioDeGenero{
    private int numQuadrinhos;
    private String veiculoPrimeiraPublicacao;
    
    /**
     * Construtor de classe.
     * @param id Identificador (da superclasse).
     * @param nome Nome (da superclasse).
     * @param editora Editora (da superclasse).
     * @param anoPublicacao Ano de Publicação (da superclasse).
     * @param autor Autor (da superclasse).
     * @param genero Gênero da tirinha.
     * @param numQuadrinhos Número de quadrinhos da Tirinha.
     * @param primPub Veículo de primeira publicação da Tirinha.
     */
    public Tirinha(int id, String nome, String editora, int anoPublicacao,
            String autor, String genero, int numQuadrinhos, String primPub) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numQuadrinhos = numQuadrinhos;
        this.numVolumes = 1;
        this.veiculoPrimeiraPublicacao = primPub;
    }
    
    /**
     * Retorna o número de quadrinhos.
     * @return número de quadrinhos.
     */
    public int getNumQuadrinhos() {
        return numQuadrinhos;
    }
    
    /**
     * Retorna o veículo da primeira publicação.
     * @return veículo da primeira publicação.
     */
    public String getVeiculo(){
        return this.veiculoPrimeiraPublicacao;
    }
    
 
    public static final String[] GENEROS_TIRINHA = {
        "Single Panel","Daily Strip","Sunday Strip","Yonkoma"
    };
    
    /**
     * Retorna o gênero da tirinha.
     * @return gênero da tirinha.
     */
    @Override
    public String getGenero() {
        return super.genero;
    }
    
    /**
     * Método auxiliar para impressão em arquivos.
     * @return String para impressão em arquivos.
     */
    @Override
    public String toString() {
        return super.toString() + "\n" +
               this.genero + "\n" +
               this.numQuadrinhos + "\n" +
               1 + "\n" +
               this.veiculoPrimeiraPublicacao;
    }
}
