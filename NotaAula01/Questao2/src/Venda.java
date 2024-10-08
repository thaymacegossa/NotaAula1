import java.util.Scanner;

public class Venda {

    public void realizarVenda(Produto produto, int quantidade, String metodoPagamento) {
        Scanner scanner = new Scanner(System.in);

        if (produto.reduzirEstoque(quantidade)) {
            double total = produto.getValor() * quantidade;
            double totalComDesconto = aplicarDesconto(total, metodoPagamento);

            System.out.printf("Valor total: R$%.2f\n", total);
            System.out.printf("Valor com desconto: R$%.2f\n", totalComDesconto);

            if (metodoPagamento.equalsIgnoreCase("Espécie")) {
                System.out.print("Digite o valor pago: ");
                double valorPago = scanner.nextDouble();

                if (valorPago > totalComDesconto) {
                    double troco = valorPago - totalComDesconto;
                    System.out.printf("Troco: R$%.2f\n", troco);
                } else if (valorPago < totalComDesconto) {
                    System.out.println("Valor pago insuficiente.");
                } else {
                    System.out.println("Pagamento realizado com sucesso.");
                }
            } else if (metodoPagamento.equalsIgnoreCase("Crédito")) {
                System.out.println("Pagamento em 3x de: R$" + (totalComDesconto / 3));
            } else {
                System.out.println("Pagamento realizado com sucesso.");
            }

        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

    private double aplicarDesconto(double total, String metodoPagamento) {
        if (metodoPagamento.equalsIgnoreCase("Pix") ||
                metodoPagamento.equalsIgnoreCase("Espécie") ||
                metodoPagamento.equalsIgnoreCase("Transferência") ||
                metodoPagamento.equalsIgnoreCase("Débito")) {
            return total * 0.95; // 5% de desconto
        }
        return total;
    }
}

