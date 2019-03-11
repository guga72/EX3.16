package br.edu.ifsp.spo.lp1a3.sp3013324.cap3;
import java.util.Scanner;

public class HeartHates {
    String nome;
    String sobrenome;
    int dia;
    int mes;
    int ano;

    public  HeartHates(Scanner x){
        System.out.print("Qual o seu 1 nome:");
        this.nome = x.next();
        System.out.print("Qual o seu sobrenome:");
        this.sobrenome = x.next();
        System.out.print("Qual o seu dia:");
        this.dia = x.nextInt();
        System.out.print("Qual o seu mês:");
        this.mes = x.nextInt();
        System.out.print("Qual o seu ano:");
        this.ano = x.nextInt();
    }

    public int calculaidade(int ano, int mes) {
        int idade = 0;
        if(mes > 3 && dia < 12){
            ano = ano + 1;
        }
        idade = 2019 - ano;
        return idade;
    }

    public int batimentoCardiacoMax(int idade, int constante){
        int freqmax = constante - idade;
        return freqmax;
    }
    public double batimentoCardiaco1(int freqmax){
        double freqsup1 = 0;
        freqsup1 = freqmax * 0.5;
        return freqsup1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double batimentoCardiaco2(int freqmax){
        double freqsup2 = 0;
        freqsup2 = freqmax * 0.85;
        return freqsup2;
    }
}
