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
    public int id; // Para inserção automática de ids
    private final ArrayList<Gibi> listaGibis;
    private final ArrayList<Comic> listaComics;
    private final ArrayList<Manga> listaMangas;
    private final ArrayList<Tirinha> listaTirinhas;
    private final ArrayList<Editora> listaEditoras;
    
    public CadastroGibis(){
        id = 0;
        listaGibis = new ArrayList();
        listaComics = new ArrayList();
        listaMangas = new ArrayList();
        listaTirinhas = new ArrayList();
        listaEditoras = new ArrayList();
    }
    
    public void adicionar(int id, String nome, String editora, int anoPublicacao, 
            String autor) {
        Gibi g = new Gibi(id, nome, editora, anoPublicacao, autor);
        this.listaGibis.add(g);
    }
    
    public void buscarGibi(int idg) {
        if(this.listaGibis.isEmpty())
            System.out.println("Nao ha gibis na colecao");
        else {
            for(Gibi g : this.listaGibis) {
                if (g.getId() == idg) {
                    System.out.println(g.getId());
                    System.out.println(g.getNome());
                    System.out.println(g.getEditora());
                    System.out.println(g.getAnoPublicacao());
                    System.out.println(g.getAutor());

                }
            }
        }
    }
    
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
    
    public void adicionarEditora(Editora e) {
        listaEditoras.add(e);
    }
    public void removerEditora(Editora e) {
        if(listaEditoras.isEmpty())
            System.out.println("Nao ha editoras na colecao");
        else
            listaEditoras.remove(e);
    }
    public void listarEditoras() {
        for(Editora e : listaEditoras) {
            System.out.println(e);
        }
    }
}

