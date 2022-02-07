public class Analista extends Funcionario{

    @Override
    public double bonificacao(double salario) {
      salario = salario * 0.03;
        return salario;
    }
}
