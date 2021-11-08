import java.io.IOException;

public class QuickSort {

    public static void main(String[] args) throws IOException {

        int quantidade = 200000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        quickSort(vetor,0,vetor.length-1);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Caso médio = " + (tempoFinal - tempoInicial) + " ms");

        for(int i=0; i <vetor.length; i++) {
            vetor[i]=i+1;
        }


        tempoInicial = System.currentTimeMillis();

        quickSort(vetor,0,vetor.length-1);

        tempoFinal = System.currentTimeMillis();

        System.out.println("Melhor caso = " + (tempoFinal - tempoInicial) + " ms");

        for(int i=0; i<vetor.length; i++ ) {
            vetor[i]=quantidade-i;
        }

        tempoInicial = System.currentTimeMillis();

        quickSort(vetor,0,vetor.length-1);

        tempoFinal = System.currentTimeMillis();

        System.out.println("Pior caso = " + (tempoFinal - tempoInicial) + " ms");


    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int meio = (int)((inicio+fim)/2);
        int pivo = vetor[meio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
