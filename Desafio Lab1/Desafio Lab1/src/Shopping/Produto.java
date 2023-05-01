package Shopping;

public class Produto {
   private String nome;
   private double preco;

   private Data dataDeValidade =  new Data();

   public void Produto(String nome, double preco)
   {
       this.nome = nome;
       this.preco = preco;
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

   public String toString(){
       return "O produto: " +nome+ "custa " +preco;
   }

   public void setDataDeValidade(){

   }

}
