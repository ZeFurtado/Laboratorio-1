package TesteHerancaPolimorfismo;

public class Main {


    public static void main(String[] args) {
        Criança kid;
        Adulto adult;
        kid = new Criança("Enzo", 12, "44151515", "Marista", 5);
        adult = new Adulto("Sebastião", 42, "2554521318", "Omar Autopeças", 2500);

        Pessoa p = new Adulto("Sebastião", 42, "2554521318", "Omar Autopeças", 2500);

        Adulto adulto = (Adulto) p;

        System.out.println("Estas são as informações do Adulto: " + adulto.MetodoDeTeste());
        System.out.println("Estas são as informações da Criança: " + kid.toString());
        kid.MetodoSuperClasse();

    }

}
