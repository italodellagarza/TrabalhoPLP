/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoplp;


import java.io.BufferedReader;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Usaurios
 */
public class CadastroGibis {
    private int idGibis; // Para inserção automática de ids
    private int idComics;
    private int idMangas;
    private int idTirinhas;
    private int idEditoras;
    
    private final ArrayList<Gibi> listaGibis;
    private final ArrayList<Comic> listaComics;
    private final ArrayList<Manga> listaMangas;
    private final ArrayList<Tirinha> listaTirinhas;
    private final ArrayList<Editora> listaEditoras;
    
    public CadastroGibis(){
        idGibis = -1;
        idComics = -1;
        idMangas = -1;
        idTirinhas = -1;
        idEditoras = -1;
        listaGibis = new ArrayList();
        listaComics = new ArrayList();
        listaMangas = new ArrayList();
        listaTirinhas = new ArrayList();
        listaEditoras = new ArrayList();
    }
    
    public void adicionarGibi(String nome, String editora, int anoPublicacao, String autor) {
        Gibi g = new Gibi(this.idGibis++, nome, editora, anoPublicacao, autor);
        this.listaGibis.add(g);
    }
    /**
     *  Função para busca de gibis
     * @param nomeGibi nome do Gibi.
     * @return tabela de gibis com tal id.
     */
    public Object[][] buscarGibi(String nomeGibi) {
        if(this.listaGibis.isEmpty()) 
            return new Object[][]{{null, null, null, null, null}};
        Object [][] res = new Object[this.listaGibis.size()][5];
        for (int i = 0; i < this.listaGibis.size(); i++) {
            if (this.listaGibis.get(i).getNome().equals(nomeGibi)) {
                res[i][0] = this.listaGibis.get(i).getId();
                res[i][1] = this.listaGibis.get(i).getNome();
                res[i][2] = this.listaGibis.get(i).getEditora();
                res[i][3] = this.listaGibis.get(i).getAnoPublicacao();
                res[i][4] = this.listaGibis.get(i).getAutor();
            }
        }
        return res;
    }
    /*
    if(listaGibis.get(i).getNome().contains(nomePesquisa)) {
        res[i] = listaGibis.get(i).toRow(); // toRow() método que retorna uma linha de tabela.
    }
    */
    
    /**
     * 
     * @param nomeGibi remove pelo id
     */
    public void removerGibi(String nomeGibi) {
        if(this.listaGibis.isEmpty())
        {}
        else {
            for(Gibi g : this.listaGibis) {
                if (g.getNome().equals(nomeGibi)) {
                    this.listaGibis.remove(g);
                }
            }
        }
    }
    
    public Object[][] listarGibis() {
        if(this.listaGibis.isEmpty()) 
            return new Object[][]{{null, null, null, null, null}};
        Object [][] res = new Object[this.listaGibis.size()][5];
        for (int i = 0; i < this.listaGibis.size(); i++) {
            res[i][0] = this.listaGibis.get(i).getId();
            res[i][1] = this.listaGibis.get(i).getNome();
            res[i][2] = this.listaGibis.get(i).getEditora();
            res[i][3] = this.listaGibis.get(i).getAnoPublicacao();
            res[i][4] = this.listaGibis.get(i).getAutor();
        }
        return res;
    }
    
    public void gravarGibisEmArquivo() {
        
    }
    
    public void carregarGibisDeArquivo() {
        
    }
    
    //Métodos para Comic
    
    public void adicionarComic(String nome, String editora, int anoPublicacao, String autor, String genero, int numPaginas,int numVolumes, String era) {
        Comic c = new Comic(this.idComics++, nome, editora, anoPublicacao, autor, genero, numPaginas, numVolumes, era);
        this.listaComics.add(c);
    }
    
