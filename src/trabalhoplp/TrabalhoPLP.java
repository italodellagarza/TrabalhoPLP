/*
 * Programa para cadastro de Gibis
 * Para a disciplina de GCC198 - PLP
 * Universidade Federal de Lavras (UFLA), 2017
 */
package trabalhoplp;

import java.util.List;
import java.io.Console;
import java.util.ArrayList;
/**
 * @author Ítalo Della Garza Silva
 * @author Giovane Rezende
 * Classe principal, que contém a execução do programa.
 */
public class TrabalhoPLP {

    public static void main(String[] args) {

        int escolha;
        List<Gibi> listaGibis = new ArrayList<Gibi>();
        do {
            menu();
            // Ler escolha(em java)
            switch(escolha){
                case 1:
                    String nome;
                    String editora;
                    String ano;
                    int qtGibis;
                    System.out.println("Quantos gibis deseja cadastrar?: ");
                    // Ler qtGibis
                    for(int i=0; i< qtGibis; ++i) {
                        // ler nome, editora, ano
                        listaGibis.add(new Gibi(nome,editora,ano));
                    }
                    break;
                case 2:
                    String nomeRm;
                    System.out.println("Digite o nome do gibi para remover: ");
                    // Ler nomeRm
                    for(Gibi gibi : listaGibis){
                        if(gibi.getNome().equals(nomeRm)) {
                            listaGibis.remove(gibi);
                        }
                    }
                    break;
                case 3:
                    ArquivoGibis arquivoSaida = new ArquivoGibis("arquivo-saida.txt",'w');
                    for(Gibi gibi : listaGibis) {
                        arquivoSaida.escreve(gibi);
                    }
                    break;
                case 4:
                    String nomeArquivo;
                    System.out.println("Digite o nome do arquivo de entrada: ");
                    // Ler nomeArquivo
                    ArquivoGibis arquivoEntrada = new ArquivoGibis(nomeArquivo,'r');
                    Gibi gibi;
                    while(gibi = arquivoEntrada.leDoArquivo()) {
                        
                    }
                    break;
                case 5:
                    System.out.println("Sessao finalizada");
                    break;
            }
            
        } while (escolha != 5);
        
    }
    public static void menu() {
        System.out.println("CADASTRO DE GIBIS\n"
                + "1. Cadastrar gibis\n"
                + "2. Visualizar Gibis\n"
                + "3. Salvar dados em arquivo\n"
                + "4. Carregar dados de arquivo\n"
                + "5. SAIR\n"
                + "Sua opcao: ");
    }
}
