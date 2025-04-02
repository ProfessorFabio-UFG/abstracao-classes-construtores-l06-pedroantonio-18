package produto;

public class Produto {
    int codigo;
    String nome;
    int quantidade;
    String tipo;
    float valor;

    /* Construtores */
    public Produto(int codigo) {
        this.codigo = codigo;

    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    /* Método - Vender */
    public float vender(int quantidadeVendida) {
        if (quantidadeVendida > this.quantidade) {
            return 0.0f;
        } else {
            this.quantidade -= quantidadeVendida;
            return quantidadeVendida * this.valor;
        }
    }

    /* Método - Comprar (1) */
    public void comprar(int novaQuantidade, float novoValor) {
        if (novaQuantidade < 0) {
            System.out.println("Valor inválido");
            return;
        }
        this.quantidade = novaQuantidade;
        this.valor = novoValor;
    }

    /* Método - Comprar (2) */
    public void comprar(int novaQuantidade) {
        if (novaQuantidade < 0) {
            System.out.println("Valor inválido");
            return;
        }
        this.quantidade = novaQuantidade;
    }

    /* Método - Consultar */
    public String consultar() {
        return (
            "Código: " + this.codigo +
            "\nNome: " + this.nome +
            "\nQuantidade: " + this.quantidade +
            "\nTipo: " + this.tipo +
            "\nValor: " + this.valor
        );
    }

    /* Método - Igual */
    public boolean igual(Produto produto) {
        return produto.nome.equals(this.nome) && produto.tipo.equals(this.tipo);
    }
}
