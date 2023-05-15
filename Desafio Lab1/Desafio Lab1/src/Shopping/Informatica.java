package Shopping;

public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString(){
        StringBuilder resumo = new StringBuilder();
        resumo.append(super.toString());
        resumo.append("Seguro Eletrônicos: "+seguroEletronicos+"\n");

        return resumo.toString();
    }
}
