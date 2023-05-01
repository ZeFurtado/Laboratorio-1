package Shopping;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    private Endereco endereco = new Endereco();
    private Data dataDeFundacao = new Data();


    Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
    }

    Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }


    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }


    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Endereco getEndereco(){
        return endereco;
    }

    public void setDataDeFundacao(Data dataDeFundacao){
        this.dataDeFundacao = dataDeFundacao;
    }
    public Data getDataDeFundacao(){
        return dataDeFundacao;
    }


    public String toString() {
        return ("A loja " + nome + " possuí "+quantidadeFuncionarios+"funcionários e o salário base deles é de R$:"+salarioBaseFuncionario);
    }

    public double gastoscomSalario() {
        if(salarioBaseFuncionario > 0)
        {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }else
        {
            return -1;
        }
    }


    public char tamanhoDaLoja() {
        if(quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else
        {
            return 'G';
        }
    }


}

