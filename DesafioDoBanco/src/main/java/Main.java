import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.setNome("Tiago");
        Conta cc = new ContaCorrente(cliente);
        cc.clienteList = new ArrayList<>();
        cc.depositar(100);
        cc.imprimirExtrato();
        cc.sacar(150);

        System.out.println();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Roberta");
        Conta cc1 = new ContaCorrente(cliente1);
        cc1.depositar(200);
        cc1.imprimirExtrato();

        System.out.println();


        Cliente cliente3 = new Cliente();
        cliente3.setNome("Mariana");
        Conta cp = new ContaPoupanca(cliente3);
        cp.depositar(180);
        cp.imprimirExtrato();
        cp.transferir(200, cc1);



        System.out.println();

        cc.clienteList.add(cliente.getNome());
        cc.clienteList.add(cliente1.getNome());
        System.out.println("Lista Clientes, conta corrente:");
        cc.imprimirListaClientes();

        System.out.println();

        System.out.println("Lista Clientes, conta poupança:");
        cp.clienteList = new ArrayList<>();
        cp.clienteList.add(cliente3.getNome());
        cp.imprimirListaClientes();


    }
}
