package Shopping;

public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }


    public String toString(){
        StringBuilder resumo = new StringBuilder();
        resumo.append(super.toString());
        resumo.append("Meta de vendas: " +metaVendas+"\n");

        return resumo.toString();

    }
}
