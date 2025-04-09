import java.util.Scanner;
public class MetodoPerfeito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0, numAux=0;
        
        System.out.println("Digite o numero inteiro que deseja verificar se e um perfeito: ");
        numero = entrada.nextInt();
        entrada.close();
        ehPerfeito(numero);
        numAux=ehPerfeito(numero);
        if(numAux==numero){
            System.out.println("Este e um numero perfeito!");
        }
        else{
            System.out.println("Este nao e um numero perfeito!");
        }
        //System.out.println(numAux+" "+numero);

    }
        public static int ehPerfeito(int numero){
            int aux =0;
            for(int i = 1; i<numero;i++){
                if(numero%i==0){
                    aux += i;
                }
            }
            return aux;
        }
}
