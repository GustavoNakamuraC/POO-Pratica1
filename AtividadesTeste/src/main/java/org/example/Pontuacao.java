package org.example;

public class Pontuacao {
    private int pontuacao;

    //PontuacaoTest não pede construtor

    public int getPontuacao() {
        return pontuacao;
    }

    public void adicionarPontos(int pontos) {
        pontuacao += pontos;
    }

    public void removerPontos(int pontos) {
        if (pontuacao >= pontos){
            pontuacao -= pontos;
        }
    }
}
