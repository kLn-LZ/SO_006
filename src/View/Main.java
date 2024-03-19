package View;

import Controller.ThreadVetor;

public class Main {
    public static void main(String[] args) {

        int[] vet = new int[1000];

        for (int i = 0; i < 1000; i++) {

            vet[i] = (int) (Math.random() * 100) + 1;

        }

        Thread ThreadV1 = new ThreadVetor(2, vet);
        ThreadV1.run();

        Thread ThreadV2 = new ThreadVetor(1, vet);
        ThreadV2.run();


    }
}
