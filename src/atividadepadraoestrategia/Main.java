/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepadraoestrategia;
import java.util.Scanner;

/**
 *
 * @author Luiz Henrique
 */
public class Main {
    public static void main(String args[])
    {
        Produto[] produtos;
        Relatorio relatorio = new Relatorio();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        
        Produto produto1 = new Produto();
        produto1.nome = "Celular";
        produto1.preco = 600;
        produto1.validade= 1;
        
        Produto produto2 = new Produto();
        produto2.nome = "Tablet";
        produto2.preco = 400;
        produto2.validade= 2;
        
        Produto produto3 = new Produto();
        produto3.nome = "Notebook";
        produto3.preco = 1500;
        produto3.validade= 3;
        
        produtos = new Produto[]{produto1, produto2, produto3};
        relatorio.produtos = produtos;
        
        while(opcao!=4)
        {
            System.out.println("\n\n\n\nMenu Principal\n\n1-Ordenar por nome\n2-Ordena por preco\n3-Ordena por validade\n\nSua opcao: ");
            opcao = ler.nextInt();
            
            if(opcao!=4)
                relatorio.ordenaProdutos(opcao);
            
            else if(opcao == 4)
                System.out.println("Saindo...");
        }
    }
}
