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
public class Tirinha extends Gibi{
    enum Genero{SINGLE_PANEL, DAILY_STRIP, SUNDAY_STRIP, YONKOMA}
    private Genero genero;
    private int numQuadrinhos;
    private String veiculoPrimeiraPublicacao;
    public String getVeiculo(){
        return this.veiculoPrimeiraPublicacao;
    }
    public String getGenero() {
        switch(genero) {
            case SINGLE_PANEL:
                return "Single Panel";
            case DAILY_STRIP:
                return "Daily Strip";
            case SUNDAY_STRIP:
                return "Sunday Strip";
            case YONKOMA:
                return "Yonkoma";
        }
        return null;
    }
    public Tirinha(int id, String nome, String editora, 
                int anoPublicacao, String autor, Genero genero, int numQuadrinhos) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numQuadrinhos = numQuadrinhos;
        this.numVolumes = 1;
        }
}
