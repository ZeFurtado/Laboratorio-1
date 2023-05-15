package Shopping;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if(validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else {
            System.out.println("A data é inválida");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public void setDia(int dia){
        if(validaData(dia, this.mes, this.ano)){
            this.dia = dia;
        }else{
            System.out.println("Dia inválido");
        }
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        if(validaData(this.dia, mes, this.ano)){
            this.mes = mes;
        }else{
            System.out.println("Mês inválido");
        }

    }
    public int getMes(){
        return mes;
    }

    public void setAno(int ano){
        if(validaData(this.dia, this.mes, ano)){
            this.ano = ano;
        }else{
            System.out.println("O ano é inválido");
        }
    }
    public int getAno(){
        return ano;
    }

    public String toString(){
        return  ""+dia+"/"+mes+"/"+ano;
    }


    public boolean validaData(int dia, int mes, int ano){
        if(dia>0 && dia<=31){
            if(mes == 2){
                if(dia<29){ //Se o dia for menor que 29 idependente do ano ele passa
                    return true;
                }else if(dia == 29 && verificaAnoBissexto(ano)){ //Se o dia for igual a 29 o ano precisa ser bissexto
                    return true;
                }else{
                    return false;
                }
                //Caso o dia for menor que 30 ele pode ser inserido aqui
            }else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31) {
                return true;
            }   //Caso o dia for maior 31 ele só pode ser inserido nesses meses
            else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                return true;
            }   //Caso nenhuma das alternativas anteriores der certo a data não é validada
            else {
                return false;
            }
        }else { //Caso o dia for maior que 31 ou menor que zero a data é invalidada
            return false;
        }
    }

    public boolean verificaAnoBissexto(){
        while(this.ano >= 4){
            this.ano = this.ano - 4;
        }
        if(this.ano == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean verificaAnoBissexto(int ano){
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

