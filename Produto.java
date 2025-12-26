import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Produto {
    String nome;
    double valor;
    int quantidadeDisponivel;

    public Produto(String nome, double valor, int quantidadeDisponivel) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void setEstoque() {

        Scanner input = new Scanner(System.in);
        IO.println("Nome do produto: ");
        String nomeProd = input.nextLine();
        IO.println("Valor do produto: ");
        double valorProd = input.nextDouble();
        IO.println("Quantidade do produto: ");
        int quatidadeProd = input.nextInt();
        input.close();

        this.nome = nomeProd;
        this.valor = valorProd;
        this.quantidadeDisponivel = quatidadeProd;
    }

    public void fileDB() {
        String[] produtos = new String[] { nome, String.valueOf(valor), String.valueOf(quantidadeDisponivel) };

        String caminho = "C:\\Projetos-Java\\Estoque\\produtos.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
            for (String linha : produtos) {
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            IO.print("Error: " + e.getStackTrace());
        }
    }
}