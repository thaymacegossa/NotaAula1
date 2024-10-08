public class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    } // 0607

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanhoPeso() {
        return tamanhoPeso;
    }

    public String getCor() {
        return cor;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean reduzirEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            return true;
        } else {
            return false;
        }
    }
}
