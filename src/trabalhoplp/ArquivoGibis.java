/*
 * Programa para cadastro de Gibis
 * Para a disciplina de GCC198 - PLP
 * Universidade Federal de Lavras (UFLA), 2017
 */
package trabalhoplp;

/**
 * @author Ítalo Della Garza Silva
 * @author Giovane Rezende
 * Classe para os arquivos texto onde estarão armazenados os gibis
 */
public class ArquivoGibis {
    private enum Tipo{leitura, escrita}
    private String nomeArquivo;
    private Tipo tipo;
    private boolean FimArquivo;
    
    public ArquivoGibis(String nomeArquivo, char opcao) {
        this.nomeArquivo = nomeArquivo;
        if(opcao == 'w') {
            tipo = Tipo.leitura;
        } else {
            tipo = Tipo.escrita;
        }
    }
    public void escreve(Gibi g) {
        
    }
    
}
