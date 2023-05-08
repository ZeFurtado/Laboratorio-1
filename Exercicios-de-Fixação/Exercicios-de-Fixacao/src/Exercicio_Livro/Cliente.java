package Exercicio_Livro;

public class Cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;
    private Livro livro;

    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente (String nome, int idade,char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Cliente(String nome, int idade,char sexo, String email, String senha){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }
    public Cliente(String nome, int idade,char sexo, String email, String senha, Livro livro){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = livro;
    }

    public void  imprimeInformacoes(){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Nome do cliente: " + nome + "\n");
        stringBuilder.append("Idade: " + idade + "\n");
        stringBuilder.append("Sexo: "+sexo+ "\n");
        stringBuilder.append("Email: " + email + "\n");
        stringBuilder.append("Senha: " + senha+ "\n");
        stringBuilder.append("Livro: "+ livro + "\n");

        System.out.println(stringBuilder.toString());
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Nome do cliente: " + nome + "\n");
        stringBuilder.append("Idade: " + idade + "\n");
        stringBuilder.append("Sexo: "+sexo+ "\n");
        stringBuilder.append("Email: " + email + "\n");
        stringBuilder.append("Senha: " + senha+ "\n");
        stringBuilder.append("Livro: "+ livro + "\n");

        return stringBuilder.toString();
    }
}
