package TesteHerancaPolimorfismo;

public class Criança extends Pessoa{

    private String nomeDaEscola;
    private int anoEscolar;

    public Criança(String nome, int idade, String cpf, String nomeDaEscola, int anoEscolar){
        super(nome, idade, cpf);
        this.nomeDaEscola = nomeDaEscola;
        this.anoEscolar = anoEscolar;
    }

    public String getNomeDaEscola() {
        return nomeDaEscola;
    }

    public void setNomeDaEscola(String nomeDaEscola) {
        this.nomeDaEscola = nomeDaEscola;
    }

    public int getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(int anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    @Override
    public String toString() {
        return "Criança{" +
                "nomeDaEscola='" + nomeDaEscola + '\'' +
                ", anoEscolar=" + anoEscolar +
                '}';
    }
}
