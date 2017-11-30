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
public class Comic extends Gibi{
    private enum Genero{SUPER_HEROI, FAROESTE, HORROR, CRIME}
    private Genero genero;
    private int numPaginas;
    public String getGenero() {
        switch(genero) {
            case SUPER_HEROI:
                return "Super-Heroi";
            case FAROESTE:
                return "Faroeste";
            case HORROR:
                return "Horror";
            case CRIME:
                return "Crime";
        }
        return null;
    }
    private enum Era{PLATINA, OURO, PRATA, BRONZE, FERRO}
    private Era era;
    public String getEra() {
        switch(era) {
            case PLATINA:
                return "Platina";
            case OURO:
                return "Ouro";
            case PRATA:
                return "Prata";
            case BRONZE:
                return "Bronze";
            case FERRO:
                return "Ferro";
        }
        return null;
    }
    public Comic(int id, String nome, String editora, 
            int anoPublicacao, String autor, Genero genero, int numPaginas,
            int numVolumes, Era era) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.numVolumes = numVolumes;
        this.era = era;
    }
}
