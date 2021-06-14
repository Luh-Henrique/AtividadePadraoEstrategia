/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepadraoestrategia;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Luiz Henrique
 */
public class OrdenacaoNome extends Ordenacao{
    
    @Override
    public void ordena(Produto[] produtos)
    {   
        Arrays.sort(produtos, new Comparator<Produto>() 
        {
          @Override
          public int compare(Produto p1, Produto p2)
          {
              return p1.nome.compareTo(p2.nome);
          }
      });
        
      int i;
      
      System.out.println("\n\n-------------Ordenando por nome-------------\n");
      for(i=0;i<3;i++)
      System.out.println("\n\nNome: "+produtos[i].nome+"\nPreco: "+produtos[i].preco+"\nValidade: "+produtos[i].validade);
    }
}
