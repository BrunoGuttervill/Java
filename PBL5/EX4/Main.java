import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] c = {9,3};
        System.out.println("Soma: "+Calculadora.somar(1,2));
        System.out.println("Soma: "+Calculadora.somar(c));
        System.out.println("Subtração: "+Calculadora.subtrair(1,3));
        System.out.println("Subtração: "+Calculadora.subtrair(c));
        System.out.println("Multiplicação: "+Calculadora.multiplicar(9,2));
        System.out.print("Multiplicação: ");
                for(int numero:Calculadora.multiplicar(c,2)){
                    System.out.println(numero+" ");
                }
        System.out.println("Divisão: "+Calculadora.dividir(10,2));
        System.out.println("Divisão: "+Calculadora.dividir(c));


    }
}