package TesteHerancaPolimorfismo;

public class Adulto extends Pessoa{

    private String localDeTrabalho;
    private double salario;

    public Adulto(String nome, int idade, String cpf, String localDeTrabalho, double salario) {
        super(nome, idade, cpf);
        this.localDeTrabalho = localDeTrabalho;
        this.salario = salario;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String MetodoDeTeste(){
        return "&#¨%&#¨%&*#¨%#¨%*";
    }

    @Override
    public String toString() {
        return super.toString() + " Adulto{" +
                                    " Local de trabalho =  "+this.localDeTrabalho+
                                    " Salário = " + this.salario+"}";
    }
}
