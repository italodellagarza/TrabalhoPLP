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
public class Manga extends Gibi implements ProprietarioDeGenero  {
    
    public static final String[] TIPOLOGIAS_MANGA = {"Kodomo","Shonen","Shoujo","Seinen"};
    private String tipologia;
    
    public String getTipologia() {
        return tipologia;
    }
    
    public Manga(int id, String nome, String editora, 
            int anoPublicacao, String autor, String genero, int numVolumes, String tipologia) {
        super(id, nome, editora, anoPublicacao, autor);
        
        this.numVolumes = numVolumes;
        this.tipologia = tipologia;
    }
    public static String[] GENEROS_MANGA = {"Mahō shōjo","Mecha", "Harém","Ecchi"};
    
    @Override
    public String getGenero() {
        return super.genero;
    }
}

