/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoplp;


import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
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
    /**
     * Função para adicionar um gibi qualquer.
     * @param nome
     * @param editora
     * @param anoPublicacao
     * @param autor 
     */
    public void adicionarGibi(String nome, String editora, int anoPublicacao, String autor) {
        Gibi g = new Gibi(++(this.idGibis), nome, editora, anoPublicacao, autor);
        this.listaGibis.add(g);
    }
    /**
     *  Função para busca de gibis (retorna o primeiro encontrado)
     * @param nomeGibi nome do Gibi.
     * @return primeiro gibi encontrado.
     */
    public Gibi buscarGibi(String nomeGibi) {
        for (Gibi g: listaGibis) {
            if(g.getNome().equals(nomeGibi))
                return g;
        }
        for (Manga m: listaMangas) {
            if(m.getNome().equals(nomeGibi))
                return (Gibi)m;
        }
        for (Tirinha t: listaTirinhas) {
            if(t.getNome().equals(nomeGibi))
                return (Gibi)t;
        }
        for (Comic c: listaComics) {
            if(c.getNome().equals(nomeGibi))
                return (Gibi)c;
        }
        return null;
    }
    
     /**
     *  Função para busca de gibis (retorna o primeiro encontrado que não
     *  está na lista de próximos)
     * @param nomeGibi nome do Gibi.
     * @param anteriores lista com os gibis que já foram pesquisados
     * @return primeiro gibi encontrado.
     */
    public Gibi buscarGibi(String nomeGibi, List<Gibi> anteriores) {
        for (Gibi g: listaGibis) {
            if(g.getNome().equals(nomeGibi) && !anteriores.contains(g))
                return g;
        }
        for (Manga m: listaMangas) {
            if(m.getNome().equals(nomeGibi) && !anteriores.contains(m))
                return (Gibi)m;
        }
        for (Tirinha t: listaTirinhas) {
            if(t.getNome().equals(nomeGibi) && !anteriores.contains(t))
                return (Gibi)t;
        }
        for (Comic c: listaComics) {
            if(c.getNome().equals(nomeGibi) && !anteriores.contains(c))
                return (Gibi)c;
        }
        return null;
    }
    
    /**
     *  Remove um gibi
     * @param id
     */
    public void removerGibi(Gibi g) {
        this.listaGibis.remove(g);
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
    
    public Object[][] listarTodos() {
        List<Gibi> listaCompleta = new ArrayList<Gibi>();
        listaCompleta.addAll(listaGibis);
        listaCompleta.addAll(listaMangas);
        listaCompleta.addAll(listaComics);
        listaCompleta.addAll(listaTirinhas);
        if(listaCompleta.isEmpty()) 
            return new Object[][]{{null, null, null, null, null}};
        Object [][] res = new Object[listaCompleta.size()][5];
        for (int i = 0; i < listaCompleta.size(); i++) {
            res[i][0] = listaCompleta.get(i).getId();
            res[i][1] = listaCompleta.get(i).getNome();
            res[i][2] = listaCompleta.get(i).getEditora();
            res[i][3] = listaCompleta.get(i).getAnoPublicacao();
            res[i][4] = listaCompleta.get(i).getAutor();
        }
        return res;
    }
    
    public void gravarGibisEmArquivo(String nome) throws IOException {
        File f = new File(nome);
        PrintWriter arqSaida = new PrintWriter(f);
        arqSaida.print(listaEditoras.size());
        for(Editora e: listaEditoras) {
           arqSaida.print(e); 
        }
        arqSaida.print(listaGibis.size());
        for(Gibi g: listaGibis) {
           arqSaida.print(g); 
        }
        arqSaida.println(listaMangas.size());
        for(Manga m: listaMangas) {
           arqSaida.print(m); 
        }
        arqSaida.println(listaTirinhas.size());
        for(Tirinha t: listaTirinhas) {
           arqSaida.print(t); 
        }
        arqSaida.println(listaComics.size());
        for(Comic c: listaComics) {
           arqSaida.print(c); 
        }
    }
    
    public void carregarGibisDeArquivo(String nome) throws FileNotFoundException {
        File f = new File(nome);
        Scanner arqEntrada = new Scanner(f);
        if(arqEntrada.hasNext()) {
            int tamEditoras = arqEntrada.nextInt();
            for (int i = 0; i < tamEditoras; i++) {
                // TODO Terminar esse método e documentar.
            }
        }
        else {
            
        }
    }
    
    //Métodos para Comic
    
    public void adicionarComic(String nome, String editora, int anoPublicacao,
            String autor, String genero, int numPaginas,
            int numVolumes, String era) {
        Comic c = new Comic(++(this.idGibis), nome, editora, anoPublicacao,
                autor, genero, numPaginas, numVolumes, era);
        this.listaComics.add(c);
    }
    
    
    public void removerComic(Comic c) {
        listaComics.remove(c);
    }
    
    public Object[][] listarComics() {
        if(this.listaComics.isEmpty())
            return new Object[][]{{null, null, null, null,
               null, null, null, null, null}};
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
    
    public void adicionarManga(String nome, String editora, int anoPublicacao, 
            String autor, String genero, int numVolumes, String tipologia) {
        Manga m = new Manga(++(this.idGibis), nome, editora, anoPublicacao, 
                autor, genero, numVolumes, tipologia);
        this.listaMangas.add(m);
    }
    
    
    public void removerManga(Manga m) {
        this.listaMangas.remove(m);
    }
    
    public Object[][] listarMangas() {
        if(this.listaMangas.isEmpty())
            return new Object[][]{{null, null, null, null, 
                null, null, null, null}};
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
        Tirinha t = new Tirinha(++(this.idGibis), nome, editora, anoPublicacao, autor, genero, numQuadrinhos);
        this.listaTirinhas.add(t);
    }
    
    
    public void removerTirinha(Tirinha t) {
        this.listaGibis.remove(t);
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


