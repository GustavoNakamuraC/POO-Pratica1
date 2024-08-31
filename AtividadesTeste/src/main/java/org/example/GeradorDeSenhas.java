package org.example;

import java.util.Random;

public class GeradorDeSenhas {
    private String alfabetoMin = "abcdefghijklmnopqrstuvwxyz";
    private String alfabetoMai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String numeros = "0123456789";
    private String simbolos = "!@#$%^&*()-_=+[]{}|;:',.<>?/";
    private String senha = "";

    //GeradorDeSenhasTest não pede construtor.

    public String gerarSenha(int qtd, boolean min, boolean mai, boolean num, boolean sim) {
        Random gerador = new Random();
        int cont;

        if(!min && !mai && !num && !sim){
            System.out.println("Escolha um tipo de caractere!!");
        }else{
            while(qtd != 0) {
                int val = qtd;
                cont = gerador.nextInt(4);
                switch (cont){
                    case 0:{
                        if(min){
                            int letra = gerador.nextInt(26);
                            senha += alfabetoMin.charAt(letra);
                            qtd -= 1;
                        }
                        break;
                    }
                    case 1:{
                        if(mai){
                            int letra = gerador.nextInt(26);
                            senha += alfabetoMai.charAt(letra);
                            qtd -= 1;
                        }
                        break;
                    }
                    case 2:{
                        if(num){
                            int numero = gerador.nextInt(10);
                            senha += numeros.charAt(numero);
                            qtd -= 1;
                        }
                        break;
                    }
                    case 3:{
                        if(sim){
                            int simb = gerador.nextInt(28);
                            senha += simbolos.charAt(simb);
                            qtd -= 1;
                        }
                        break;
                    }
                }
            }
        }
        return senha;
    }
}