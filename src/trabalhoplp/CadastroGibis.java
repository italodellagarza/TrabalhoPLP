/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoplp;

import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usaurios
 */
public class CadastroGibis {
   private List<Gibi> listaGibis;
   
   public CadastroGibis(){
       listaGibis = new ArrayList<Gibi>();
   }
   
   public void adicionarGibi(Gibi g) {
       listaGibis.add(g);
   }
   public void removerGibi (Gibi g) {
       if(listaGibis.size() == 0)
           System.out.println("Nao ha gibis na colecao");
       else
           listaGibis.remove(g);
   }
   public void listarGibis() {
       for(Gibi g : listaGibis) {
           System.out.println(g);
       }
   }
   public void gravarGibisEmArquivo() {
       
   }
   
   public void carregarGibisDeArquivo() {
       
   }
}
