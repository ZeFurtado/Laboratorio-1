package Exercicio_Livro;

public class Principal {
    public static void main(String[] args) {


        String nomedoCliente;

        Livro livro1 = new Livro("Viagem ao centro da Terra", "Júlio Verne", 1959, 1500.00, 258);

        Cliente osvaldir = new Cliente("Osvaldir Prado", 55, 'M', "osv@gmail.com", "Past3lzinh0", livro1);
        Cliente milton = new Cliente("Milton Ferreira", 58, 'M', "miltinhoreidelaxx@yahoo.com", "Condor08*", livro1);

        System.out.print("O cliente: " +osvaldir.getNome()+ " está com o livro: " +livro1.getNome()+ " e o preço por página deste livro é R$:" +livro1.calcularPrecoPorPagina());
    }
}
