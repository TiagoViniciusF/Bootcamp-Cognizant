Simples programinha para exemplificação de Herança e Polimorfismo.


A Classe Funcionario é a Classe mãe, com o método bonficação para ser implementado.

As classes Analista e Gerente herdam da classe Funcionario.
E emplementam o método bonificação(), de acordo com o tipo de funcionario.

<h3>Classe Gerente</h3>
```shell script
   
public class Gerente extends Funcionario{
    @Override
    public double bonificacao(double salario) {
       salario = salario * 0.10;
        return salario;
    }
 }
 ```

<h3>Classe Analista</h3>

```
public class Analista extends Funcionario{
    @Override
    public double bonificacao(double salario) {
      salario = salario * 0.03;
        return salario;
    }
}
```
Gerente possui uma porcentagem maior de bonificação que analista.