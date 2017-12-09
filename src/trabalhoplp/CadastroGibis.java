/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe CadastroGibis (CadastroGibis.java)
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
 * Classe para controlar o cadastro de gibis.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe
 */
public class CadastroGibis {
    private int idGibis; // Para inserção automática de ids
    private int idEditoras;
    
    private final ArrayList<Gibi> listaGibis;
    private final ArrayList<Comic> listaComics;
    private final ArrayList<Manga> listaMangas;
    private final ArrayList<Tirinha> listaTirinhas;
    private final ArrayList<Editora> listaEditoras;
    
    /**
     * Construtor de classe.
     */
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
     * @param nome Nome do gibi a ser adicionado.
     * @param editora Editora do gibi a ser adicionado.
     * @param anoPublicacao Ano de publicação do gibi a ser adicionado.
     * @param autor Autor do gibi a ser adicionado.
     */
    public void adicionarGibi(String nome, String editora, int anoPublicacao, String autor) {
        Gibi g = new Gibi(++(this.idGibis), nome, editora, anoPublicacao, autor);
        this.listaGibis.add(g);
    }
    /**
     * Função para busca de gibis (retorna o primeiro encontrado)
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
     * Função para busca de gibis (retorna o primeiro encontrado que não
     * está na lista de próximos)
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
     * Remove um gibi.
     * @param g Gibi a ser removido.
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
    
    /**
     * Retorna uma lista com todos os gibis, independente de seu tipo.
     * @return tabela com todos os gibis para usar no jTable.
     */
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
    
    /**
     * Salva os gibis em um arquivo para serem lidos depois.
     * @param nome Nome do arquivo a se salvar.
     * @throws IOException 
     */
    public void gravarGibisEmArquivo(String nome) throws IOException {
        File f = new File(nome);
        PrintWriter arqSaida = new PrintWriter(f);
        arqSaida.println(listaEditoras.size());
        for(Editora e: listaEditoras) {
           arqSaida.println(e.toString()); 
        }
        arqSaida.println(listaGibis.size());
        for(Gibi g: listaGibis) {
           arqSaida.print(g.toString()); 
        }
        arqSaida.println(listaMangas.size());
        for(Manga m: listaMangas) {
           arqSaida.print(m.toString()); 
        }
        arqSaida.println(listaTirinhas.size());
        for(Tirinha t: listaTirinhas) {
           arqSaida.print(t.toString()); 
        }
        arqSaida.println(listaComics.size());
        for(Comic c: listaComics) {
           arqSaida.print(c.toString()); 
        }
        arqSaida.close();
    }
    /**
     * Carrega gibis de um arquivo gerado por este programa.
     * @param nome Nome do arquivo a ser lido.
     * @throws FileNotFoundException 
     */
    public void carregarGibisDeArquivo(String nome) throws FileNotFoundException {
        File f = new File(nome);
        Scanner arqEntrada = new Scanner(f);
        if(arqEntrada.hasNext()) {
            int tamEditoras = Integer.parseInt(arqEntrada.nextLine());
            for(int i = 0; i < tamEditoras; i++) {
                String nomeEditora = arqEntrada.nextLine();
                String cidadeEditora = arqEntrada.nextLine();
                String paisEditora = arqEntrada.nextLine();
                String telEditora = arqEntrada.nextLine();
                adicionarEditora(nomeEditora, new Endereco (cidadeEditora,
                       paisEditora), telEditora);
            }
            int tamLGibis = Integer.parseInt(arqEntrada.nextLine());
            for (int i = 0; i < tamLGibis; i++) {
                String nomeGibi = arqEntrada.nextLine();
                String editoraGibi = arqEntrada.nextLine();
                int anoPubGibi = Integer.parseInt(arqEntrada.nextLine());
                String autorGibi = arqEntrada.nextLine();
                adicionarGibi(nomeGibi, editoraGibi, anoPubGibi, autorGibi);
            }
            int tamLMangas = Integer.parseInt(arqEntrada.nextLine());
            for (int i = 0; i < tamLMangas; i++) {
                String nomeManga = arqEntrada.nextLine();
                String editoraManga = arqEntrada.nextLine();
                int anoPubManga = Integer.parseInt(arqEntrada.nextLine());
                String autorManga = arqEntrada.nextLine();
                String genManga = arqEntrada.nextLine();
                int numVolManga = Integer.parseInt(arqEntrada.nextLine());
                String tipoManga = arqEntrada.nextLine();
                adicionarManga(nomeManga, editoraManga, anoPubManga, autorManga,
                        genManga, numVolManga, tipoManga);
            }
            int tamLTirinhas = Integer.parseInt(arqEntrada.nextLine());
            for (int i = 0; i < tamLTirinhas; i++) {
                String nomeTirinha = arqEntrada.nextLine();
                String editoraTirinha = arqEntrada.nextLine();
                int anoPubTirinha = Integer.parseInt(arqEntrada.nextLine());
                String autorTirinha = arqEntrada.nextLine();
                String genTirinha = arqEntrada.nextLine();
                int numQuadrinhos = Integer.parseInt(arqEntrada.nextLine());
                arqEntrada.nextLine();
                String primPubTirinha = arqEntrada.nextLine();
                adicionarTirinha(nomeTirinha, editoraTirinha, anoPubTirinha,
                        autorTirinha, genTirinha, numQuadrinhos, primPubTirinha);
            }
            int tamLComics = Integer.parseInt(arqEntrada.nextLine());
            for (int i = 0; i < tamLComics; i++) {
                String nomeComic = arqEntrada.nextLine();
                String editoraComic = arqEntrada.nextLine();
                int anoPubComic = Integer.parseInt(arqEntrada.nextLine());
                String autorComic = arqEntrada.nextLine();
                String genComic = arqEntrada.nextLine();
                int numPagComic = Integer.parseInt(arqEntrada.nextLine());
                int numVolComic = Integer.parseInt(arqEntrada.nextLine());
                String eraComic = arqEntrada.nextLine();
                adicionarComic(nomeComic, editoraComic, anoPubComic, autorComic,
                        genComic, numPagComic, numVolComic, eraComic);
            }
        }
        else {
            // Faz nada.
        }
    }
    
