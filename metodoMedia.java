import java.util.Scanner;
public class MetodoMedia {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        double nota1,nota2= 0.0;
        double resultado =0.0;
        String parametro1 = "A", parametro2="P", verificador;
    
        System.out.println("Digite o qual o tipo de media que deseja usar: \n"+
        "[A - Media aritmetica]                [2 - Media ponderada]");
        verificador = entrada.nextLine().toUpperCase();
        System.out.println("Digite as suas notas: ");
        nota1=entrada.nextDouble();
        nota2=entrada.nextDouble();
        entrada.close();

        if(verificador==parametro1){
            mediaAritmetica(nota1, nota2);
        }
        else if(verificador==parametro2){
            mediaPonderada(nota1, nota2);
        }
        else{
            System.out.println("Opcao invalida de media!");
        }

        if(verificador==parametro1){
            resultado=mediaAritmetica(nota1, nota2);
            System.out.println("Resultado da media e: "+resultado);
        }
        else{
            resultado=mediaPonderada(nota1, nota2);
            System.out.println("Resultado da media e: "+resultado);
        }

    }


    public static double mediaAritmetica(double nota1, double nota2){
        double media = (nota1+nota2)/2;
        return media;
    }
    
    public static double mediaPonderada(double nota1, double nota2){
    double media = ((nota1*7)+(nota2*3))/10;
    return media;

    }

}
