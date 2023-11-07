package Shopping;

public class Principal {
    public static void main(String[] args){
        int opcao;

        StringBuilder opcoes = new StringBuilder();
        opcoes.append("\nDigite uma opção: \n");
        opcoes.append("(1) Criar uma loja \n");
        opcoes.append("(2) Criar um produto \n");
        opcoes.append("(3) Sair");

        do{
            System.out.println(opcoes);
            opcao = Teclado.leInt();

            if(opcao == 1 || opcao == 2 || opcao == 3){
                switch (opcao){

                    case 1:
                        //Valores para o construtor da Loja
                        System.out.println("Digite o nome da Loja:");
                        String nomeDaLoja = Teclado.leString();
                        System.out.println("Digite a quantidade de funcionários:");
                        int quantidadeDeFuncionarios = Teclado.leInt();
                        System.out.println("Digite o salário base dos funcionários:");
                        double salarioBaseFuncionario = Teclado.leDouble();

                        //Valores do construtor do Endereço
                        System.out.println("Digite o nome da rua da loja:");
                        String nomeDaRua = Teclado.leString();
                        System.out.println("Digite a cidade:");
                        String cidade = Teclado.leString();
                        System.out.println("Digite as iniciais do estado (Ex. RS, MG, SP): ");
                        String estado = Teclado.leString();
                        System.out.println("Digite o nome do país:");
                        String pais = Teclado.leString();
                        System.out.println("Digite o número do CEP:");
                        String cep = Teclado.leString();
                        System.out.println("Digite o número do local:");
                        String numero = Teclado.leString();
                        System.out.println("Digite algum complemento");
                        String complemento = Teclado.leString();

                        //Valores para a criação da data
                        System.out.println("Digite o dia da fundação da Loja:");
                        int dia = Teclado.leInt();
                        System.out.println("Digite o mês da fundação da Loja");
                        int mes = Teclado.leInt();
                        System.out.println("Digite o ano da funfação da Loja (Ex. 1995): ");
                        int ano = Teclado.leInt();

                        //Agora é chamado os contrutes de cada classe (Data, Endereço e Loja) para criar o objeto da Loja
                        Data data = new Data(dia, mes, ano);
                        Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                        Loja loja = new Loja(nomeDaLoja, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, data);

                        System.out.println();
                        System.out.println();
                        System.out.println("Foi criada a loja: ");
                        System.out.println(loja.toString());
                        break;

                    case 2:


                        break;

                    case 3:
                        System.out.println("Bye! Bye!");
                        break;

                }
            }else{
                System.out.println("Opção Inválida");
            }


        }while(opcao != 3);

    }

}
