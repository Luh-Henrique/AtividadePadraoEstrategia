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
public class OrdenacaoValidade extends Ordenacao{
    
    @Override
    public void ordena(Produto[] produtos)
    {   
        Arrays.sort(produtos, new Comparator<Produto>() 
        {
          @Override
          public int compare(Produto p1, Produto p2)
          {
              if (p1.validade >p1.validade) 
                  return 1;
              if (p1.validade < p2.validade) 
                  return -1;
              return 0;
          }
      });
        
      int i;
      
      System.out.println("\n\n-------------Ordenando por validade-------------\n");
      for(i=0;i<3;i++)
      System.out.println("\n\nValidade: "+produtos[i].validade+"\nNome: "+produtos[i].nome+"\nPreco: "+produtos[i].preco);
    }
}
