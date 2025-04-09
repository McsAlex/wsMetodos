import java.util.Scanner;

public class MetodoConceito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3 = 0;
        double resultado = 0.0;
        String conceito = "";

        System.out.println("Digite as 3 notas do aluno");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();
        entrada.close();

        emitirConceito(nota1,nota2,nota3);
        resultado = emitirConceito(nota1,nota2,nota3);
        if(resultado>=0.0 && resultado<=4.9){
            conceito = "D";
        }
        else if(resultado>=5.0 && resultado<= 6.9){
            conceito = "C";
        }
        else if(resultado>=7.0 && resultado<=8.9){
            conceito = "B";
        }
        else if(resultado>=9.0 && resultado<=10.0){
            conceito = "A";
        }
        else{
            System.out.println("Valor invalido!!!");
        }
        System.out.println("O conceito do aluno e: "+ conceito);
    }

    public static double emitirConceito(double nota1,double nota2,double nota3){
        double mediaConceito = (nota1+nota2+nota3)/3;
        return mediaConceito;
    }
}
