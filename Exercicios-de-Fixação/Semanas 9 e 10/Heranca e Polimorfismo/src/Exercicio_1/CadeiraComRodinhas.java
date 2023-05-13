package Exercicio_1;

public class CadeiraComRodinhas {
    private Data dataUltimaManutencao;

    public CadeiraComRodinhas(Data dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    public Data getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Data dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    @Override
    public String toString() {
        return "CadeiraComRodinhas{" +
                "dataUltimaManutencao=" + dataUltimaManutencao +
                '}';
    }

}
