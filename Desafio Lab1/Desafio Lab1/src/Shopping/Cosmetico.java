package Shopping;

public class Cosmetico extends Loja{

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int qtdDeProdutos, double taxaDeComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, qtdDeProdutos);
        this.taxaComercializacao = taxaDeComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, int qtdDeProdutos, double taxaDeComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataDeFundacao, qtdDeProdutos);
        this.taxaComercializacao = taxaDeComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        StringBuilder resumo = new StringBuilder();
        resumo.append(super.toString());
        resumo.append("Taxa de comercialização: "+ taxaComercializacao +"\n");

        return resumo.toString();
    }
}