    public Object[][] buscarComic(String nomeComic) {
        if(this.listaComics.isEmpty())
            return new Object[][]{{null, null, null, null, null, null, null, null, null}};
        Object [][] res = new Object[this.listaComics.size()][9];
        for (int i = 0; i < this.listaComics.size(); i++) {
            if (this.listaComics.get(i).getNome().equals(nomeComic)) {
                res[i][0] = this.listaComics.get(i).getId();
                res[i][1] = this.listaComics.get(i).getNome();
                res[i][2] = this.listaComics.get(i).getEditora();
                res[i][3] = this.listaComics.get(i).getAnoPublicacao();
                res[i][4] = this.listaComics.get(i).getAutor();
                res[i][5] = this.listaComics.get(i).genero;
                res[i][6] = this.listaComics.get(i).getNumPaginas();
                res[i][7] = this.listaComics.get(i).numVolumes;
                res[i][8] = this.listaComics.get(i).getEra();
            }
        }
        return res;
    }
    
    public void removerComic(String nomeComic) {
        if(this.listaComics.isEmpty())
        {}
        else {
            for(Comic c : this.listaComics) {
                if (c.getNome().equals(nomeComic)) {
                    this.listaComics.remove(c);
                }
            }
        }
    }
    
    public Object[][] listarComics() {
        if(this.listaComics.isEmpty())
            return new Object[][]{{null, null, null, null, null, null, null, null, null}};
        Object [][] res = new Object[this.listaComics.size()][9];
        for (int i = 0; i < this.listaComics.size(); i++) {
            res[i][0] = this.listaComics.get(i).getId();
            res[i][1] = this.listaComics.get(i).getNome();
            res[i][2] = this.listaComics.get(i).getEditora();
            res[i][3] = this.listaComics.get(i).getAnoPublicacao();
            res[i][4] = this.listaComics.get(i).getAutor();
            res[i][5] = this.listaComics.get(i).genero;
            res[i][6] = this.listaComics.get(i).getNumPaginas();
            res[i][7] = this.listaComics.get(i).numVolumes;
            res[i][8] = this.listaComics.get(i).getEra();
        }
        return res;
    }
    
    //Métodos para Manga
    
    public void adicionarManga(String nome, String editora, int anoPublicacao, String autor, String genero, int numVolumes, String tipologia) {
        Manga m = new Manga(this.idMangas++, nome, editora, anoPublicacao, autor, genero, numVolumes, tipologia);
        this.listaMangas.add(m);
    }
    
    public Object[][] buscarManga(String nomeManga) {
        if(this.listaMangas.isEmpty())
            return new Object[][]{{null, null, null, null, null, null, null, null}};
        Object [][] res = new Object[this.listaMangas.size()][8];
        for (int i = 0; i < this.listaMangas.size(); i++) {
            if (this.listaMangas.get(i).getNome().equals(nomeManga)) {
                res[i][0] = this.listaMangas.get(i).getId();
                res[i][1] = this.listaMangas.get(i).getNome();
                res[i][2] = this.listaMangas.get(i).getEditora();
                res[i][3] = this.listaMangas.get(i).getAnoPublicacao();
                res[i][4] = this.listaMangas.get(i).getAutor();
                res[i][5] = this.listaMangas.get(i).genero;
                res[i][6] = this.listaMangas.get(i).numVolumes;
                res[i][7] = this.listaMangas.get(i).getTipologia();
            }
        }
        return res;
    }
    
    public void removerManga(String nomeManga) {
        if(this.listaMangas.isEmpty())
        {}
        else {
            for(Manga m : this.listaMangas) {
                if (m.getNome().equals(nomeManga)) {
                    this.listaMangas.remove(m);
                }
            }
        }
    }
    
