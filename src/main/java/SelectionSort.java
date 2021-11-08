import java.io.IOException;

public class SelectionSort {

    public static void main(String[] args) throws IOException {

        int quantidade = 200000;
        int[] vetor = new int[quantidade];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        selectionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

        for(int i=0; i <vetor.length; i++) {
            vetor[i]=i+1;
        }

        tempoInicial = System.currentTimeMillis();

        selectionSort(vetor);

        tempoFinal = System.currentTimeMillis();

        System.out.println("Melhor caso = " + (tempoFinal - tempoInicial) + " ms");

        for(int i=0; i<vetor.length; i++ ) {
            vetor[i]=quantidade-i;
        }

        tempoInicial = System.currentTimeMillis();

        selectionSort(vetor);

        tempoFinal = System.currentTimeMillis();

        System.out.println("Pior caso = " + (tempoFinal - tempoInicial) + " ms");


    }

    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
    }

}
