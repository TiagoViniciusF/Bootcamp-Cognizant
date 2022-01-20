import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.setNome("Tiago");
        Conta cc = new ContaCorrente(cliente);
        cc.clienteList = new ArrayList<>();
        cc.depositar(100);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Roberta");
        Conta cc1 = new ContaCorrente(cliente1);
        cc1.depositar(200);
        cc1.imprimirExtrato();

        cc.clienteList.add(cliente.getNome());
        cc.clienteList.add(cliente1.getNome());
        Conta cp = new ContaPoupanca(cliente);
        cc.transferir(100,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.imprimirListaClientes();


    }
}
