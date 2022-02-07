public class Gerente extends Funcionario{

    @Override
    public double bonificacao(double salario) {
       salario = salario * 0.10;
        return salario;
    }
}
