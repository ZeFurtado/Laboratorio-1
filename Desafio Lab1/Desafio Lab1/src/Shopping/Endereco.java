package Shopping;

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String complemento;


    public void Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.complemento = complemento;
    }

    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua = nomeDaRua;
    }
    public String getNomeDaRua()
    {
        return nomeDaRua;
    }


    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return cidade;
    }


    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }


    public void setPais(String pais){
        this.pais = pais;
    }
    public String getPais(){
        return pais;
    }


    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return cep;
    }


    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public String getComplemento(){
        return complemento;
    }

    public String toString()
    {
        return  "Rua: "+nomeDaRua+".\n"+
                "Cidade: "+cidade+".\n"+
                "Estado: "+estado+".\n"+
                "Pais: "+pais+".\n"+
                "CEP: "+cep+".\n"+
                "Complemento: "+complemento+".\n";
    }


}