    public Object[][] listarMangas() {
        if(this.listaMangas.isEmpty())
            return new Object[][]{{null, null, null, null, null, null, null, null}};
        Object [][] res = new Object[this.listaMangas.size()][8];
        for (int i = 0; i < this.listaMangas.size(); i++) {
                res[i][0] = this.listaMangas.get(i).getId();
                res[i][1] = this.listaMangas.get(i).getNome();
                res[i][2] = this.listaMangas.get(i).getEditora();
                res[i][3] = this.listaMangas.get(i).getAnoPublicacao();
                res[i][4] = this.listaMangas.get(i).getAutor();
                res[i][5] = this.listaMangas.get(i).genero;
                res[i][6] = this.listaMangas.get(i).numVolumes;
                res[i][7] = this.listaMangas.get(i).getTipologia();
        }
        return res;
    }
    
    //Métodos para Tirinha
    
    public void adicionarTirinha(String nome, String editora, int anoPublicacao, String autor, String genero, int numQuadrinhos) {
        Tirinha t = new Tirinha(this.idTirinhas++, nome, editora, anoPublicacao, autor, genero, numQuadrinhos);
        this.listaTirinhas.add(t);
    }
    
    public Object[][] buscarTirinha(String nomeTirinha) {
        if(this.listaTirinhas.isEmpty())
            return new Object[][]{{null, null, null, null, null, null, null}};
        Object [][] res = new Object[this.listaTirinhas.size()][7];
        for (int i = 0; i < this.listaTirinhas.size(); i++) {
            if (this.listaTirinhas.get(i).getNome().equals(nomeTirinha)) {
                res[i][0] = this.listaTirinhas.get(i).getId();
                res[i][1] = this.listaTirinhas.get(i).getNome();
                res[i][2] = this.listaTirinhas.get(i).getEditora();
                res[i][3] = this.listaTirinhas.get(i).getAnoPublicacao();
                res[i][4] = this.listaTirinhas.get(i).getAutor();
                res[i][5] = this.listaTirinhas.get(i).genero;
                res[i][6] = this.listaTirinhas.get(i).getNumQuadrinhos();
            }
        }
        return res;
    }
    
    public void removerTirinha(String nomeTirinha) {
        if(this.listaTirinhas.isEmpty())
        {}
        else {
            for(Tirinha t : this.listaTirinhas) {
                if (t.getNome().equals(nomeTirinha)) {
                    this.listaTirinhas.remove(t);
                }
            }
        }
    }
    
    public Object[][] listarTirinha() {
        if(this.listaTirinhas.isEmpty())
            return new Object[][]{{null, null, null, null, null, null, null}};
        Object [][] res = new Object[this.listaTirinhas.size()][7];
        for (int i = 0; i < this.listaTirinhas.size(); i++) {
            res[i][0] = this.listaTirinhas.get(i).getId();
            res[i][1] = this.listaTirinhas.get(i).getNome();
            res[i][2] = this.listaTirinhas.get(i).getEditora();
            res[i][3] = this.listaTirinhas.get(i).getAnoPublicacao();
            res[i][4] = this.listaTirinhas.get(i).getAutor();
            res[i][5] = this.listaTirinhas.get(i).genero;
            res[i][6] = this.listaTirinhas.get(i).getNumQuadrinhos();
        }
        return res;
    }
    
    //Métodos para Editora
    
    public void adicionarEditora(String nome, Endereco end, String tel) {
        listaEditoras.add(new Editora((++idEditoras), nome, end, Integer.parseInt(tel)));
    }
    public void removerEditora(Editora e) {
        if(listaEditoras.isEmpty())
            System.out.println("Nao ha editoras na colecao");
        else
            listaEditoras.remove(e);
    }
    public Object[][] listarEditoras() {
        Object[][] res = new Object[4][listaEditoras.size()];
        for (int i = 0; i < listaEditoras.size(); i++) {
            res[i] = listaEditoras.get(i).toRowTable();
        }
        return res;
    }
    
    public String[] getListaNomeEditoras() {
        String[] res = new String[listaEditoras.size()];
        for (int i = 0; i < listaEditoras.size(); i++) {
            res[i] = listaEditoras.get(i).getNome();
        }
        return (String[]) res;
    }
}


