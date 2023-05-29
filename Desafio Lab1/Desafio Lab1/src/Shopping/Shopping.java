package Shopping;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int qtdDeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdDeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {

        StringBuilder resumo = new StringBuilder();
        resumo.append("Nome do SHooping: "+nome+"\n");
        resumo.append("Endereço: "+endereco+"\n");
        resumo.append("Quantidade de Lojas: "+lojas.length+"\n");

        return resumo.toString();
    }

    public boolean insereLoja(Loja novaLoja){
        int index = 0;
        while(index <= this.lojas.length - 1){
            if(this.lojas[index] == null){
                this.lojas[index] = novaLoja;
                return true;
            }else{
                index++;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeDaLoja){
        int index = 0;
        while(index <= this.lojas.length - 1){
            if((this.lojas[index] != null) && (this.lojas[index].getNome() == nomeDaLoja)){
                this.lojas[index] = null;
                return true;
            }else{
                index++;
            }
        }
        return false;
    }

    public int  quantidadeLojasPorTipo(String tipoDeLoja){
        int numDeLojas = 0;

        switch (tipoDeLoja){
            case "Alimentação", "Alimentacao", "alimentação", "alimentacao":
                for (Loja tipoLoja:
                        this.getLojas()) {
                    if(tipoLoja.getClass() == Alimentacao.class){
                        numDeLojas++;
                    }
                }
                break;


            case "Bijuteria", "bijuteria":
                for (Loja tipoLoja:
                        this.getLojas()) {
                    if(tipoLoja.getClass() == Bijuteria.class){
                        numDeLojas++;
                    }
                }
                break;

            case "Cosmético", "Cosmetico", "cosmético", "cosmetico":
                for (Loja tipoLoja:
                        this.getLojas()) {
                    if(tipoLoja.getClass() == Cosmetico.class){
                        numDeLojas++;
                    }
                }
                break;

            case "Informática", "Informatica", "informática", "informatica":
                for (Loja tipoLoja:
                        this.getLojas()) {
                    if(tipoLoja.getClass() == Informatica.class){
                        numDeLojas++;
                    }
                }
                break;

            case "Vestuário", "Vestuario", "vestuário", "vestuario":
                for (Loja tipoLoja:
                        this.getLojas()) {
                    if(tipoLoja.getClass() == Vestuario.class){
                        numDeLojas++;
                    }
                }
                break;

            default:
                return -1;

        }

        return numDeLojas;

    }

    public Informatica lojaSeguroMaisCaro(){
        double seguroMaisCaro = 0;
        Informatica lojaComSeguroMaisCaro = null;

        for (Loja lojasDeInfo:
                this.getLojas()) {
            if(lojasDeInfo.getClass() == Informatica.class){
                if (((Informatica) lojasDeInfo).getSeguroEletronicos() > seguroMaisCaro){
                    seguroMaisCaro = ((Informatica) lojasDeInfo).getSeguroEletronicos();
                    lojaComSeguroMaisCaro = (Informatica) lojasDeInfo;
                }
            }
        }
        return lojaComSeguroMaisCaro;
    }


}
