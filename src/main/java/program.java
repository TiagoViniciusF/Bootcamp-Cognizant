import java.io.IOException;
import java.util.Scanner;

public class program {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X, Y, soma = 0;
        int N = leitor.nextInt();

        for(int i = 0;i<N;i++){
            X = leitor.nextInt();
            Y = leitor.nextInt();
            if(Y<X)
            {
                var aux = X;
                X = Y;
                Y = aux;
            }
            for(int j = 0; j < X; j++)
            {
                if(Y % 2 != 0){
                    soma = soma + j;
                    Y= Y+2;}
                else{
                    j = j-1;}

            }

            System.out.println(soma);
        }

    }

}
