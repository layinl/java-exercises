package br.com.alura.screenmatch.operations;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Title title) {
        System.out.println("Adicionando duração em minutos de " + title);
        this.totalTime += title.getDurationInMinutes();
    }
}
