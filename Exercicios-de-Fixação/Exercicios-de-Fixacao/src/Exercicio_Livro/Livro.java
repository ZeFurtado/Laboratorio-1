package Exercicio_Livro;

import javax.xml.crypto.Data;

public class Livro {
    private String nome;
    private String autor;
    private Data anoDePublicacao;
    private Double preco;
    private int numDePaginas;


    public Livro(String nome, String autor, Data anoDePublicacao, Double preco, int numDePaginas){
        this.nome = nome;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
        this.numDePaginas = numDePaginas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Data getAnoDePublicacao() {
        return anoDePublicacao;
    }
    public void setAnoDePublicacao(Data anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getNumDePaginas() {
        return numDePaginas;
    }
    public void setNumDePaginas(int numDePaginas) {
        this.numDePaginas = numDePaginas;
    }

    public Double calcularPrecoPorPagina(){
        return preco / numDePaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("O nome do livro é: \n" + nome);
        sb.append("O nome do autor é: \n" + autor);
        sb.append("Data de publicação: \n" + anoDePublicacao);
        sb.append("O livro custa R$: \n" + preco.shortValue());
        sb.append("Número de páginas: \n" + numDePaginas);

        return sb.toString();
    }
}
