

public class Main {

    public static void main(String[] args) {

       Gerente gerente = new Gerente();
       Analista analista = new Analista();


        System.out.println("Bonoficação Analista " + analista.bonificacao(250d));
        System.out.println("Bonoficação Gerente " + gerente.bonificacao(250d));

    }
}
