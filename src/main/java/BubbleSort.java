import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

    public static void main(String[] args) throws IOException {

        int quantidade = 20000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }
        /*
        System.out.println("Caso Médio");
        for(int i=0; i <vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        */


        long tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Caso médio = " + (tempoFinal - tempoInicial) + " ms");

        for(int i=0; i <vetor.length; i++) {
            vetor[i]=i+1;
        }
        /*
        System.out.println("\nMelhor Caso");
        for(int i=0; i <vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        */


        tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor);

        tempoFinal = System.currentTimeMillis();

        System.out.println("Melhor Caso = " + (tempoFinal - tempoInicial) + " ms");


        for(int i=0; i<vetor.length; i++ ) {
            vetor[i]=quantidade-i;
        }
        /*
        System.out.println("\nPior Caso");
        for(int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        */


        tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor);

        tempoFinal = System.currentTimeMillis();

        System.out.println("Pior Caso = " + (tempoFinal - tempoInicial) + " ms");


    }

    private static void bubbleSort(int vetor[]){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
