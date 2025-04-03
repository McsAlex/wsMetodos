import java.util.Scanner;

public class MetodoTabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite ate qual tabuada deseja ver: ");
        numero = entrada.nextInt();
        entrada.close();

        visualizaTabuada(numero);
    }

    public static void visualizaTabuada(int numero) {
        int numTabuada = 0;
        System.out.println("TABUADA:");

        for(int i=0; i<=numero; i++){
            System.out.println("Tabuada do "+i);
            for(int j=1; j<=10; j++){
                
                System.out.println(i+"*"+j+"="+(numTabuada*j)+" ");
            }
            System.out.println();
            numTabuada++;
        }
        
    }
}
