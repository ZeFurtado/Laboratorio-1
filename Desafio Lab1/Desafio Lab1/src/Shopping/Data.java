package Shopping;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if(dia>0 && dia<=31 && mes>0 && mes<=12 && ano>0) {
            //Se o mês for fevereiro, verifica se o ano é bissexto para receber mais de 28 dias
            if(mes == 2){
                if(dia<29){ //Se o dia for menor que 29 idependente do ano ele passa
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }else if(dia == 29 && verificaAnoBissexto()){ //Se o dia for igual a 29 o ano precisa ser bissexto
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }else{
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }//Caso o dia for menor que 31 ele pode ser inserido nesses meses
            else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;

              //Caso o dia for maior 31 ele só pode ser inserido nesses meses
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
        if(dia>0 && dia<=31){
            if(mes == 2){
                if(dia<29){ //Se o dia for menor que 29 idependente do ano ele passa
                    this.dia = dia;
                }else if(dia == 29 && verificaAnoBissexto()){ //Se o dia for igual a 29 o ano precisa ser bissexto
                    this.dia = dia;
                }else{
                    this.dia = 1;
                }
            }
            //Caso o dia for menor que 31 ele pode ser inserido nesses meses
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31) {
            this.dia = dia;
        }//Caso o dia for maior 31 ele só pode ser inserido nesses meses
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            this.dia = dia;
        }
        else if(mes == 0){
            this.dia = dia;
        }//Caso nenhuma das alternativas anteriores der certo o dia vai ficar como 1
        else{
            this.dia = 1;
        }
    }
    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }else {
            this.mes = 1;
        }

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
        while(ano >= 4){
            ano = ano - 4;
        }
        if(ano == 0){
            return true;
        }else{
            return false;
        }
    }
}