    //Métodos para Comic
    
    /**
     * Adiciona um Comic.
     * @param nome Nome do comic a ser adicionado.
     * @param editora Editora do comic a ser adicionado.
     * @param anoPublicacao Ano de Publicação do comic a ser adicionado.
     * @param autor Autor do comic a ser adicionado.
     * @param genero Gênero do comic a ser adicionado.
     * @param numPaginas Número de Páginas do comic a ser adicionado.
     * @param numVolumes Número de Volumes do comic a ser adicionado.
     * @param era Era do comic a ser adicionado.
     */
    public void adicionarComic(String nome, String editora, int anoPublicacao,
            String autor, String genero, int numPaginas,
            int numVolumes, String era) {
        Comic c = new Comic(++(this.idGibis), nome, editora, anoPublicacao,
                autor, genero, numPaginas, numVolumes, era);
        this.listaComics.add(c);
    }
    
    /**
     * Remove um comic.
     * @param c comic a ser removido.
     */
    public void removerComic(Comic c) {
        listaComics.remove(c);
    }
    /**
     * Retorna uma lista com todos os comics.
     * @return Tabela com todos os comics para usar no jTable.
     */
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
    
    /**
     * Adiciona um Mangá
     * @param nome Nome do mangá a ser adicionado.
     * @param editora Editora do mangá a ser adicionado.
     * @param anoPublicacao Ano de Publicação do mangá a ser adicionado.
     * @param autor Autor do mangá a ser adicionado.
     * @param genero Gênero do mangá a ser adicionado.
     * @param numVolumes Número de volumes do mangá a ser adicionado.
     * @param tipologia Tipologia do mangá a ser adicionado.
     */
    public void adicionarManga(String nome, String editora, int anoPublicacao, 
            String autor, String genero, int numVolumes, String tipologia) {
        Manga m = new Manga(++(this.idGibis), nome, editora, anoPublicacao, 
                autor, genero, numVolumes, tipologia);
        this.listaMangas.add(m);
    }
    
