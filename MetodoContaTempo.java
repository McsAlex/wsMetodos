import java.util.Scanner;

public class MetodoContaTempo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int segundos = 0;

        System.out.println("Digite o tempo em segundos que a fabrica ira operar: ");
        segundos = entrada.nextInt();
        verificarTempo(segundos);
        entrada.close();
    }

    public static void verificarTempo(int segundos) {
        int segundo = segundos;
        int minutos = segundo / 60;
        segundo %= 60;

        int hora = minutos / 60;
        minutos %= 60;

        int dias = hora / 24;
        hora %= 24;

        System.out.println("O tempo relativo é: \n" +
                dias + " dias, " + hora + " horas, " + minutos + " minutos e " + segundo + " segundos.");
    }

}
