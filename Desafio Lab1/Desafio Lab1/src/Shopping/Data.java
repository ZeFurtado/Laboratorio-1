package Shopping;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void Data(int dia, int mes, int ano){
        if(dia>0 && dia<=31 && mes>0 && mes<=12 && ano>0) {

            //Se o mês for fevereiro, verifica se o ano é bissexto para receber mais de 28 dias
            if(mes == 2){
                int anoBissexto = ano; //Variavel criada para calcular se o ano é bissexto

                while(anoBissexto > 4){
                    anoBissexto = anoBissexto / 4;
                }
                if(dia>28 || anoBissexto !=1 ){
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }else{
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
            }
            else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31){

                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;

            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

                this.dia = dia;
                this.mes = mes;
                this.ano = ano;

            } else {
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            }

        }else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return dia;
    }


    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
        return mes;
    }


    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public String toString(){
        return  ""+dia+"/"+mes+"/"+ano;
    }

    public boolean verificaAnoBissexto(){
        while(ano > 4){
            ano = ano / 4;
        }

        if(ano == 1){
            return true;
        }else{
            return false;
        }
    }
}