    /**
     * Remove um Mangá
     * @param m Mangá a ser removido.
     */
    public void removerManga(Manga m) {
        this.listaMangas.remove(m);
    }
    
    /**
     * Retorna uma lista com todos os mangás.
     * @return Tabela com todos os mangás para usar no jTable.
     */
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
    
    /**
     * Adiciona uma Tirinha.
     * @param nome Nome da tirinha a ser adicionada.
     * @param editora Editora da tirinha a ser adicionada.
     * @param anoPublicacao Ano de publicação da tirinha a ser adicionada.
     * @param autor Autor da tirinha a ser adicionada.
     * @param genero Gênero da tirinha a ser adicionada.
     * @param numQuadrinhos Número de quadrinhos da tirinha a ser adicionada.
     * @param primPub Veículo da primeira publicação da tirinha a ser adicionada.
     */
    public void adicionarTirinha(String nome, String editora, int anoPublicacao,
            String autor, String genero, int numQuadrinhos, String primPub) {
        Tirinha t = new Tirinha(++(this.idGibis), nome, editora, anoPublicacao, 
                autor, genero, numQuadrinhos, primPub);
        this.listaTirinhas.add(t);
    }
    
    /**
     * Remove uma tirinha.
     * @param t Tirinha a ser removida.
     */
    public void removerTirinha(Tirinha t) {
        this.listaGibis.remove(t);
    }
    
    /**
     * Retorna uma lista com todas as tirinhas.
     * @return Tabela com todas as tirinhas para usar no jTable.
     */
    public Object[][] listarTirinha() {
        if(this.listaTirinhas.isEmpty())
            return new Object[][]{{null, null, null, null, null, null, null, null}};
        Object [][] res = new Object[this.listaTirinhas.size()][8];
        for (int i = 0; i < this.listaTirinhas.size(); i++) {
            res[i][0] = this.listaTirinhas.get(i).getId();
            res[i][1] = this.listaTirinhas.get(i).getNome();
            res[i][2] = this.listaTirinhas.get(i).getEditora();
            res[i][3] = this.listaTirinhas.get(i).getAnoPublicacao();
            res[i][4] = this.listaTirinhas.get(i).getAutor();
            res[i][5] = this.listaTirinhas.get(i).genero;
            res[i][6] = this.listaTirinhas.get(i).getNumQuadrinhos();
            res[i][7] = this.listaTirinhas.get(i).getVeiculo();
        }
        return res;
    }
    
    //Métodos para Editora
    
    /**
     * Adiciona uma Editora.
     * @param nome Nome da editora a ser adicionada.
     * @param end Endereço da editora a ser adicionada.
     * @param tel Telefone da editora a ser adicionada.
     */
    public void adicionarEditora(String nome, Endereco end, String tel) {
        listaEditoras.add(new Editora((++idEditoras), nome, end, Integer.parseInt(tel)));
    }
    
    /**
     * Retorna uma lista com todas as editoras.
     * @return Tabela com todas as editoras para usar no jTable.
     */
    public Object[][] listarEditoras() {
        Object[][] res = new Object[4][listaEditoras.size()];
        for (int i = 0; i < listaEditoras.size(); i++) {
            res[i] = listaEditoras.get(i).toRowTable();
        }
        return res;
    }
    
    /**
     * Retorna uma lista com o nome de todas as editoras.
     * @return lista com o nome de todas as editoras.
     */
    public String[] getListaNomeEditoras() {
        String[] res = new String[listaEditoras.size()];
        for (int i = 0; i < listaEditoras.size(); i++) {
            res[i] = listaEditoras.get(i).getNome();
        }
        return (String[]) res;
    }
}


