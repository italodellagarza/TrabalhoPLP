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
public class Manga extends Gibi {
    private enum Genero{MAHO_SHOJO, MECHA, HAREM, ECCHI}
    private Genero genero;
    public String getGenero() {
        switch(genero) {
            case MAHO_SHOJO:
                return "Mahō shōjo";
            case MECHA:
                return "Mecha";
            case HAREM:
                return "Harém";
            case ECCHI:
                return "Ecchi";
        }
        return null;
    }
    
    public Genero generoDoManga(String gen){
        if (gen.equals("Mahō shōjo")) {
            return Genero.MAHO_SHOJO;
        }
        else if(gen.equals("Mecha")){
            return Genero.MECHA;
        }
        else if(gen.equals("Harém")){
            return Genero.HAREM;
        }
        else{
            return Genero.ECCHI;
        }
    }

    private enum Tipologia{KODOMO, SHONEN, SHOUJO, SEINEN, JOSEI}
    private Tipologia tipologia;
    public String getTipologia() {
        switch(tipologia) {
            case KODOMO:
                return "Kodomo";
            case SHONEN:
                return "Shonen";
            case SHOUJO:
                return "Shoujo";
            case SEINEN:
                return "Seinen";
            case JOSEI:
                return "Josei";
        }
        return null;
    }
    
    public Tipologia TipoogiaDomanga(String tip){
        if (tip.equals("Kodomo")) {
            return Tipologia.KODOMO;
        }
        else if (tip.equals("Shonen")) {
            return Tipologia.SHONEN;
        }
        else if (tip.equals("Shoujo")) {
            return Tipologia.SHOUJO;
        }
        else if (tip.equals("Seinen")) {
            return Tipologia.SEINEN;
        }
        else{
            return Tipologia.JOSEI;
        }
    }
    
    public Manga(int id, String nome, String editora, 
            int anoPublicacao, String autor, Genero genero, int numVolumes, Tipologia tipologia) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numVolumes = numVolumes;
        this.tipologia = tipologia;
    }
}
