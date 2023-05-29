package Shopping;

import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    private Endereco endereco;
    private Data dataDeFundacao;

    private Produto[] estoqueProdutos;


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int qtdDeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[qtdDeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, int qtdDeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[qtdDeProdutos];
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

    public void setDataFundacao(Data dataDeFundacao){
        this.dataDeFundacao = dataDeFundacao;
    }
    public Data getDataFundacao(){
        return dataDeFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome da loja: " + nome + "\n");
        stringBuilder.append("Quantidade de funcionários: "+quantidadeFuncionarios+"\n");
        stringBuilder.append("Salário base dos funcionários: "+salarioBaseFuncionario+"\n");
        stringBuilder.append("Endereço: " +endereco+"\n");
        stringBuilder.append("Data de fundação: "+dataDeFundacao+"\n");
        stringBuilder.append("Quantidade de produtos: "+estoqueProdutos.length+"\n");

        return stringBuilder.toString();

    }

    public double gastosComSalario() {
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

    public void  imprimeProdutos(){
        for (Produto produto:
             estoqueProdutos) {

            if(produto != null) {
                produto.toString();
            }
        }
    }

    public boolean  insereProduto(Produto novoProduto){
        int index = 0;

        while (index <= this.estoqueProdutos.length - 1){
            if(this.estoqueProdutos[index] == null){ //Verifica se a posição indicada pelo index está vazia
                this.estoqueProdutos[index] = novoProduto; //Se vazia ele preenche a posição com o novo produto...
                return true; //...e retorna verdadeiro
            }else{
                index++; //Caso a posição não esteja vazia ele pula para a próxima
            }
        }

        return false;//Retorna falso se o laço "while" não encontrou nenhuma posição vazia

    }

    public boolean removeProduto(String nomeDoProduto){
        int index = 0;
        while(index <= this.estoqueProdutos.length - 1){
            if((this.estoqueProdutos[index] != null) && (this.estoqueProdutos[index].getNome() == nomeDoProduto)){
                this.estoqueProdutos[index] = null;
                return true;
            }else {
                index++;
            }
        }
        return false;
    }




}

