package com.wadyjorge.corridamotos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CorridaMotos {

    private static final int TOTAL_COMPETIDORES = 10;
    private static final int TOTAL_CORRIDAS = 10;

    private final List<Competidor> competidores = new ArrayList<>();
    private final AtomicInteger chegada = new AtomicInteger(0);

    public CorridaMotos() {
        // Cria os competidores
        for (int i = 0; i < TOTAL_COMPETIDORES; i++) {
            competidores.add(new Competidor("Competidor #" + (i + 1)));
        }

        // Realiza as corridas
        for (int i = 0; i < TOTAL_CORRIDAS; i++) {
            realizarCorrida();
        }

        // Exibe o resultado final do campeonato
        exibirResultadoFinal();
    }

    private void realizarCorrida() {
        List<Thread> threads = new ArrayList<>();
        chegada.set(0); // Reinicia o contador de chegadas

        for (Competidor competidor : competidores) {
            threads.add(new Thread(competidor));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Corrida concluída. Pontuação atual:");
        for (Competidor competidor : competidores) {
            System.out.println(competidor.nome + " com " + competidor.pontos + " pontos");
        }
    }

    private void exibirResultadoFinal() {
        System.out.println("\n========== Pódio =========");
        competidores.sort((c1, c2) -> Integer.compare(c2.pontos, c1.pontos));

        for (int i = 0; i < 3; i++) {
            Competidor competidor = competidores.get(i);
            System.out.println(competidor.nome + " com " + competidor.pontos + " pontos");
        }

        System.out.println("\n==== Tabela de Pontos ====");
        for (Competidor competidor : competidores) {
            System.out.println(competidor.nome + " com " + competidor.pontos + " pontos");
        }
    }

    public static void main(String[] args) {
        new CorridaMotos();
    }

    private class Competidor implements Runnable, Comparable<Competidor> {
        private final String nome;
        private int pontos;
        private int posicaoChegada;

        public Competidor(String nome) {
            this.nome = nome;
            this.pontos = 0;
        }

        @Override
        public void run() {
            try {
                Thread.sleep((int) (Math.random() * 1000)); // Simula o tempo de corrida
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Acessa a região crítica (linha de chegada)
            posicaoChegada = chegada.incrementAndGet(); // Atualiza a posição de chegada de forma atômica
            pontos += TOTAL_COMPETIDORES - posicaoChegada + 1; // Calcula os pontos com base na posição
        }

        @Override
        public int compareTo(Competidor o) {
            return Integer.compare(this.posicaoChegada, o.posicaoChegada);
        }
    }
}
