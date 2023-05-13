package Exercicio_1;

import org.w3c.dom.CDATASection;

public class Sala {
    private String nome;
    private Cadeira cadeira1;
    private Cadeira cadeira2;
    private Cadeira cadeira3;
    private Cadeira cadeira4;

    public Sala(String nome, Cadeira cadeira1, Cadeira cadeira2, Cadeira cadeira3, Cadeira cadeira4) {
        this.nome = nome;
        this.cadeira1 = cadeira1;
        this.cadeira2 = cadeira2;
        this.cadeira3 = cadeira3;
        this.cadeira4 = cadeira4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cadeira getCadeira1() {
        return cadeira1;
    }

    public void setCadeira1(Cadeira cadeira1) {
        this.cadeira1 = cadeira1;
    }

    public Cadeira getCadeira2() {
        return cadeira2;
    }

    public void setCadeira2(Cadeira cadeira2) {
        this.cadeira2 = cadeira2;
    }

    public Cadeira getCadeira3() {
        return cadeira3;
    }

    public void setCadeira3(Cadeira cadeira3) {
        this.cadeira3 = cadeira3;
    }

    public Cadeira getCadeira4() {
        return cadeira4;
    }

    public void setCadeira4(Cadeira cadeira4) {
        this.cadeira4 = cadeira4;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", cadeira1=" + cadeira1 +
                ", cadeira2=" + cadeira2 +
                ", cadeira3=" + cadeira3 +
                ", cadeira4=" + cadeira4 +
                '}';
    }


}
