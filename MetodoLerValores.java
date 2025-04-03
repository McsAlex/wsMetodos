import java.util.Scanner;
public class MetodoLerValores {
    public static void main (String[] args){
        int vetor[]= new int[10];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite os 10 valores inteiros: ");
        for(int i =0; i < vetor.length; i++){
            vetor[i]=entrada.nextInt();
        }
        entrada.close();

        lerVetor(vetor);
    }

    public static void lerVetor(int[] vetor){
        int maior=0;
        int menor = vetor[0];

        for(int i =0; i<vetor.length; i++){
            if(vetor[i]>maior){
                maior=vetor[i];
            }
        }
        for(int i=0; i<vetor.length; i++){
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
        System.out.println("O maior valor e: "+maior+"\n"+
        "O menor valor e: "+menor);
    }
}
