import java.util.Scanner;

public class somandoNumeros {
    public static void main(String[] args) {

        int numero, soma =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que vc quer somar: ");
        numero = sc.nextInt();

        for(int i = numero; i>=0; i--){
            soma = soma + i;
        }
        System.out.println(soma);


    }
}
