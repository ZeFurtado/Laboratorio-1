package Exercicios;

public class Exercicios {

    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("=== Exercicio 1 ===");
        exercicios.exercicio1(array);

        System.out.println("=====");

        System.out.println("=== Exercicio 2 ===");
        exercicios.exercicio2(array);

        System.out.println("=====");

        System.out.println("=== Exercicio 3 ===");
        exercicios.exercicio3(array);


    }

    public void exercicio1(int[] array){
        int index = array.length - 1;
        while(index >= 0){
            System.out.println("Array posição ["+array[index]+"]");
            index--;
        }
    }

    public int[] exercicio2(int[] array){
        int index = array.length -1;
        int i = 0;
        int[] array2 = new int[array.length];

        while(index >= 0){
            array2[i] = array[index];
            System.out.println("Array posição ["+array2[i]+"]");
            index--;
            i++;
        }
        return array2;
    }

    public int[] exercicio3(int[] array){

        int index = 0;
        int qtdDeNumPares = 0;
        int[] array2 = new int[array.length];
        int[] arrayPares;

        while(index <= array.length - 1){
            if(array[index] % 2 == 0){
                array2[qtdDeNumPares] = array[index];
                qtdDeNumPares++;
                index++;
            }else {
                index++;
            }
        }
        arrayPares = new int[qtdDeNumPares];

        for (int i = 0; i < qtdDeNumPares; i++){
            arrayPares[i] = array2[i];
        }

        for (int i:
                arrayPares) {
            System.out.println(i);
        }

        return arrayPares;
    }





}
