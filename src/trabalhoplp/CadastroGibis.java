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
    private int idEditoras;
    
    private final ArrayList<Gibi> listaGibis;
    private final ArrayList<Comic> listaComics;
    private final ArrayList<Manga> listaMangas;
    private final ArrayList<Tirinha> listaTirinhas;
    private final ArrayList<Editora> listaEditoras;
    
    public CadastroGibis(){
        idGibis = -1;
        idEditoras = -1;
        listaGibis = new ArrayList();
        listaComics = new ArrayList();
        listaMangas = new ArrayList();
        listaTirinhas = new ArrayList();
        listaEditoras = new ArrayList();
    }
    
    public void adicionar(String nome, String editora, int anoPublicacao, String autor) {
        Gibi g = new Gibi(idGibis++, nome, editora, anoPublicacao, autor);
        this.listaGibis.add(g);
    }
    /**
     *  Função para busca de gibis
     * @param nomeGibi nome do Gibi.
     * @return tabela de gibis com tal id.
     */
    public Object[][] buscarGibi(String nomeGibi) {
        if(this.listaGibis.isEmpty()) 
            return new Object[][]{{null, null, null,null, null}};
        Object [][] res = new Object[5][listaGibis.size()];
        for (int i = 0; i < listaGibis.size(); i++) {
            if (listaGibis.get(i).getNome() == nomeGibi) {
                res[i][0] = listaGibis.get(i).getId();
                res[i][1] = listaGibis.get(i).getNome();
                res[i][2] = listaGibis.get(i).getEditora();
                res[i][3] = listaGibis.get(i).getAnoPublicacao();
                res[i][4] = listaGibis.get(i).getAutor();
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
     * @param idg remove pelo id
     */
    public void removerGibi(int idg) {
        if(this.listaGibis.isEmpty())
            System.out.println("Nao ha gibis na colecao");
        else {
            for(Gibi g : this.listaGibis) {
                if (g.getId() == idg) {
                    this.listaGibis.remove(g);
                }
            }
        }
    }
    
    public void listarGibis() {
        if(this.listaGibis.isEmpty())
            System.out.println("Nao ha gibis na colecao");
        else {
            for(Gibi g : this.listaGibis) {
                System.out.println(g.getId());
                System.out.println(g.getNome());
                System.out.println(g.getEditora());
                System.out.println(g.getAnoPublicacao());
                System.out.println(g.getAutor());
            }
        }
    }
    
    public void gravarGibisEmArquivo() {
        
    }
    
    public void carregarGibisDeArquivo() {
        
    }
    
    //Métodos para Comic
    
    public void adicionarComic(Comic c) {
        listaComics.add(c);
    }
    public void removerComic(Comic c) {
        if(listaComics.isEmpty())
            System.out.println("Nao ha comics na colecao");
        else
            listaComics.remove(c);
    }
    public void listarComics() {
        for(Comic c : listaComics) {
            System.out.println(c);
        }
    }
    
    //Métodos para Manga
    
    public void adicionarManga(Manga m) {
        listaMangas.add(m);
    }
    public void removerManga(Manga m) {
        if(listaMangas.isEmpty())
            System.out.println("Nao ha mangas na colecao");
        else
            listaMangas.remove(m);
    }
    public void listarMangas() {
        for(Manga m : listaMangas) {
            System.out.println(m);
        }
    }
    
    //Métodos para Tirinha
    
    public void adicionarTirinha(Tirinha t) {
        listaTirinhas.add(t);
    }
    public void removerTirinha(Tirinha t) {
        if(listaTirinhas.isEmpty())
            System.out.println("Nao ha tirinhas na colecao");
        else
            listaTirinhas.remove(t);
    }
    public void listarTirinhas() {
        for(Tirinha t : listaTirinhas) {
            System.out.println(t);
        }
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

