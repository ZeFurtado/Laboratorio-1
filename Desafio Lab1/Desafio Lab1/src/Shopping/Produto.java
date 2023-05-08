package Shopping;

public class Produto {
   private String nome;
   private double preco;
   private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade)
   {
       this.nome = nome;
       this.preco = preco;
       this.dataValidade = dataValidade;
   }

   public void setNome(String nome)
   {
       this.nome = nome;
   }
   public String getNome(){
       return nome;
   }

   public void setPreco(double preco){
        this.preco = preco;
   }

    public double getPreco() {
        return preco;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
   }

    public Data getDataValidade() {
        return dataValidade;
    }

    public boolean estaVencido(Data dataValidade){
        if(dataValidade.getAno() > this.dataValidade.getAno()){
            return true;
        }else if(dataValidade.getMes() > this.dataValidade.getMes()){
            return true;
        } else if (dataValidade.getDia() > this.dataValidade.getDia()) {
            return true;
        }else {
            return false;
        }
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Produto: " + nome + "\n");
        stringBuilder.append("Preço R$:" + preco + "\n");
        stringBuilder.append("Data de Validade: " +dataValidade+ "\n");

        return stringBuilder.toString();
    }
}
