import java.util.ArrayList;

public class Calculadora {
    public static int somar(int a,int b){
        return a+b;
    }
    public static int subtrair(int a,int b){
        return a-b;
    }
    public static int multiplicar(int a,int b){
        return a*b;
    }
    public static float dividir(int a,int b){
        return a/b;
    }

    public static int somar(int[] valores){
        int resultado = 0;
        for(int numero:valores){
            resultado+=numero;
        }
        return resultado;
    }
    public static int subtrair(int[] valores){
        int resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }
        return resultado;
    }
    public static int[] multiplicar(int[] valores,int multiplicador){
        int[] resultado = new int[valores.length];

        for (int i = 0; i<valores.length;i++){
            resultado[i] = valores[i] * multiplicador;
        }
        return resultado;
    }
    public static float dividir(int[] valores){
        int par = 0;
        int impar = 0;
        int resultado = 0;

        for (int i = 0;i< valores.length; i++){
            if (i%2==1){
                impar+=valores[i];
            }else {
                par +=valores[i];
            }
        }
        return par/impar;
    }
}
