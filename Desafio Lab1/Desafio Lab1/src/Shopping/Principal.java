package Shopping;

public class Principal {
    public static void main(String[] args){
        int opcao;
        Endereco enderecoLoja1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
        Data dataFundacaoLoja1 = new Data(10, 3, 2023);

        StringBuilder opcoes = new StringBuilder();
        opcoes.append("\nDigite uma opção: \n");
        opcoes.append("(1) Criar uma loja \n");
        opcoes.append("(2) Criar um produto \n");
        opcoes.append("(3) Sair");
        do{
            opcao = Teclado.leInt(opcoes.toString());

            if(opcao == 1 || opcao == 2 || opcao == 3){
                switch (opcao){

                    case '1':
                        Loja lojaTeste = new Loja("Loja1", 5, 3000.00, enderecoLoja1, dataFundacaoLoja1);
                        break;

                    case '2':


                        break;

                    case '3':
                        System.out.println("Bye! Bye!");
                        break;

                }
            }else{
                System.out.println("Opção Inválida");
            }


        }while(opcao != 3);

    }

}
