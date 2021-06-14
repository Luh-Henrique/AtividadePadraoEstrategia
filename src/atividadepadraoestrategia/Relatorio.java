/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepadraoestrategia;

/**
 *
 * @author Luiz Henrique
 */
public class Relatorio {
    public Produto[] produtos;
            
    void ordenaProdutos(int opcao)
    {
        Ordenacao ordenacao;
        switch(opcao)
        {
            case 1:
                ordenacao = new OrdenacaoNome();
                ordenacao.ordena(produtos);
                break;
                    
            case 2:
                ordenacao = new OrdenacaoPreco();
                ordenacao.ordena(produtos);
                break;
                            
                            
            case 3:
                ordenacao = new OrdenacaoValidade();
                ordenacao.ordena(produtos);
                break;
                
            default:
                System.out.println("Opcao invalida!!");
                break;
        }
    }
}
