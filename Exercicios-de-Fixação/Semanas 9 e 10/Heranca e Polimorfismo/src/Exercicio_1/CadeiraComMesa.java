package Exercicio_1;

public class CadeiraComMesa {
    private int largura;
    private int profundidade;

    public CadeiraComMesa(int largura, int profundidade) {
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "CadeiraComMesa{" +
                "largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
