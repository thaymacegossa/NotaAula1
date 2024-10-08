import java.util.Scanner;

public class SistemaProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tamanho/peso do produto: ");
        String tamanhoPeso = scanner.nextLine();

        System.out.print("Digite a cor do produto: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a quantidade no estoque: ");
        int quantidadeEstoque = scanner.nextInt(); // 2508

        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        System.out.print("Digite a quantidade a ser vendida: ");
        int quantidadeVendida = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o método de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
        String metodoPagamento = scanner.nextLine();

        Venda venda = new Venda();
        venda.realizarVenda(produto, quantidadeVendida, metodoPagamento);

        System.out.println("Estoque restante: " + produto.getQuantidadeEstoque());

        scanner.close();
    }
}
