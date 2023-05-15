package Shopping;

public class Vestuario extends Loja{
    private boolean produtosImportados;
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString(){
        StringBuilder resumo = new StringBuilder();
        resumo.append(super.toString());
        resumo.append("Produtor importados? " +produtosImportados+"\n");
        return resumo.toString();
    }
}
