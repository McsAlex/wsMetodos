import java.util.Scanner;

public class MetodoVerificaValor {
    public static void main(String[] args) {
        int valor = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para verificação de par/ímpar:");
        valor = entrada.nextInt();
        entrada.close();
        verificaValor(valor); //chama o método
    }

    public static void verificaValor(int valor){
        valor = valor%2;
        if (valor==0){
        System.out.println("O valor é par!");
    }
        else{
            System.out.println("O valor é ímpar!");
        }
    }
}