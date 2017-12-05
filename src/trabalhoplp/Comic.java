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
public class Comic extends Gibi implements ProprietarioDeGenero{
    public static final String[] GENEROS_COMIC  = {"Super-Herói", "Faroeste", "Horror", "Crime"};
    public static final String[] ERAS_COMIC = {"Platina", "Ouro", "Prata", "Bronze", "Ferro"};
    private int numPaginas;
    public String era;
    
    public Comic(int id, String nome, String editora, 
            int anoPublicacao, String autor, String genero, int numPaginas,
            int numVolumes, String era) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.numVolumes = numVolumes;
        this.era = era;
    }

    @Override
    public String getGenero() {
        return super.genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getEra() {
        return era;
    }
}
