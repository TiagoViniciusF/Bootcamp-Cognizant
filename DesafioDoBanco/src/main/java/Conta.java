import java.util.List;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> clienteList;





    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public void imprimirListaClientes() {
        for (int i = 0; i < clienteList.size(); i++) {
            System.out.println(clienteList.get(i));
        }
    }

    public void sacar(double valor) {
        if(this.saldo < valor) {
            System.out.println("Saldo Insufuciente para saque");
        }else{
            this.saldo -= valor;
        }

    }

    public void depositar(double valor){
        saldo += valor;

    }

    public void transferir(double valor, Conta contadDestino){
        if(this.saldo < valor) {
            System.out.println("Saldo Insufuciente para transferencia");
        }else {
            this.sacar(valor);
            contadDestino.depositar(valor);
        }
    }

    protected void imprimirExtrato(){
        System.out.println(String.format("Titular: %s" ,this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d" ,this.agencia));
        System.out.println(String.format("Numero: %d" ,this.numero));
        System.out.println(String.format("Saldo: %.2f" ,this.saldo));
    }



    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
