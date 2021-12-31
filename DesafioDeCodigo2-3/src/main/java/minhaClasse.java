import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);



        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();
        int num4 = leitor.nextInt();
        int num5 = leitor.nextInt();

        List<Integer> lista = new ArrayList<>();
        lista.add(num1);
        lista.add(num2);
        lista.add(num3);
        lista.add(num4);
        lista.add(num5);

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        for (int aux = 0; aux < 5 ; aux ++) {



            if (lista.get(aux) % 2 == 0 && lista.get(aux) > 0 && lista.get(aux) != 0) {
                par++;
                positivo++;

            }else if(lista.get(aux) % 2 != 0 && lista.get(aux) < 0 && lista.get(aux) != 0) {
                impar++;
                negativo++;

            }else if(lista.get(aux) % 2 == 0 && lista.get(aux) < 0 && lista.get(aux) != 0) {
                negativo++;
                par++;

            }else if(lista.get(aux) % 2 != 0 && lista.get(aux) > 0 && lista.get(aux) != 0) {
                impar++;
                positivo++;

            }else par ++;
        }

        System.out.println( par + " par(es)");
        System.out.println( impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println( negativo + " negativo(s)");
    }
}

