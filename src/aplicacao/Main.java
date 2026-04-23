package aplicacao;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItensPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enumeradas.StatusPedido;

import java.util.Date;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException{
      Scanner sc = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

      System.out.println("Informe os dados do cliente: ");
      System.out.println("Nome: ");
      String nomeCliente=sc.nextLine();
      System.out.println("Email: ");
      String email=sc.nextLine();
      System.out.print("Data de Nascimento (DD/MM/YYYY): ");
      Date dataAniver = sdf.parse(sc.next());

      Cliente cliente = new Cliente(nomeCliente, email, dataAniver);

      System.out.println("Informe os dados do pedido: ");
      System.out.println("Status: ");
      StatusPedido status = StatusPedido.valueOf(sc.next().toUpperCase());
      //valueof converte o texto digitado em valor do enum

      Pedido pedido = new Pedido(status, cliente, new Date());

      System.out.println("Quantos itens para este pedido?");
      int numeroitens = sc.nextInt();
      for (int i = 0; i < numeroitens; i++) {
        System.out.println("Informe os dados do item "+ (i+1)+": ");
        System.out.println("Nome do produto: ");
        sc.nextLine();
        String nomeProduto = sc.nextLine();
        System.out.println("Preco do produto: ");
        double precoProduto = sc.nextDouble();
        System.out.println("Quantidade: ");
        int quantidadeProduto = sc.nextInt();

        Produto produto = new Produto(nomeProduto, precoProduto);

        ItensPedido item = new ItensPedido(quantidadeProduto, precoProduto, produto);

        pedido.addItem(item);

      }

      System.out.println("RESUMO DO PEDIDO: ");
      System.out.println(pedido);

      
      sc.close();
    }
}
