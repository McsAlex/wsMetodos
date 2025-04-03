import java.util.Scanner;

public class MetodoSomatoria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2 = 0;
        System.out.println("Digite os dois valores inteiros para a soma:");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        entrada.close();
        soma(num1, num2);
    }

    public static void soma(int num1, int num2) {
        int somador = num1 + num2;
        System.out.println(somador);
        return;
    }
}
