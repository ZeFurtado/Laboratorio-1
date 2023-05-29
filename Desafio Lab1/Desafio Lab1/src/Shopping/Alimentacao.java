package Shopping;

public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, Data dataAlvara,int qtdDeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, qtdDeProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, Data dataAlvara, int qtdDeProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataDeFundacao, qtdDeProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        StringBuilder resumo = new StringBuilder();
        resumo.append(super.toString());
        resumo.append("Data do alvará: " +dataAlvara+"\n");

        return resumo.toString();
    }
}
