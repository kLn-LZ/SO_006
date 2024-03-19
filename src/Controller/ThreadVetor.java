package Controller;

public class ThreadVetor extends Thread {

    private int optionNum;
    private int[] vet;

    public ThreadVetor(int optionNum, int[] vet) {

        this.optionNum = optionNum;
        this.vet = vet;

    }

    private void loopTime () {

        if (optionNum % 2 == 0) {

            double startTime = System.nanoTime();
            for(int i = 0; i < vet.length; i++) {

                System.out.print(vet[i] + " ");

            }

            double endTime = System.nanoTime();
            double finalTime = (endTime - startTime) / Math.pow(10,9);
            System.out.println("\n Tempo final PAR: " + finalTime);
        }

        else if (optionNum % 2 != 0) {

            double startTime = System.nanoTime();
            for(int i: vet) {

                System.out.print(i + " ");

            }
            double endTime = System.nanoTime();

            double finalTime = (endTime - startTime) / Math.pow(10,9);
            System.out.println("\n Tempo final Ímpar: " + finalTime);


        }



    }

    public void run() {
        loopTime();
    }


}
