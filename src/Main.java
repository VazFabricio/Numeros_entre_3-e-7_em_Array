import java.util.Random;

public class Main {
    private static int quantidadeEntre3e7 (int [][] numeros){
        int quantidade = 0;
        for (int i = 0; i< numeros.length; i++){
            for (int j = 0; j<numeros[i].length; j++){
                if(numeros[i][j] > 3 && numeros[i][j] < 7){
                    quantidade++;
                }
            }
        }
        return quantidade;
    }
    private static void exibreArray (int [][] array){
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int [][] numeros = new int[3][5];
        for (int i = 0; i< numeros.length; i++){
            for (int j = 0; j<numeros[i].length; j++){
                numeros[i][j] = aleatorio.nextInt(0, 10);
            }
        }

        System.out.println("----------");
        exibreArray(numeros);
        System.out.println("----------");
        int quantidade = quantidadeEntre3e7(numeros);
        System.out.println("A quantidade de numeros entre 3 e 7 é: "+quantidade);
    }
}